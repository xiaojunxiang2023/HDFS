#include "org_apache_hadoop.h"

#ifdef UNIX
#include <dlfcn.h>
#include "config.h"
#endif // UNIX

#ifdef WINDOWS
#include "winutils.h"
#endif

#include <jni.h>

JNIEXPORT jboolean JNICALL Java_org_apache_hadoop_util_NativeCodeLoader_buildSupportsSnappy
  (JNIEnv *env, jclass clazz)
{
#ifdef HADOOP_SNAPPY_LIBRARY
  return JNI_TRUE;
#else
  return JNI_FALSE;
#endif
}

JNIEXPORT jboolean JNICALL Java_org_apache_hadoop_util_NativeCodeLoader_buildSupportsZstd
  (JNIEnv *env, jclass clazz)
{
#ifdef HADOOP_ZSTD_LIBRARY
  return JNI_TRUE;
#else
  return JNI_FALSE;
#endif
}


JNIEXPORT jboolean JNICALL Java_org_apache_hadoop_util_NativeCodeLoader_buildSupportsOpenssl
  (JNIEnv *env, jclass clazz)
{
#ifdef HADOOP_OPENSSL_LIBRARY
  return JNI_TRUE;
#else
  return JNI_FALSE;
#endif
}

JNIEXPORT jboolean JNICALL Java_org_apache_hadoop_util_NativeCodeLoader_buildSupportsIsal
  (JNIEnv *env, jclass clazz)
{
#ifdef HADOOP_ISAL_LIBRARY
  return JNI_TRUE;
#else
  return JNI_FALSE;
#endif
}

JNIEXPORT jstring JNICALL Java_org_apache_hadoop_util_NativeCodeLoader_getLibraryName
  (JNIEnv *env, jclass clazz)
{
#ifdef UNIX
  Dl_info dl_info;
  int ret = dladdr(
      Java_org_apache_hadoop_util_NativeCodeLoader_getLibraryName,
      &dl_info);
  return (*env)->NewStringUTF(env, ret==0 ? "Unavailable" : dl_info.dli_fname);
#endif

#ifdef WINDOWS
  LPWSTR filename = NULL;
  GetLibraryName(Java_org_apache_hadoop_util_NativeCodeLoader_getLibraryName,
    &filename);
  if (filename != NULL)
  {
    return (*env)->NewString(env, filename, (jsize) wcslen(filename));
  }
  else
  {
    return (*env)->NewStringUTF(env, "Unavailable");
  }
#endif
}
