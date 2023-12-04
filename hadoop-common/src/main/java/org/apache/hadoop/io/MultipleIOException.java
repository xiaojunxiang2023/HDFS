package org.apache.hadoop.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Encapsulate a list of {@link IOException} into an {@link IOException} */
public class MultipleIOException extends IOException {
  /** Require by {@link java.io.Serializable} */
  private static final long serialVersionUID = 1L;

  private final List<IOException> exceptions;

  /** Constructor is private, use {@link #createIOException(List)}. */
  private MultipleIOException(List<IOException> exceptions) {
    super(exceptions.size() + " exceptions " + exceptions);
    this.exceptions = exceptions;
  }

  /** @return the underlying exceptions */
  public List<IOException> getExceptions() {
    return exceptions;
  }

  /** A convenient method to create an {@link IOException}. */
  public static IOException createIOException(List<IOException> exceptions) {
    if (exceptions == null || exceptions.isEmpty()) {
      return null;
    }
    if (exceptions.size() == 1) {
      return exceptions.get(0);
    }
    return new MultipleIOException(exceptions);
  }

  /**
   * Build an {@link IOException} using {@link MultipleIOException}
   * if there are more than one.
   */
  public static class Builder {
    private List<IOException> exceptions;

    /** Add the given {@link Throwable} to the exception list. */
    public void add(Throwable t) {
      if (exceptions == null) {
        exceptions = new ArrayList<>();
      }
      exceptions.add(t instanceof IOException ? (IOException) t
          : new IOException(t));
    }

    /**
     * @return null if nothing is added to this builder;
     *         otherwise, return an {@link IOException}
     */
    public IOException build() {
      return createIOException(exceptions);
    }

    /**
     * @return whether any exception was added.
     */
    public boolean isEmpty() {
      if (exceptions == null) {
        return true;
      }
      return exceptions.isEmpty();
    }
  }
}
