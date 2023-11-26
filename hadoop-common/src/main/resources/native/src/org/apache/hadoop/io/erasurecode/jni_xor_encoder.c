#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <jni.h>

#include "org_apache_hadoop.h"
#include "erasure_code.h"
#include "gf_util.h"
#include "jni_common.h"
#include "org_apache_hadoop_io_erasurecode_rawcoder_NativeXORRawEncoder.h"

typedef struct _XOREncoder {
  IsalCoder isalCoder;
  unsigned char* inputs[MMAX];
  unsigned char* outputs[KMAX];
} XOREncoder;

JNIEXPORT void JNICALL
Java_org_apache_hadoop_io_erasurecode_rawcoder_NativeXORRawEncoder_initImpl
  (JNIEnv *env, jobject thiz, jint numDataUnits, jint numParityUnits) {
  XOREncoder* xorEncoder =
                           (XOREncoder*)malloc(sizeof(XOREncoder));
  memset(xorEncoder, 0, sizeof(*xorEncoder));
  initCoder(&xorEncoder->isalCoder, numDataUnits, numParityUnits);

  setCoder(env, thiz, &xorEncoder->isalCoder);
}

JNIEXPORT void JNICALL
Java_org_apache_hadoop_io_erasurecode_rawcoder_NativeXORRawEncoder_encodeImpl(
  JNIEnv *env, jobject thiz, jobjectArray inputs, jintArray inputOffsets,
  jint dataLen, jobjectArray outputs, jintArray outputOffsets) {

  int i, j, numDataUnits, numParityUnits, chunkSize;
  XOREncoder* xorEncoder;

  xorEncoder = (XOREncoder*)getCoder(env, thiz);
  if (!xorEncoder) {
    THROW(env, "java/io/IOException", "NativeXORRawEncoder closed");
    return;
  }
  numDataUnits = ((IsalCoder*)xorEncoder)->numDataUnits;
  numParityUnits = ((IsalCoder*)xorEncoder)->numParityUnits;
  chunkSize = (int)dataLen;

  getInputs(env, inputs, inputOffsets, xorEncoder->inputs, numDataUnits);
  getOutputs(env, outputs, outputOffsets, xorEncoder->outputs, numParityUnits);

  // Get the first buffer's data.
  for (j = 0; j < chunkSize; j++) {
    xorEncoder->outputs[0][j] = xorEncoder->inputs[0][j];
  }

  // XOR with everything else.
  for (i = 1; i < numDataUnits; i++) {
    for (j = 0; j < chunkSize; j++) {
      xorEncoder->outputs[0][j] ^= xorEncoder->inputs[i][j];
    }
  }
}

JNIEXPORT void JNICALL
Java_org_apache_hadoop_io_erasurecode_rawcoder_NativeXORRawEncoder_destroyImpl
  (JNIEnv *env, jobject thiz) {
  XOREncoder* xorEncoder = (XOREncoder*)getCoder(env, thiz);
  if (xorEncoder) {
    free(xorEncoder);
    setCoder(env, thiz, NULL);
  }
}
