/**
 * Dump utilities for erasure coders.
 */

#ifndef _DUMP_H_
#define _DUMP_H_

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void dumpEncoder(IsalEncoder* pCoder);

void dumpDecoder(IsalDecoder* pCoder);

void dump(unsigned char* buf, int len);

void dumpMatrix(unsigned char** s, int k, int m);

void dumpCodingMatrix(unsigned char* s, int n1, int n2);

#endif //_DUMP_H_
