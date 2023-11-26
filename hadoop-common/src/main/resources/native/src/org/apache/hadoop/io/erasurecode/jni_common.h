#ifndef _JNI_CODER_COMMON_H_
#define _JNI_CODER_COMMON_H_

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include <jni.h>

#include "erasure_coder.h"

void loadLib(JNIEnv *env);

void setCoder(JNIEnv* env, jobject thiz, IsalCoder* coder);

IsalCoder* getCoder(JNIEnv* env, jobject thiz);

void getInputs(JNIEnv *env, jobjectArray inputs, jintArray inputOffsets,
                              unsigned char** destInputs, int num);

void getOutputs(JNIEnv *env, jobjectArray outputs, jintArray outputOffsets,
                              unsigned char** destOutputs, int num);

#endif //_JNI_CODER_COMMON_H_