/**
 * This is a sample program illustrating how to use the Intel ISA-L library.
 * Note it's adapted from erasure_code_test.c test program, but trying to use
 * variable names and styles we're more familiar with already similar to Java
 * coders.
 */

#ifndef _ERASURE_CODER_H_
#define _ERASURE_CODER_H_

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MMAX 14
#define KMAX 10

typedef struct _IsalCoder {
  int verbose;
  int numParityUnits;
  int numDataUnits;
  int numAllUnits;
} IsalCoder;

typedef struct _IsalEncoder {
  IsalCoder coder;

  unsigned char gftbls[MMAX * KMAX * 32];

  unsigned char encodeMatrix[MMAX * KMAX];
} IsalEncoder;

typedef struct _IsalDecoder {
  IsalCoder coder;

  unsigned char encodeMatrix[MMAX * KMAX];

  // Below are per decode call
  unsigned char gftbls[MMAX * KMAX * 32];
  unsigned int decodeIndex[MMAX];
  unsigned char tmpMatrix[MMAX * KMAX];
  unsigned char invertMatrix[MMAX * KMAX];
  unsigned char decodeMatrix[MMAX * KMAX];
  unsigned char erasureFlags[MMAX];
  int erasedIndexes[MMAX];
  int numErased;
  int numErasedDataUnits;
  unsigned char* realInputs[MMAX];
} IsalDecoder;

void initCoder(IsalCoder* pCoder, int numDataUnits, int numParityUnits);

void allowVerbose(IsalCoder* pCoder, int flag);

void initEncoder(IsalEncoder* encoder, int numDataUnits, int numParityUnits);

void initDecoder(IsalDecoder* decoder, int numDataUnits, int numParityUnits);

void clearDecoder(IsalDecoder* decoder);

int encode(IsalEncoder* encoder, unsigned char** dataUnits,
    unsigned char** parityUnits, int chunkSize);

int decode(IsalDecoder* decoder, unsigned char** allUnits,
    int* erasedIndexes, int numErased,
    unsigned char** recoveredUnits, int chunkSize);

int generateDecodeMatrix(IsalDecoder* pCoder);

#endif //_ERASURE_CODER_H_
