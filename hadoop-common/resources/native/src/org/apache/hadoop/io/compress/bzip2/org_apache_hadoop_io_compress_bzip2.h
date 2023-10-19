#if !defined ORG_APACHE_HADOOP_IO_COMPRESS_BZIP2_BZIP2_H
#define ORG_APACHE_HADOOP_IO_COMPRESS_BZIP2_BZIP2_H

#include <config.h>
#include <stddef.h>
#include <bzlib.h>
#include <dlfcn.h>
#include <jni.h>

#include "org_apache_hadoop.h"

#ifndef HADOOP_BZIP2_LIBRARY
#define HADOOP_BZIP2_LIBRARY "libbz2.so.1"
#endif


/* A helper macro to convert the java 'stream-handle' to a bz_stream pointer. */
#define BZSTREAM(stream) ((bz_stream*)((ptrdiff_t)(stream)))

/* A helper macro to convert the bz_stream pointer to the java 'stream-handle'. */
#define JLONG(stream) ((jlong)((ptrdiff_t)(stream)))

#endif //ORG_APACHE_HADOOP_IO_COMPRESS_BZIP2_BZIP2_H
