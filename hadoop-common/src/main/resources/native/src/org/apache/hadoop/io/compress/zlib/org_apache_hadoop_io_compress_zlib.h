#if !defined ORG_APACHE_HADOOP_IO_COMPRESS_ZLIB_ZLIB_H
#define ORG_APACHE_HADOOP_IO_COMPRESS_ZLIB_ZLIB_H

#include "org_apache_hadoop.h"

#ifdef UNIX
#include <config.h>
#include <stddef.h>
#include <zlib.h>
#include <zconf.h>
#include <dlfcn.h>
#include <jni.h>
#endif

#ifdef WINDOWS
#include <jni.h>
#define HADOOP_ZLIB_LIBRARY L"zlib1.dll"
#include <zlib.h>
#include <zconf.h>
#endif

/* A helper macro to convert the java 'stream-handle' to a z_stream pointer. */
#define ZSTREAM(stream) ((z_stream*)((ptrdiff_t)(stream)))

/* A helper macro to convert the z_stream pointer to the java 'stream-handle'. */
#define JLONG(stream) ((jlong)((ptrdiff_t)(stream)))

#endif //ORG_APACHE_HADOOP_IO_COMPRESS_ZLIB_ZLIB_H
