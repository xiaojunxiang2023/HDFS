package org.apache.hadoop.security;

/**
 * Some constants for IdMapping
 */
public class IdMappingConstant {

  /** Do user/group update every 15 minutes by default, minimum 1 minute */
  public final static String USERGROUPID_UPDATE_MILLIS_KEY = "usergroupid.update.millis";
  public final static long USERGROUPID_UPDATE_MILLIS_DEFAULT = 15 * 60 * 1000; // ms
  public final static long USERGROUPID_UPDATE_MILLIS_MIN = 1 * 60 * 1000; // ms

  public final static String UNKNOWN_USER = "nobody";
  public final static String UNKNOWN_GROUP = "nobody";
  
  // Used for finding the configured static mapping file.
  public static final String STATIC_ID_MAPPING_FILE_KEY = "static.id.mapping.file";
  public static final String STATIC_ID_MAPPING_FILE_DEFAULT = "/etc/nfs.map";
}
