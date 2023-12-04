package org.apache.hadoop.fs.impl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;

import java.util.Set;

import static java.util.Objects.requireNonNull;

/**
 * All the parameters from the openFile builder for the
 * {@code openFileWithOptions} commands.
 *
 * If/when new attributes added to the builder, this class will be extended.
 */
public class OpenFileParameters {

  /**
   * Set of options declared as mandatory.
   */
  private Set<String> mandatoryKeys;

  /**
   * Options set during the build sequence.
   */
  private Configuration options;

  /**
   * Buffer size.
   */
  private int bufferSize;

  /**
   * Optional file status.
   */
  private FileStatus status;

  public OpenFileParameters() {
  }

  public OpenFileParameters withMandatoryKeys(final Set<String> keys) {
    this.mandatoryKeys = requireNonNull(keys);
    return this;
  }

  public OpenFileParameters withOptions(final Configuration opts) {
    this.options = requireNonNull(opts);
    return this;
  }

  public OpenFileParameters withBufferSize(final int size) {
    this.bufferSize = size;
    return this;
  }

  public OpenFileParameters withStatus(final FileStatus st) {
    this.status = st;
    return this;
  }

  public Set<String> getMandatoryKeys() {
    return mandatoryKeys;
  }

  public Configuration getOptions() {
    return options;
  }

  public int getBufferSize() {
    return bufferSize;
  }

  public FileStatus getStatus() {
    return status;
  }
}
