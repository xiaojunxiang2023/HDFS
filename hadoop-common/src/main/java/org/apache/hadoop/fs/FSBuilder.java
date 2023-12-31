package org.apache.hadoop.fs;

import javax.annotation.Nonnull;
import java.io.IOException;

/**
 * The base interface which various FileSystem FileContext Builder
 * interfaces can extend, and which underlying implementations
 * will then implement.
 * @param <S> Return type on the {@link #build()} call.
 * @param <B> type of builder itself.
 */
public interface FSBuilder<S, B extends FSBuilder<S, B>> {

  /**
   * Set optional Builder parameter.
   */
  B opt(@Nonnull String key, @Nonnull String value);

  /**
   * Set optional boolean parameter for the Builder.
   *
   * @see #opt(String, String)
   */
  B opt(@Nonnull String key, boolean value);

  /**
   * Set optional int parameter for the Builder.
   *
   * @see #opt(String, String)
   */
  B opt(@Nonnull String key, int value);

  /**
   * Set optional float parameter for the Builder.
   *
   * @see #opt(String, String)
   */
  B opt(@Nonnull String key, float value);

  /**
   * Set optional double parameter for the Builder.
   *
   * @see #opt(String, String)
   */
  B opt(@Nonnull String key, double value);

  /**
   * Set an array of string values as optional parameter for the Builder.
   *
   * @see #opt(String, String)
   */
  B opt(@Nonnull String key, @Nonnull String... values);

  /**
   * Set mandatory option to the Builder.
   *
   * If the option is not supported or unavailable,
   * the client should expect {@link #build()} throws IllegalArgumentException.
   */
  B must(@Nonnull String key, @Nonnull String value);

  /**
   * Set mandatory boolean option.
   *
   * @see #must(String, String)
   */
  B must(@Nonnull String key, boolean value);

  /**
   * Set mandatory int option.
   *
   * @see #must(String, String)
   */
  B must(@Nonnull String key, int value);

  /**
   * Set mandatory float option.
   *
   * @see #must(String, String)
   */
  B must(@Nonnull String key, float value);

  /**
   * Set mandatory double option.
   *
   * @see #must(String, String)
   */
  B must(@Nonnull String key, double value);

  /**
   * Set a string array as mandatory option.
   *
   * @see #must(String, String)
   */
  B must(@Nonnull String key, @Nonnull String... values);

  /**
   * Instantiate the object which was being built.
   *
   * @throws IllegalArgumentException if the parameters are not valid.
   * @throws UnsupportedOperationException if the filesystem does not support
   * the specific operation.
   * @throws IOException on filesystem IO errors.
   */
  S build() throws IllegalArgumentException,
      UnsupportedOperationException, IOException;
}
