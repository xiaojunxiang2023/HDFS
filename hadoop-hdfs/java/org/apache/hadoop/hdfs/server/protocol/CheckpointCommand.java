package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.server.namenode.CheckpointSignature;

/**
 * Checkpoint command.
 * <p>
 * Returned to the backup node by the name-node as a reply to the
 * {@link NamenodeProtocol#startCheckpoint(NamenodeRegistration)}
 * request.<br>
 * Contains:
 * <ul>
 * <li>{@link CheckpointSignature} identifying the particular checkpoint</li>
 * <li>indicator whether the backup image should be discarded before starting 
 * the checkpoint</li>
 * <li>indicator whether the image should be transfered back to the name-node
 * upon completion of the checkpoint.</li>
 * </ul>
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class CheckpointCommand extends NamenodeCommand {
  private final CheckpointSignature cSig;
  private final boolean needToReturnImage;

  public CheckpointCommand() {
    this(null, false);
  }

  public CheckpointCommand(CheckpointSignature sig,
                           boolean needToReturnImg) {
    super(NamenodeProtocol.ACT_CHECKPOINT);
    this.cSig = sig;
    this.needToReturnImage = needToReturnImg;
  }

  /**
   * Checkpoint signature is used to ensure 
   * that nodes are talking about the same checkpoint.
   */
  public CheckpointSignature getSignature() {
    return cSig;
  }

  /**
   * Indicates whether the new checkpoint image needs to be transfered 
   * back to the name-node after the checkpoint is done.
   * 
   * @return true if the checkpoint should be returned back.
   */
  public boolean needToReturnImage() {
    return needToReturnImage;
  }
}
