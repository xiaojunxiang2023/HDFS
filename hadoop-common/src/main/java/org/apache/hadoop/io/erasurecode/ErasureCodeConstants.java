package org.apache.hadoop.io.erasurecode;

/**
 * Constants related to the erasure code feature.
 */
public final class ErasureCodeConstants {

  private ErasureCodeConstants() {
  }

  public static final String DUMMY_CODEC_NAME = "dummy";
  public static final String RS_CODEC_NAME = "rs";
  public static final String RS_LEGACY_CODEC_NAME = "rs-legacy";
  public static final String XOR_CODEC_NAME = "xor";
  public static final String HHXOR_CODEC_NAME = "hhxor";
  public static final String REPLICATION_CODEC_NAME = "replication";

  public static final ECSchema RS_6_3_SCHEMA = new ECSchema(
      RS_CODEC_NAME, 6, 3);

  public static final ECSchema RS_3_2_SCHEMA = new ECSchema(
      RS_CODEC_NAME, 3, 2);

  public static final ECSchema RS_6_3_LEGACY_SCHEMA = new ECSchema(
      RS_LEGACY_CODEC_NAME, 6, 3);

  public static final ECSchema XOR_2_1_SCHEMA = new ECSchema(
      XOR_CODEC_NAME, 2, 1);

  public static final ECSchema RS_10_4_SCHEMA = new ECSchema(
      RS_CODEC_NAME, 10, 4);

  public static final ECSchema REPLICATION_1_2_SCHEMA = new ECSchema(
      REPLICATION_CODEC_NAME, 1, 2);

  public static final byte MAX_POLICY_ID = Byte.MAX_VALUE;
  public static final byte USER_DEFINED_POLICY_START_ID = (byte) 64;
  public static final byte REPLICATION_POLICY_ID = (byte) 0;
  public static final String REPLICATION_POLICY_NAME = REPLICATION_CODEC_NAME;
}
