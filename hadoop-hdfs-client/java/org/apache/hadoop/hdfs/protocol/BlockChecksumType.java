package org.apache.hadoop.hdfs.protocol;

/**
 * Algorithms/types denoting how block-level checksums are computed using
 * lower-level chunk checksums/CRCs.
 */
public enum BlockChecksumType {
  MD5CRC,  // BlockChecksum obtained by taking the MD5 digest of chunk CRCs
  COMPOSITE_CRC  // Chunk-independent CRC, optionally striped
}
