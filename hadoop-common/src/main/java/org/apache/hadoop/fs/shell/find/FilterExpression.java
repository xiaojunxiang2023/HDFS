package org.apache.hadoop.fs.shell.find;

import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.shell.PathData;

import java.io.IOException;
import java.util.Deque;

/**
 * Provides an abstract composition filter for the {@link Expression} interface.
 * Allows other {@link Expression} implementations to be reused without
 * inheritance.
 */
public abstract class FilterExpression implements Expression, Configurable {
  protected Expression expression;

  protected FilterExpression(Expression expression) {
    this.expression = expression;
  }

  @Override
  public void setOptions(FindOptions options) throws IOException {
    if (expression != null) {
      expression.setOptions(options);
    }
  }

  @Override
  public void prepare() throws IOException {
    if (expression != null) {
      expression.prepare();
    }
  }

  @Override
  public Result apply(PathData item, int depth) throws IOException {
    if (expression != null) {
      return expression.apply(item, -1);
    }
    return Result.PASS;
  }

  @Override
  public void finish() throws IOException {
    if (expression != null) {
      expression.finish();
    }
  }

  @Override
  public String[] getUsage() {
    if (expression != null) {
      return expression.getUsage();
    }
    return null;
  }

  @Override
  public String[] getHelp() {
    if (expression != null) {
      return expression.getHelp();
    }
    return null;
  }

  @Override
  public boolean isAction() {
    if (expression != null) {
      return expression.isAction();
    }
    return false;
  }

  @Override
  public boolean isOperator() {
    if (expression != null) {
      return expression.isOperator();
    }
    return false;
  }

  @Override
  public int getPrecedence() {
    if (expression != null) {
      return expression.getPrecedence();
    }
    return -1;
  }

  @Override
  public void addChildren(Deque<Expression> expressions) {
    if (expression != null) {
      expression.addChildren(expressions);
    }
  }

  @Override
  public void addArguments(Deque<String> args) {
    if (expression != null) {
      expression.addArguments(args);
    }
  }

  @Override
  public void setConf(Configuration conf) {
    if (expression instanceof Configurable) {
      ((Configurable) expression).setConf(conf);
    }
  }

  @Override
  public Configuration getConf() {
    if (expression instanceof Configurable) {
      return ((Configurable) expression).getConf();
    }
    return null;
  }

  @Override
  public String toString() {
    if (expression != null) {
      return getClass().getSimpleName() + "-" + expression.toString();
    }
    return getClass().getSimpleName();
  }
}
