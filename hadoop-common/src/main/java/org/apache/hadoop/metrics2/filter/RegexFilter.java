package org.apache.hadoop.metrics2.filter;

import com.google.re2j.Pattern;
/**
 * A regex pattern filter for metrics
 */
public class RegexFilter extends AbstractPatternFilter {

  @Override
  protected Pattern compile(String s) {
    return Pattern.compile(s);
  }
}
