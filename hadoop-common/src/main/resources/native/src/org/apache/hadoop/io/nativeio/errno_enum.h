#ifndef ERRNO_ENUM_H
#define ERRNO_ENUM_H

#include <jni.h>

void errno_enum_init(JNIEnv *env);
void errno_enum_deinit(JNIEnv *env);
jobject errno_to_enum(JNIEnv *env, int errnum);

#endif
