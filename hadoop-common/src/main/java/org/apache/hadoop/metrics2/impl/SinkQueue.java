package org.apache.hadoop.metrics2.impl;

import java.util.ConcurrentModificationException;

/**
 * A half-blocking (nonblocking for producers, blocking for consumers) queue
 * for metrics sinks.
 *
 * New elements are dropped when the queue is full to preserve "interesting"
 * elements at the onset of queue filling events
 */
class SinkQueue<T> {

  interface Consumer<T> {
    void consume(T object) throws InterruptedException;
  }

  // A fixed size circular buffer to minimize garbage
  private final T[] data;
  private int head; // head position
  private int tail; // tail position
  private int size; // number of elements
  private Thread currentConsumer = null;

  @SuppressWarnings("unchecked")
  SinkQueue(int capacity) {
    this.data = (T[]) new Object[Math.max(1, capacity)];
    head = tail = size = 0;
  }

  synchronized boolean enqueue(T e) {
    if (data.length == size) {
      return false;
    }
    ++size;
    tail = (tail + 1) % data.length;
    data[tail] = e;
    notify();
    return true;
  }

  /**
   * Consume one element, will block if queue is empty
   * Only one consumer at a time is allowed
   * @param consumer  the consumer callback object
   */
  void consume(Consumer<T> consumer) throws InterruptedException {
    T e = waitForData();

    try {
      consumer.consume(e);  // can take forever
      _dequeue();
    }
    finally {
      clearConsumerLock();
    }
  }

  /**
   * Consume all the elements, will block if queue is empty
   * @param consumer  the consumer callback object
   * @throws InterruptedException
   */
  void consumeAll(Consumer<T> consumer) throws InterruptedException {
    waitForData();

    try {
      for (int i = size(); i-- > 0; ) {
        consumer.consume(front()); // can take forever
        _dequeue();
      }
    }
    finally {
      clearConsumerLock();
    }
  }

  /**
   * Dequeue one element from head of the queue, will block if queue is empty
   * @return  the first element
   * @throws InterruptedException
   */
  synchronized T dequeue() throws InterruptedException {
    checkConsumer();

    while (0 == size) {
      wait();
    }
    return _dequeue();
  }

  private synchronized T waitForData() throws InterruptedException {
    checkConsumer();

    while (0 == size) {
      wait();
    }
    setConsumerLock();
    return front();
  }

  private synchronized void checkConsumer() {
    if (currentConsumer != null) {
      throw new ConcurrentModificationException("The "+
          currentConsumer.getName() +" thread is consuming the queue.");
    }
  }

  private synchronized void setConsumerLock() {
    currentConsumer = Thread.currentThread();
  }

  private synchronized void clearConsumerLock() {
    currentConsumer = null;
  }

  private synchronized T _dequeue() {
    if (0 == size) {
      throw new IllegalStateException("Size must > 0 here.");
    }
    --size;
    head = (head + 1) % data.length;
    T ret = data[head];
    data[head] = null;  // hint to gc
    return ret;
  }

  synchronized T front() {
    return data[(head + 1) % data.length];
  }

  synchronized T back() {
    return data[tail];
  }

  synchronized void clear() {
    checkConsumer();

    for (int i = data.length; i-- > 0; ) {
      data[i] = null;
    }
    size = 0;
  }

  synchronized int size() {
    return size;
  }

  int capacity() {
    return data.length;
  }
}
