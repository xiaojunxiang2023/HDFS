package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.thirdparty.com.google.common.base.Objects;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.util.StringUtils;

public class QuotaByStorageTypeEntry {
   private StorageType type;
   private long quota;

   public StorageType getStorageType() {
     return type;
   }

   public long getQuota() {
     return quota;
   }

   @Override
   public boolean equals(Object o){
     if (o == null) {
       return false;
     }
     if (getClass() != o.getClass()) {
       return false;
     }
     QuotaByStorageTypeEntry other = (QuotaByStorageTypeEntry)o;
     return Objects.equal(type, other.type) && Objects.equal(quota, other.quota);
   }

   @Override
   public int hashCode() {
     return Objects.hashCode(type, quota);
   }

   @Override
   public String toString() {
     StringBuilder sb = new StringBuilder();
     assert (type != null);
    sb.append(StringUtils.toLowerCase(type.toString()))
        .append(':')
        .append(quota);
     return sb.toString();
   }

   public static class Builder {
     private StorageType type;
     private long quota;

     public Builder setStorageType(StorageType type) {
       this.type = type;
       return this;
     }

     public Builder setQuota(long quota) {
       this.quota = quota;
       return this;
     }

     public QuotaByStorageTypeEntry build() {
       return new QuotaByStorageTypeEntry(type, quota);
     }
   }

   private QuotaByStorageTypeEntry(StorageType type, long quota) {
     this.type = type;
     this.quota = quota;
   }
 }
