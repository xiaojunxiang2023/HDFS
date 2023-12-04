package org.apache.hadoop.ipc;

import org.apache.hadoop.ipc.Server.Call;
import org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ExternalCall<T> extends Call {
  private final PrivilegedExceptionAction<T> action;
  private final AtomicBoolean done = new AtomicBoolean();
  private T result;
  private Throwable error;

  public ExternalCall(PrivilegedExceptionAction<T> action) {
    this.action = action;
  }

  @Override
  public String getDetailedMetricsName() {
    return "(external)";
  }

  public abstract UserGroupInformation getRemoteUser();

  public final T get() throws InterruptedException, ExecutionException {
    waitForCompletion();
    if (error != null) {
      throw new ExecutionException(error);
    }
    return result;
  }

  // wait for response to be triggered to support postponed calls
  private void waitForCompletion() throws InterruptedException {
    synchronized (done) {
      while (!done.get()) {
        try {
          done.wait();
        } catch (InterruptedException ie) {
          if (Thread.interrupted()) {
            throw ie;
          }
        }
      }
    }
  }

  boolean isDone() {
    return done.get();
  }

  // invoked by ipc handler
  @Override
  public final Void run() throws IOException {
    try {
      result = action.run();
      sendResponse();
    } catch (Throwable t) {
      abortResponse(t);
    }
    return null;
  }

  @Override
  final void doResponse(Throwable t, RpcStatusProto status) {
    synchronized (done) {
      error = t;
      done.set(true);
      done.notify();
    }
  }
}