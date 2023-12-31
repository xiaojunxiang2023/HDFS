#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "org_apache_hadoop.h"
#include "erasure_code.h"
#include "gf_util.h"
#include "jni_common.h"
#include "org_apache_hadoop_io_erasurecode_rawcoder_NativeRSRawDecoder.h"

typedef struct _RSDecoder {
  IsalDecoder decoder;
  unsigned char* inputs[MMAX];
  unsigned char* outputs[MMAX];
} RSDecoder;

JNIEXPORT void JNICALL
Java_org_apache_hadoop_io_erasurecode_rawcoder_NativeRSRawDecoder_initImpl(
JNIEnv *env, jobject thiz, jint numDataUnits, jint numParityUnits) {
  RSDecoder* rsDecoder = (RSDecoder*)malloc(sizeof(RSDecoder));
  memset(rsDecoder, 0, sizeof(*rsDecoder));
  initDecoder(&rsDecoder->decoder, (int)numDataUnits, (int)numParityUnits);

  setCoder(env, thiz, &rsDecoder->decoder.coder);
}

JNIEXPORT void JNICALL
Java_org_apache_hadoop_io_erasurecode_rawcoder_NativeRSRawDecoder_decodeImpl(
JNIEnv *env, jobject thiz, jobjectArray inputs, jintArray inputOffsets,
jint dataLen, jintArray erasedIndexes, jobjectArray outputs,
jintArray outputOffsets) {
  RSDecoder* rsDecoder = (RSDecoder*)getCoder(env, thiz);
  if (!rsDecoder) {
    THROW(env, "java/io/IOException", "NativeRSRawDecoder closed");
    return;
  }

  int numDataUnits = rsDecoder->decoder.coder.numDataUnits;
  int numParityUnits = rsDecoder->decoder.coder.numParityUnits;
  int chunkSize = (int)dataLen;

  int* tmpErasedIndexes = (int*)(*env)->GetIntArrayElements(env,
                                                        erasedIndexes, NULL);
  int numErased = (*env)->GetArrayLength(env, erasedIndexes);
  getInputs(env, inputs, inputOffsets, rsDecoder->inputs,
                                               numDataUnits + numParityUnits);
  getOutputs(env, outputs, outputOffsets, rsDecoder->outputs, numErased);

  decode(&rsDecoder->decoder, rsDecoder->inputs, tmpErasedIndexes,
                           numErased, rsDecoder->outputs, chunkSize);
  (*env)->ReleaseIntArrayElements(env, erasedIndexes, tmpErasedIndexes, 0);
}

JNIEXPORT void JNICALL
Java_org_apache_hadoop_io_erasurecode_rawcoder_NativeRSRawDecoder_destroyImpl(
JNIEnv *env, jobject thiz) {
  RSDecoder* rsDecoder = (RSDecoder*)getCoder(env, thiz);
  if (rsDecoder) {
    free(rsDecoder);
    setCoder(env, thiz, NULL);
  }
}
