package org.apache.hadoop.hdfs.server.datanode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Used for injecting faults in DFSClient and DFSOutputStream tests.
 * Calls into this are a no-op in production code. 
 */

public class DataNodeFaultInjector {
  private static DataNodeFaultInjector instance = new DataNodeFaultInjector();

  public static DataNodeFaultInjector get() {
    return instance;
  }

  public static void set(DataNodeFaultInjector injector) {
    instance = injector;
  }

  public void getHdfsBlocksMetadata() {
  }

  public void writeBlockAfterFlush() throws IOException {
  }

  public void sendShortCircuitShmResponse() throws IOException {
  }

  public boolean dropHeartbeatPacket() {
    return false;
  }

  public void stopSendingPacketDownstream(final String mirrAddr)
      throws IOException {
  }

  /**
   * Used as a hook to intercept the latency of sending packet.
   */
  public void logDelaySendingPacketDownstream(
      final String mirrAddr,
      final long delayMs) throws IOException {
  }

  public void delaySendingAckToUpstream(final String upstreamAddr)
      throws IOException {
  }

  /**
   * Used as a hook to intercept the latency of sending ack.
   */
  public void logDelaySendingAckToUpstream(
      final String upstreamAddr,
      final long delayMs)
      throws IOException {
  }

  public void noRegistration() throws IOException {
  }

  public void failMirrorConnection() throws IOException {
  }

  public void failPipeline(ReplicaInPipeline replicaInfo,
                           String mirrorAddr) throws IOException {
  }

  public void startOfferService() throws Exception {
  }

  public void endOfferService() throws Exception {
  }

  public void throwTooManyOpenFiles() throws FileNotFoundException {
  }

  /**
   * Used as a hook to inject failure in erasure coding reconstruction
   * process.
   */
  public void stripedBlockReconstruction() throws IOException {
  }

  /**
   * Used as a hook to inject failure in erasure coding checksum reconstruction
   * process.
   */
  public void stripedBlockChecksumReconstruction() throws IOException {
  }

  /**
   * Used as a hook to inject latency when read block
   * in erasure coding reconstruction process.
   */
  public void delayBlockReader() {
  }

  /**
   * Used as a hook to inject intercept when free the block reader buffer.
   */
  public void interceptFreeBlockReaderBuffer() {
  }

  /**
   * Used as a hook to inject intercept When finish reading from block.
   */
  public void interceptBlockReader() {
  }

  /**
   * Used as a hook to inject intercept when BPOfferService hold lock.
   */
  public void delayWhenOfferServiceHoldLock() {
  }

  /**
   * Used as a hook to inject intercept when re-register.
   */
  public void blockUtilSendFullBlockReport() {
  }

  /**
   * Just delay a while.
   */
  public void delay() {
  }

  /**
   * Used as a hook to inject data pollution
   * into an erasure coding reconstruction.
   */
  public void badDecoding(ByteBuffer[] outputs) {
  }
}
