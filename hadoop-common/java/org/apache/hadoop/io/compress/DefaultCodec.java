package org.apache.hadoop.io.compress;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.compress.zlib.ZlibDecompressor;
import org.apache.hadoop.io.compress.zlib.ZlibFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_DEFAULT;
import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_KEY;
public class DefaultCodec implements Configurable, CompressionCodec, DirectDecompressionCodec {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultCodec.class);
  
  Configuration conf;

  @Override
  public void setConf(Configuration conf) {
    this.conf = conf;
  }
  
  @Override
  public Configuration getConf() {
    return conf;
  }
  
  @Override
  public CompressionOutputStream createOutputStream(OutputStream out) 
  throws IOException {
    return CompressionCodec.Util.
        createOutputStreamWithCodecPool(this, conf, out);
  }

  @Override
  public CompressionOutputStream createOutputStream(OutputStream out, 
                                                    Compressor compressor) 
  throws IOException {
    return new CompressorStream(out, compressor, 
                                conf.getInt(IO_FILE_BUFFER_SIZE_KEY,
                                        IO_FILE_BUFFER_SIZE_DEFAULT));
  }

  @Override
  public Class<? extends Compressor> getCompressorType() {
    return ZlibFactory.getZlibCompressorType(conf);
  }

  @Override
  public Compressor createCompressor() {
    return ZlibFactory.getZlibCompressor(conf);
  }

  @Override
  public CompressionInputStream createInputStream(InputStream in) 
  throws IOException {
    return CompressionCodec.Util.
        createInputStreamWithCodecPool(this, conf, in);
  }

  @Override
  public CompressionInputStream createInputStream(InputStream in, 
                                                  Decompressor decompressor) 
  throws IOException {
    return new DecompressorStream(in, decompressor, 
                                  conf.getInt(IO_FILE_BUFFER_SIZE_KEY,
                                      IO_FILE_BUFFER_SIZE_DEFAULT));
  }

  @Override
  public Class<? extends Decompressor> getDecompressorType() {
    return ZlibFactory.getZlibDecompressorType(conf);
  }

  @Override
  public Decompressor createDecompressor() {
    return ZlibFactory.getZlibDecompressor(conf);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public DirectDecompressor createDirectDecompressor() {
    return ZlibFactory.getZlibDirectDecompressor(conf);
  }
  
  
  @Override
  public String getDefaultExtension() {
    return CodecConstants.DEFAULT_CODEC_EXTENSION;
  }

}
