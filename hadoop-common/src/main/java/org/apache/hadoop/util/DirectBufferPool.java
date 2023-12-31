package org.apache.hadoop.util;

import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

/**
 * A simple class for pooling direct ByteBuffers. This is necessary
 * because Direct Byte Buffers do not take up much space on the heap,
 * and hence will not trigger GCs on their own. However, they do take
 * native memory, and thus can cause high memory usage if not pooled.
 * The pooled instances are referred to only via weak references, allowing
 * them to be collected when a GC does run.
 *
 * This class only does effective pooling when many buffers will be
 * allocated at the same size. There is no attempt to reuse larger
 * buffers to satisfy smaller allocations.
 */
public class DirectBufferPool {

  // Essentially implement a multimap with weak values.
  final ConcurrentMap<Integer, Queue<WeakReference<ByteBuffer>>> buffersBySize =
      new ConcurrentHashMap<Integer, Queue<WeakReference<ByteBuffer>>>();

  /**
   * Allocate a direct buffer of the specified size, in bytes.
   * If a pooled buffer is available, returns that. Otherwise
   * allocates a new one.
   */
  public ByteBuffer getBuffer(int size) {
    Queue<WeakReference<ByteBuffer>> list = buffersBySize.get(size);
    if (list == null) {
      // no available buffers for this size
      return ByteBuffer.allocateDirect(size);
    }

    WeakReference<ByteBuffer> ref;
    while ((ref = list.poll()) != null) {
      ByteBuffer b = ref.get();
      if (b != null) {
        return b;
      }
    }

    return ByteBuffer.allocateDirect(size);
  }

  /**
   * Return a buffer into the pool. After being returned,
   * the buffer may be recycled, so the user must not
   * continue to use it in any way.
   * @param buf the buffer to return
   */
  public void returnBuffer(ByteBuffer buf) {
    buf.clear(); // reset mark, limit, etc
    int size = buf.capacity();
    Queue<WeakReference<ByteBuffer>> list = buffersBySize.get(size);
    if (list == null) {
      list = new ConcurrentLinkedQueue<WeakReference<ByteBuffer>>();
      Queue<WeakReference<ByteBuffer>> prev = buffersBySize.putIfAbsent(size, list);
      // someone else put a queue in the map before we did
      if (prev != null) {
        list = prev;
      }
    }
    list.add(new WeakReference<ByteBuffer>(buf));
  }

  /**
   * Return the number of available buffers of a given size.
   * This is used only for tests.
   */

  int countBuffersOfSize(int size) {
    Queue<WeakReference<ByteBuffer>> list = buffersBySize.get(size);
    if (list == null) {
      return 0;
    }

    return list.size();
  }
}