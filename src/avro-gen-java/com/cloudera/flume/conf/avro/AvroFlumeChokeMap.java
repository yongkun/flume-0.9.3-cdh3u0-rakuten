/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.cloudera.flume.conf.avro;

@SuppressWarnings("all")
public class AvroFlumeChokeMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"AvroFlumeChokeMap\",\"namespace\":\"com.cloudera.flume.conf.avro\",\"fields\":[{\"name\":\"chokemap\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":\"int\"}}}]}");
  public java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.Integer>> chokemap;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return chokemap;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: chokemap = (java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.Integer>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}