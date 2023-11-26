#ifndef ORG_APACHE_HADOOP_CRYPTO_H
#define ORG_APACHE_HADOOP_CRYPTO_H

#include "org_apache_hadoop.h"

#ifdef UNIX
#include <dlfcn.h>
#include "config.h"
#endif

#ifdef WINDOWS
#include "winutils.h"
#endif

#include <openssl/aes.h>
#include <openssl/evp.h>
#include <openssl/err.h>

/**
 * A helper macro to convert the java 'context-handle' 
 * to a EVP_CIPHER_CTX pointer. 
 */
#define CONTEXT(context) ((EVP_CIPHER_CTX*)((ptrdiff_t)(context)))

/**
 * A helper macro to convert the EVP_CIPHER_CTX pointer to the 
 * java 'context-handle'.
 */
#define JLONG(context) ((jlong)((ptrdiff_t)(context)))

#define KEY_LENGTH_128 16
#define KEY_LENGTH_256 32
#define IV_LENGTH 16

#define ENCRYPT_MODE 1
#define DECRYPT_MODE 0

/** Currently only support AES/CTR/NoPadding. */
#define AES_CTR 0
#define NOPADDING 0
#define PKCSPADDING 1

#endif //ORG_APACHE_HADOOP_CRYPTO_H