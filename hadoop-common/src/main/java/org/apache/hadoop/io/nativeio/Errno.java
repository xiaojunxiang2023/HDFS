package org.apache.hadoop.io.nativeio;

/**
 * Enum representing POSIX errno values.
 */
public enum Errno {
  EPERM,
  ENOENT,
  ESRCH,
  EINTR,
  EIO,
  ENXIO,
  E2BIG,
  ENOEXEC,
  EBADF,
  ECHILD,
  EAGAIN,
  ENOMEM,
  EACCES,
  EFAULT,
  ENOTBLK,
  EBUSY,
  EEXIST,
  EXDEV,
  ENODEV,
  ENOTDIR,
  EISDIR,
  EINVAL,
  ENFILE,
  EMFILE,
  ENOTTY,
  ETXTBSY,
  EFBIG,
  ENOSPC,
  ESPIPE,
  EROFS,
  EMLINK,
  EPIPE,
  EDOM,
  ERANGE,
  ELOOP,
  ENAMETOOLONG,
  ENOTEMPTY,
  EOVERFLOW,

  UNKNOWN;
}
