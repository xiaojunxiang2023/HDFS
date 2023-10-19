package org.apache.hadoop.io.serializer.avro;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Tag interface for Avro 'reflect' serializable classes. Classes implementing 
 * this interface can be serialized/deserialized using 
 * {@link AvroReflectSerialization}.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface AvroReflectSerializable {

}
