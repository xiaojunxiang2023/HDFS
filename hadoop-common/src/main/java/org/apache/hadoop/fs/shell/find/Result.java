package org.apache.hadoop.fs.shell.find;

public final class Result {
  /** Result indicating {@link Expression} processing should continue. */
  public static final Result PASS = new Result(true, true);
  /** Result indicating {@link Expression} processing should stop. */
  public static final Result FAIL = new Result(false, true);
  /**
   * Result indicating {@link Expression} processing should not descend any more
   * directories.
   */
  public static final Result STOP = new Result(true, false);
  private boolean descend;
  private boolean success;

  private Result(boolean success, boolean recurse) {
    this.success = success;
    this.descend = recurse;
  }

  /** Should further directories be descended. */
  public boolean isDescend() {
    return this.descend;
  }

  /** Should processing continue. */
  public boolean isPass() {
    return this.success;
  }

  /** Returns the combination of this and another result. */
  public Result combine(Result other) {
    return new Result(this.isPass() && other.isPass(), this.isDescend()
        && other.isDescend());
  }

  /** Negate this result. */
  public Result negate() {
    return new Result(!this.isPass(), this.isDescend());
  }

  @Override
  public String toString() {
    return "success=" + isPass() + "; recurse=" + isDescend();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (descend ? 1231 : 1237);
    result = prime * result + (success ? 1231 : 1237);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Result other = (Result) obj;
    if (descend != other.descend)
      return false;
    if (success != other.success)
      return false;
    return true;
  }
}
