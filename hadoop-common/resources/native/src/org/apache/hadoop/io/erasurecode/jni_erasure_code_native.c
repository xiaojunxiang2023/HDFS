#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "org_apache_hadoop.h"
#include "jni_common.h"
#include "isal_load.h"
#include "org_apache_hadoop_io_erasurecode_ErasureCodeNative.h"

#ifdef UNIX
#include "config.h"
#endif

JNIEXPORT void JNICALL
Java_org_apache_hadoop_io_erasurecode_ErasureCodeNative_loadLibrary
(JNIEnv *env, jclass myclass) {
  loadLib(env);
}

JNIEXPORT jstring JNICALL
Java_org_apache_hadoop_io_erasurecode_ErasureCodeNative_getLibraryName
(JNIEnv *env, jclass myclass) {
  if (isaLoader == NULL) {
    THROW(env, "java/lang/UnsatisfiedLinkError",
                             "Unavailable: library not loaded yet");
    return (jstring)NULL;
  }

  return (*env)->NewStringUTF(env, isaLoader->libname);
}
