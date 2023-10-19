package org.apache.hadoop.metrics2.filter;


import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

import com.google.re2j.Pattern;
/**
 * A regex pattern filter for metrics
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class RegexFilter extends AbstractPatternFilter {

  @Override
  protected Pattern compile(String s) {
    return Pattern.compile(s);
  }
}
