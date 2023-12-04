package org.apache.hadoop.ipc;

import org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolInfoService;

/**
 * Protocol to get versions and signatures for supported protocols from the
 * server.
 *
 * Note: This extends the protocolbuffer service based interface to
 * add annotations.
 */
@ProtocolInfo(
    protocolName = "org.apache.hadoop.ipc.ProtocolMetaInfoPB",
    protocolVersion = 1)
public interface ProtocolMetaInfoPB extends
    ProtocolInfoService.BlockingInterface {
}
