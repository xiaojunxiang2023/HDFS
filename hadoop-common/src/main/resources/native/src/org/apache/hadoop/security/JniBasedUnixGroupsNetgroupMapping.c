#include <jni.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/mman.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include <stdlib.h>
#include <errno.h>
#include <grp.h>
#include <stdio.h>
#include <pwd.h>
#include <string.h>

#include <netdb.h>

#include "org_apache_hadoop_security_JniBasedUnixGroupsNetgroupMapping.h"
#include "org_apache_hadoop.h"

struct listElement {
   char * string;
   struct listElement * next;
};

typedef struct listElement UserList;

JNIEXPORT jobjectArray JNICALL 
Java_org_apache_hadoop_security_JniBasedUnixGroupsNetgroupMapping_getUsersForNetgroupJNI
(JNIEnv *env, jobject jobj, jstring jgroup) {
  UserList *userListHead = NULL;
  UserList *current = NULL;
  int       userListSize = 0;

  // pointers to free at the end
  const char *cgroup  = NULL;
  jobjectArray jusers = NULL;

  // do we need to end the group lookup?
  int setnetgrentCalledFlag = 0;

  // if not NULL then THROW exception
  char *errorType = NULL;
  char *errorMessage = NULL;

  cgroup = (*env)->GetStringUTFChars(env, jgroup, NULL);
  if (cgroup == NULL) {
    goto END;
  }

  //--------------------------------------------------
  // get users
  // see man pages for setnetgrent, getnetgrent and endnetgrent

  // set the name of the group for subsequent calls to getnetgrent
  // note that we want to end group lokup regardless whether setnetgrent
  // was successful or not (as long as it was called we need to call
  // endnetgrent)
  setnetgrentCalledFlag = 1;
#if defined(__FreeBSD__) || defined(__MACH__)
  setnetgrent(cgroup);
  {
#else
  if(setnetgrent(cgroup) == 1) {
#endif
    current = NULL;
    // three pointers are for host, user, domain, we only care
    // about user now
    char *p[3];
    while(getnetgrent(p, p + 1, p + 2)) {
      if(p[1]) {
        current = (UserList *)malloc(sizeof(UserList));
        current->string = malloc(strlen(p[1]) + 1);
        strcpy(current->string, p[1]);
        current->next = userListHead;
        userListHead = current;
        userListSize++;
      }
    }
  }
#if defined(__linux__)
  else {
    errorType = "java/io/IOException";
    errorMessage =
        "no netgroup of this name is known or some other error occurred";
    goto END;
  }
#endif
  //--------------------------------------------------
  // build return data (java array)

  jusers = (jobjectArray)(*env)->NewObjectArray(env,
    userListSize, 
    (*env)->FindClass(env, "java/lang/String"),
    NULL);
  if (jusers == NULL) {
    errorType = "java/lang/OutOfMemoryError";
    goto END;
  }

  current = NULL;

  // note that the loop iterates over list but also over array (i)
  int i = 0;
  for(current = userListHead; current != NULL; current = current->next) {
    jstring juser = (*env)->NewStringUTF(env, current->string);
    if (juser == NULL) {
      errorType = "java/lang/OutOfMemoryError";
      goto END;
    }
    (*env)->SetObjectArrayElement(env, jusers, i++, juser);
  }


END:

  // cleanup
  if(cgroup) { (*env)->ReleaseStringUTFChars(env, jgroup, cgroup); }
  if(setnetgrentCalledFlag) { endnetgrent(); }
  while(userListHead) {
    UserList *current = userListHead;
    userListHead = userListHead->next;
    if(current->string) { free(current->string); }
    free(current);
  }

  // return results or THROW
  if(errorType) {
    THROW(env, errorType, errorMessage);
    return NULL;
  } else {
    return jusers;
  }
}
