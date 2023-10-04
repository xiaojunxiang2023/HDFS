package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * Algorithms/types denoting how block-level checksums are computed using
 * lower-level chunk checksums/CRCs.
 */
@InterfaceAudience.Private
public enum BlockChecksumType {
  MD5CRC,  // BlockChecksum obtained by taking the MD5 digest of chunk CRCs
  COMPOSITE_CRC  // Chunk-independent CRC, optionally striped
}
