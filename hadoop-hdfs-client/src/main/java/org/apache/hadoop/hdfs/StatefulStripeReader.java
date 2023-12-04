package org.apache.hadoop.hdfs;

import org.apache.hadoop.hdfs.DFSUtilClient.CorruptedBlocks;
import org.apache.hadoop.hdfs.protocol.ErasureCodingPolicy;
import org.apache.hadoop.hdfs.protocol.LocatedBlock;
import org.apache.hadoop.hdfs.util.StripedBlockUtil;
import org.apache.hadoop.hdfs.util.StripedBlockUtil.AlignedStripe;
import org.apache.hadoop.hdfs.util.StripedBlockUtil.StripingChunk;
import org.apache.hadoop.io.erasurecode.ECChunk;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureDecoder;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * The reader for reading a complete {@link StripedBlockUtil.AlignedStripe}
 * which belongs to a single stripe.
 * Reading cross multiple strips is not supported in this reader.
 */
class StatefulStripeReader extends StripeReader {

  StatefulStripeReader(AlignedStripe alignedStripe,
                       ErasureCodingPolicy ecPolicy, LocatedBlock[] targetBlocks,
                       BlockReaderInfo[] readerInfos, CorruptedBlocks corruptedBlocks,
                       RawErasureDecoder decoder, DFSStripedInputStream dfsStripedInputStream) {
    super(alignedStripe, ecPolicy, targetBlocks, readerInfos,
        corruptedBlocks, decoder, dfsStripedInputStream);
  }

  @Override
  void prepareDecodeInputs() {
    final ByteBuffer cur;
    synchronized (dfsStripedInputStream) {
      cur = dfsStripedInputStream.getCurStripeBuf().duplicate();
    }

    this.decodeInputs = new ECChunk[dataBlkNum + parityBlkNum];
    int bufLen = (int) alignedStripe.getSpanInBlock();
    int bufOff = (int) alignedStripe.getOffsetInBlock();
    for (int i = 0; i < dataBlkNum; i++) {
      cur.limit(cur.capacity());
      int pos = bufOff % cellSize + cellSize * i;
      cur.position(pos);
      cur.limit(pos + bufLen);
      decodeInputs[i] = new ECChunk(cur.slice(), 0, bufLen);
      if (alignedStripe.chunks[i] == null) {
        alignedStripe.chunks[i] =
            new StripingChunk(decodeInputs[i].getBuffer());
      }
    }
  }

  @Override
  boolean prepareParityChunk(int index) {
    Preconditions.checkState(index >= dataBlkNum
        && alignedStripe.chunks[index] == null);
    if (readerInfos[index] != null && readerInfos[index].shouldSkip) {
      alignedStripe.chunks[index] = new StripingChunk(StripingChunk.MISSING);
      // we have failed the block reader before
      return false;
    }
    final int parityIndex = index - dataBlkNum;
    ByteBuffer buf = dfsStripedInputStream.getParityBuffer().duplicate();
    buf.position(cellSize * parityIndex);
    buf.limit(cellSize * parityIndex + (int) alignedStripe.range.spanInBlock);
    decodeInputs[index] =
        new ECChunk(buf.slice(), 0, (int) alignedStripe.range.spanInBlock);
    alignedStripe.chunks[index] =
        new StripingChunk(decodeInputs[index].getBuffer());
    return true;
  }

  @Override
  void decode() throws IOException {
    finalizeDecodeInputs();
    decodeAndFillBuffer(false);
  }
}
