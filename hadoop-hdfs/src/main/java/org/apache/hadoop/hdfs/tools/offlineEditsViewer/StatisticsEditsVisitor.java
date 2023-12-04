package org.apache.hadoop.hdfs.tools.offlineEditsViewer;

import org.apache.hadoop.hdfs.server.namenode.FSEditLogOp;
import org.apache.hadoop.hdfs.server.namenode.FSEditLogOpCodes;
import org.apache.hadoop.thirdparty.com.google.common.base.Charsets;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * StatisticsEditsVisitor implements text version of EditsVisitor
 * that aggregates counts of op codes processed
 *
 */
public class StatisticsEditsVisitor implements OfflineEditsVisitor {
  final private PrintWriter out;
  private final Map<FSEditLogOpCodes, Long> opCodeCount =
      new HashMap<FSEditLogOpCodes, Long>();
  private int version = -1;

  /**
   * Create a processor that writes to the file named and may or may not
   * also output to the screen, as specified.
   *
   * @param out Name of file to write output to
   */
  public StatisticsEditsVisitor(OutputStream out) throws IOException {
    this.out = new PrintWriter(new OutputStreamWriter(out, Charsets.UTF_8));
  }

  /** Start the visitor */
  @Override
  public void start(int version) throws IOException {
    this.version = version;
  }

  /** Close the visitor */
  @Override
  public void close(Throwable error) throws IOException {
    out.print(getStatisticsString());
    if (error != null) {
      out.print("EXITING ON ERROR: " + error.toString() + "\n");
    }
    out.close();
  }

  @Override
  public void visitOp(FSEditLogOp op) throws IOException {
    incrementOpCodeCount(op.opCode);
  }

  /**
   * Increment the op code counter
   *
   * @param opCode opCode for which to increment count
   */
  private void incrementOpCodeCount(FSEditLogOpCodes opCode) {
    if (!opCodeCount.containsKey(opCode)) {
      opCodeCount.put(opCode, 0L);
    }
    Long newValue = opCodeCount.get(opCode) + 1;
    opCodeCount.put(opCode, newValue);
  }

  /**
   * Get statistics
   *
   * @return statistics, map of counts per opCode
   */
  public Map<FSEditLogOpCodes, Long> getStatistics() {
    return opCodeCount;
  }

  /**
   * Get the statistics in string format, suitable for printing
   *
   * @return statistics in in string format, suitable for printing
   */
  public String getStatisticsString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format(
        "    %-30.30s      : %d%n",
        "VERSION", version));
    for (FSEditLogOpCodes opCode : FSEditLogOpCodes.values()) {
      Long count = opCodeCount.get(opCode);
      sb.append(String.format(
          "    %-30.30s (%3d): %d%n",
          opCode.toString(),
          opCode.getOpCode(),
          count == null ? Long.valueOf(0L) : count));
    }
    return sb.toString();
  }
}