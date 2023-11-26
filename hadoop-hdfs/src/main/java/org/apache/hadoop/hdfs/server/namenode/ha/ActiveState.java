package org.apache.hadoop.hdfs.server.namenode.ha;

import java.io.IOException;
import org.apache.hadoop.ha.status.HAServiceProtocol.HAServiceState;
import org.apache.hadoop.ha.micro.ServiceFailedException;
import org.apache.hadoop.hdfs.server.namenode.NameNode;
import org.apache.hadoop.hdfs.server.namenode.NameNode.OperationCategory;

/**
 * Active state of the namenode. In this state, namenode provides the namenode
 * service and handles operations of type {@link OperationCategory#WRITE} and
 * {@link OperationCategory#READ}.
 */
public class ActiveState extends HAState {
  public ActiveState() {
    super(HAServiceState.ACTIVE);
  }

  @Override
  public void checkOperation(HAContext context, OperationCategory op) {
    return; // All operations are allowed in active state
  }
  
  @Override
  public boolean shouldPopulateReplQueues() {
    return true;
  }
  
  @Override
  public void setState(HAContext context, HAState s) throws ServiceFailedException {
    if (s == NameNode.STANDBY_STATE) {
      setStateInternal(context, s);
      return;
    }
    super.setState(context, s);
  }

  @Override
  public void enterState(HAContext context) throws ServiceFailedException {
    try {
      context.startActiveServices();
    } catch (IOException e) {
      throw new ServiceFailedException("Failed to start active services", e);
    }
  }

  @Override
  public void exitState(HAContext context) throws ServiceFailedException {
    try {
      context.stopActiveServices();
    } catch (IOException e) {
      throw new ServiceFailedException("Failed to stop active services", e);
    }
  }

}
