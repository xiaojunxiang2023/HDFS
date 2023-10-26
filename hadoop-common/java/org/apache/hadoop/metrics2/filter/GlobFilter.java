package org.apache.hadoop.metrics2.filter;

import org.apache.hadoop.fs.GlobPattern;

import com.google.re2j.Pattern;
/**
 * A glob pattern filter for metrics.
 *
 * The class name is used in metrics config files
 */
public class GlobFilter extends AbstractPatternFilter {

  @Override
  protected Pattern compile(String s) {
    return GlobPattern.compile(s);
  }
}
