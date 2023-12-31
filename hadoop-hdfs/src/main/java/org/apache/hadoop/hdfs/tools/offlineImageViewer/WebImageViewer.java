package org.apache.hadoop.hdfs.tools.offlineImageViewer;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;
import org.apache.hadoop.security.UserGroupInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * WebImageViewer loads a fsimage and exposes read-only WebHDFS API for its
 * namespace.
 */
public class WebImageViewer implements Closeable {
  public static final Logger LOG =
      LoggerFactory.getLogger(WebImageViewer.class);
  private final ServerBootstrap bootstrap;
  private final EventLoopGroup bossGroup;
  private final EventLoopGroup workerGroup;
  private final ChannelGroup allChannels;
  private final Configuration conf;
  private Channel channel;
  private InetSocketAddress address;

  public WebImageViewer(InetSocketAddress address) {
    this(address, new Configuration());
  }

  public WebImageViewer(InetSocketAddress address, Configuration conf) {
    this.address = address;
    this.bossGroup = new NioEventLoopGroup();
    this.workerGroup = new NioEventLoopGroup();
    this.allChannels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    this.bootstrap = new ServerBootstrap()
        .group(bossGroup, workerGroup)
        .channel(NioServerSocketChannel.class);
    this.conf = conf;
    UserGroupInformation.setConfiguration(conf);
  }

  /**
   * Start WebImageViewer and wait until the thread is interrupted.
   * @param fsimage the fsimage to load.
   * @throws IOException if failed to load the fsimage.
   * @throws RuntimeException if security is enabled in configuration.
   */
  public void start(String fsimage) throws IOException {
    try {
      if (UserGroupInformation.isSecurityEnabled()) {
        throw new RuntimeException(
            "WebImageViewer does not support secure mode. To start in " +
                "non-secure mode, pass -D" +
                CommonConfigurationKeysPublic.HADOOP_SECURITY_AUTHENTICATION +
                "=simple");
      }
      initServer(fsimage);
      channel.closeFuture().await();
    } catch (InterruptedException e) {
      LOG.info("Interrupted. Stopping the WebImageViewer.");
      close();
    }
  }

  /**
   * Start WebImageViewer.
   * @param fsimage the fsimage to load.
   * @throws IOException if fail to load the fsimage.
   */

  public void initServer(String fsimage)
      throws IOException, InterruptedException {
    final FSImageLoader loader = FSImageLoader.load(fsimage);

    bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
      @Override
      protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline p = ch.pipeline();
        p.addLast(new HttpRequestDecoder(),
            new StringEncoder(),
            new HttpResponseEncoder(),
            new FSImageHandler(loader, allChannels));
      }
    });

    channel = bootstrap.bind(address).sync().channel();
    allChannels.add(channel);

    address = (InetSocketAddress) channel.localAddress();
    LOG.info("WebImageViewer started. Listening on " + address.toString() + ". Press Ctrl+C to stop the viewer.");
  }

  /**
   * Get the listening port.
   * @return the port WebImageViewer is listening on
   */

  public int getPort() {
    return address.getPort();
  }

  @Override
  public void close() {
    allChannels.close().awaitUninterruptibly();
    bossGroup.shutdownGracefully();
    workerGroup.shutdownGracefully();
  }
}
