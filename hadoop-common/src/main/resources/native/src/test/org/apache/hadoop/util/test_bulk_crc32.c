#include "org_apache_hadoop.h"

#include "bulk_crc32.h"

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define EXPECT_ZERO(x) \
    do { \
        int __my_ret__ = x; \
        if (__my_ret__) { \
            fprintf(stderr, "TEST_ERROR: failed on line %d with return " \
              "code %d: got nonzero from %s\n", __LINE__, __my_ret__, #x); \
            return __my_ret__; \
        } \
    } while (0);

static int testBulkVerifyCrc(int dataLen, int crcType, int bytesPerChecksum)
{
  int i;
  uint8_t *data;
  uint32_t *sums;
  crc32_error_t errorData;

  data = malloc(dataLen);
  for (i = 0; i < dataLen; i++) {
    data[i] = (i % 16) + 1;
  }
  sums = calloc(sizeof(uint32_t),
                (dataLen + bytesPerChecksum - 1) / bytesPerChecksum);

  EXPECT_ZERO(bulk_crc(data, dataLen, sums, crcType,
                                 bytesPerChecksum, NULL));
  EXPECT_ZERO(bulk_crc(data, dataLen, sums, crcType,
                            bytesPerChecksum, &errorData));
  free(data);
  free(sums);
  return 0;
}

static int timeBulkCrc(int dataLen, int crcType, int bytesPerChecksum, int iterations)
{
  int i;
  uint8_t *data;
  uint32_t *sums;
  crc32_error_t errorData;
  clock_t start, fini;

  data = malloc(dataLen);
  for (i = 0; i < dataLen; i++) {
    data[i] = (i % 16) + 1;
  }
  sums = calloc(sizeof(uint32_t),
                (dataLen + bytesPerChecksum - 1) / bytesPerChecksum);

  start = clock();
  for (i = 0; i < iterations; i++) {
    EXPECT_ZERO(bulk_crc(data, dataLen, sums, crcType,
				   bytesPerChecksum, NULL));
    EXPECT_ZERO(bulk_crc(data, dataLen, sums, crcType,
			      bytesPerChecksum, &errorData));
  }
  fini = clock();
  printf("CRC %d bytes @ %d bytes per checksum X %d iterations = %g\n",
          dataLen, bytesPerChecksum, iterations, (double)(fini-start)/CLOCKS_PER_SEC);
  free(data);
  free(sums);
  return 0;
}

int main(int argc, char **argv)
{
  /* Test running bulk_calculate_crc with some different algorithms and
   * bytePerChecksum values. */
  EXPECT_ZERO(testBulkVerifyCrc(4096, CRC32C_POLYNOMIAL, 512));
  EXPECT_ZERO(testBulkVerifyCrc(4096, CRC32_ZLIB_POLYNOMIAL, 512));
  EXPECT_ZERO(testBulkVerifyCrc(256, CRC32C_POLYNOMIAL, 1));
  EXPECT_ZERO(testBulkVerifyCrc(256, CRC32_ZLIB_POLYNOMIAL, 1));
  EXPECT_ZERO(testBulkVerifyCrc(1, CRC32C_POLYNOMIAL, 1));
  EXPECT_ZERO(testBulkVerifyCrc(1, CRC32_ZLIB_POLYNOMIAL, 1));
  EXPECT_ZERO(testBulkVerifyCrc(2, CRC32C_POLYNOMIAL, 1));
  EXPECT_ZERO(testBulkVerifyCrc(17, CRC32C_POLYNOMIAL, 1));
  EXPECT_ZERO(testBulkVerifyCrc(17, CRC32C_POLYNOMIAL, 2));
  EXPECT_ZERO(testBulkVerifyCrc(17, CRC32_ZLIB_POLYNOMIAL, 2));
  EXPECT_ZERO(testBulkVerifyCrc(17, CRC32C_POLYNOMIAL, 4));
  EXPECT_ZERO(testBulkVerifyCrc(17, CRC32_ZLIB_POLYNOMIAL, 4));

  EXPECT_ZERO(timeBulkCrc(16 * 1024, CRC32C_POLYNOMIAL, 512, 1000000));
  EXPECT_ZERO(timeBulkCrc(16 * 1024, CRC32_ZLIB_POLYNOMIAL, 512, 1000000));

  fprintf(stderr, "%s: SUCCESS.\n", argv[0]);
  return EXIT_SUCCESS;
}
