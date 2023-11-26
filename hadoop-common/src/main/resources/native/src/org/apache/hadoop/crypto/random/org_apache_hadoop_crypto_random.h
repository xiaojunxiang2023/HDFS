#ifndef ORG_APACHE_HADOOP_CRYPTO_RANDOM_H
#define ORG_APACHE_HADOOP_CRYPTO_RANDOM_H

#include "org_apache_hadoop.h"

#ifdef UNIX
#include <dlfcn.h>
#include "config.h"
#endif

#ifdef WINDOWS
#include "winutils.h"
#endif

#define UNUSED(x) ((void)(x))

#include <openssl/crypto.h>
#include <openssl/engine.h>
#include <openssl/rand.h>
#include <openssl/err.h>

#endif //ORG_APACHE_HADOOP_CRYPTO_RANDOM_H