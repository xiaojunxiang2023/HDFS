#include "exception.h"

#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

jthrowable newExceptionV(JNIEnv* env, const char *name,
                         const char *fmt, va_list ap)
{
  int need;
  char buf[1], *msg = NULL;
  va_list ap2;
  jstring jstr = NULL;
  jthrowable jthr;
  jclass clazz;
  jmethodID excCtor;

  va_copy(ap2, ap);
  clazz = (*env)->FindClass(env, name);
  if (!clazz) {
    jthr = (*env)->ExceptionOccurred(env);
    (*env)->ExceptionClear(env);
    goto done;
  }
  excCtor = (*env)->GetMethodID(env,
        clazz, "<init>", "(Ljava/lang/String;)V");
  if (!excCtor) {
    jthr = (*env)->ExceptionOccurred(env);
    (*env)->ExceptionClear(env);
    goto done;
  }
  need = vsnprintf(buf, sizeof(buf), fmt, ap);
  if (need < 0) {
    fmt = "vsnprintf error";
    need = strlen(fmt);
  }
  msg = malloc(need + 1);
  vsnprintf(msg, need + 1, fmt, ap2);
  jstr = (*env)->NewStringUTF(env, msg);
  if (!jstr) {
    jthr = (*env)->ExceptionOccurred(env);
    (*env)->ExceptionClear(env);
    goto done;
  }
  jthr = (*env)->NewObject(env, clazz, excCtor, jstr);
  if (!jthr) {
    jthr = (*env)->ExceptionOccurred(env);
    (*env)->ExceptionClear(env);
    goto done;
  }

done:
  free(msg);
  va_end(ap2);
  (*env)->DeleteLocalRef(env, jstr);
  return jthr;
}

jthrowable newException(JNIEnv* env, const char *name, const char *fmt, ...)
{
  va_list ap;
  jthrowable jthr;

  va_start(ap, fmt);
  jthr = newExceptionV(env, name, fmt, ap);
  va_end(ap);
  return jthr;
}

jthrowable newRuntimeException(JNIEnv* env, const char *fmt, ...)
{
  va_list ap;
  jthrowable jthr;

  va_start(ap, fmt);
  jthr = newExceptionV(env, "java/lang/RuntimeException", fmt, ap);
  va_end(ap);
  return jthr;
}

jthrowable newIOException(JNIEnv* env, const char *fmt, ...)
{
  va_list ap;
  jthrowable jthr;

  va_start(ap, fmt);
  jthr = newExceptionV(env, "java/io/IOException", fmt, ap);
  va_end(ap);
  return jthr;
}

const char* terror(int errnum)
{

#if defined(__sun) || defined(__GLIBC_PREREQ) && __GLIBC_PREREQ(2, 32)
// MT-Safe under Solaris or glibc >= 2.32 not supporting sys_errlist/sys_nerr
  return strerror(errnum); 
#else
  if ((errnum < 0) || (errnum >= sys_nerr)) {
    return "unknown error.";
  }
  return sys_errlist[errnum];
#endif
}

