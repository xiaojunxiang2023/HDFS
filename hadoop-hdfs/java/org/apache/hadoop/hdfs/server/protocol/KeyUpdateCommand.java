package org.apache.hadoop.hdfs.server.protocol;
import org.apache.hadoop.hdfs.security.token.block.ExportedBlockKeys;
public class KeyUpdateCommand extends DatanodeCommand {
  private final ExportedBlockKeys keys;

  KeyUpdateCommand() {
    this(new ExportedBlockKeys());
  }

  public KeyUpdateCommand(ExportedBlockKeys keys) {
    super(DatanodeProtocol.DNA_ACCESSKEYUPDATE);
    this.keys = keys;
  }

  public ExportedBlockKeys getExportedKeys() {
    return this.keys;
  }
}
