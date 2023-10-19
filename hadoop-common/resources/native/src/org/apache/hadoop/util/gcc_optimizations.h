#ifndef __GCC_OPTIMIZATIONS_H_INCLUDED
#define __GCC_OPTIMIZATIONS_H_INCLUDED

// Hints to gcc optimizer -- compiled out on non-GCC
#ifdef __GNUC__
#define likely(x)       __builtin_expect((x),1)
#define unlikely(x)     __builtin_expect((x),0)
#else
#define likely(x)       (x)
#define unlikely(x)     (x)
#endif

#endif
