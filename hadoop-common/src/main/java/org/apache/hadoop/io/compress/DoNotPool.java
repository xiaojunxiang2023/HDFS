package org.apache.hadoop.io.compress;

import java.lang.annotation.*;

/**
 * This is a marker annotation that marks a compressor or decompressor 
 * type as not to be pooled.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface DoNotPool {

}