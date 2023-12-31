package org.apache.hadoop.fs.shell.find;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ReflectionUtils;
import org.apache.hadoop.util.StringUtils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Factory class for registering and searching for expressions for use in the
 * {@link org.apache.hadoop.fs.shell.find.Find} command.
 */
final class ExpressionFactory {
  private static final String REGISTER_EXPRESSION_METHOD = "registerExpression";
  private Map<String, Class<? extends Expression>> expressionMap =
      new HashMap<String, Class<? extends Expression>>();

  private static final ExpressionFactory INSTANCE = new ExpressionFactory();

  static ExpressionFactory getExpressionFactory() {
    return INSTANCE;
  }

  /**
   * Private constructor to ensure singleton.
   */
  private ExpressionFactory() {
  }

  /**
   * Invokes "static void registerExpression(FindExpressionFactory)" on the
   * given class. This method abstracts the contract between the factory and the
   * expression class. Do not assume that directly invoking registerExpression
   * on the given class will have the same effect.
   *
   * @param expressionClass
   *          class to allow an opportunity to register
   */
  void registerExpression(Class<? extends Expression> expressionClass) {
    try {
      Method register = expressionClass.getMethod(REGISTER_EXPRESSION_METHOD,
          ExpressionFactory.class);
      if (register != null) {
        register.invoke(null, this);
      }
    } catch (Exception e) {
      throw new RuntimeException(StringUtils.stringifyException(e));
    }
  }

  /**
   * Register the given class as handling the given list of expression names.
   *
   * @param expressionClass
   *          the class implementing the expression names
   * @param names
   *          one or more command names that will invoke this class
   * @throws IOException
   *           if the expression is not of an expected type
   */
  void addClass(Class<? extends Expression> expressionClass,
                String... names) throws IOException {
    for (String name : names)
      expressionMap.put(name, expressionClass);
  }

  /**
   * Determines whether the given expression name represents and actual
   * expression.
   *
   * @param expressionName
   *          name of the expression
   * @return true if expressionName represents an expression
   */
  boolean isExpression(String expressionName) {
    return expressionMap.containsKey(expressionName);
  }

  /**
   * Get an instance of the requested expression
   *
   * @param expressionName
   *          name of the command to lookup
   * @param conf
   *          the Hadoop configuration
   * @return the {@link Expression} or null if the expression is unknown
   */
  Expression getExpression(String expressionName, Configuration conf) {
    if (conf == null)
      throw new NullPointerException("configuration is null");

    Class<? extends Expression> expressionClass = expressionMap
        .get(expressionName);
    Expression instance = createExpression(expressionClass, conf);
    return instance;
  }

  /**
   * Creates an instance of the requested {@link Expression} class.
   *
   * @param expressionClass
   *          {@link Expression} class to be instantiated
   * @param conf
   *          the Hadoop configuration
   * @return a new instance of the requested {@link Expression} class
   */
  Expression createExpression(
      Class<? extends Expression> expressionClass, Configuration conf) {
    Expression instance = null;
    if (expressionClass != null) {
      instance = ReflectionUtils.newInstance(expressionClass, conf);
    }
    return instance;
  }

  /**
   * Creates an instance of the requested {@link Expression} class.
   *
   * @param expressionClassname
   *          name of the {@link Expression} class to be instantiated
   * @param conf
   *          the Hadoop configuration
   * @return a new instance of the requested {@link Expression} class
   */
  Expression createExpression(String expressionClassname,
                              Configuration conf) {
    try {
      Class<? extends Expression> expressionClass = Class.forName(
          expressionClassname).asSubclass(Expression.class);
      return createExpression(expressionClass, conf);
    } catch (ClassNotFoundException e) {
      throw new IllegalArgumentException("Invalid classname "
          + expressionClassname);
    }
  }
}
