package org.apache.hadoop.hdfs.server.datanode.web;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.HttpRequest;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.datanode.web.webhdfs.WebHdfsHandler;

import java.net.InetSocketAddress;

import static org.apache.hadoop.hdfs.server.datanode.web.webhdfs.WebHdfsHandler.WEBHDFS_PREFIX;

class URLDispatcher extends SimpleChannelInboundHandler<HttpRequest> {
    private final InetSocketAddress proxyHost;
    private final Configuration conf;
    private final Configuration confForCreate;

    URLDispatcher(InetSocketAddress proxyHost, Configuration conf,
                  Configuration confForCreate) {
        this.proxyHost = proxyHost;
        this.conf = conf;
        this.confForCreate = confForCreate;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpRequest req)
            throws Exception {
        String uri = req.getUri();
        ChannelPipeline p = ctx.pipeline();
        if (uri.startsWith(WEBHDFS_PREFIX)) {
            WebHdfsHandler h = new WebHdfsHandler(conf, confForCreate);
            p.replace(this, WebHdfsHandler.class.getSimpleName(), h);
            h.channelRead0(ctx, req);
        } else {
            SimpleHttpProxyHandler h = new SimpleHttpProxyHandler(proxyHost);
            p.replace(this, SimpleHttpProxyHandler.class.getSimpleName(), h);
            h.channelRead0(ctx, req);
        }
    }
}
