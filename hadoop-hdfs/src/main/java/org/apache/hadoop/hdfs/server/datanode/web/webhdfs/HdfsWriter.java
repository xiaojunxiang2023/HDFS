package org.apache.hadoop.hdfs.server.datanode.web.webhdfs;

import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultHttpResponse;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.LastHttpContent;
import org.apache.hadoop.hdfs.DFSClient;
import org.apache.hadoop.io.IOUtils;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.OutputStream;

import static io.netty.handler.codec.http.HttpHeaders.Names.CONNECTION;
import static io.netty.handler.codec.http.HttpHeaders.Values.CLOSE;

class HdfsWriter extends SimpleChannelInboundHandler<HttpContent> {
    private static final Logger LOG = WebHdfsHandler.LOG;
    private final DFSClient client;
    private final OutputStream out;
    private final DefaultHttpResponse response;

    HdfsWriter(DFSClient client, OutputStream out, DefaultHttpResponse response) {
        this.client = client;
        this.out = out;
        this.response = response;
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpContent chunk)
            throws IOException {
        chunk.content().readBytes(out, chunk.content().readableBytes());
        if (chunk instanceof LastHttpContent) {
            try {
                releaseDfsResourcesAndThrow();
                response.headers().set(CONNECTION, CLOSE);
                ctx.write(response).addListener(ChannelFutureListener.CLOSE);
            } catch (Exception cause) {
                exceptionCaught(ctx, cause);
            }
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        releaseDfsResources();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        releaseDfsResources();
        DefaultHttpResponse resp = ExceptionHandler.exceptionCaught(cause);
        resp.headers().set(CONNECTION, CLOSE);
        ctx.writeAndFlush(resp).addListener(ChannelFutureListener.CLOSE);
        if (LOG != null && LOG.isDebugEnabled()) {
            LOG.debug("Exception in channel handler ", cause);
        }
    }

    private void releaseDfsResources() {
        IOUtils.cleanupWithLogger(LOG, out);
        IOUtils.cleanupWithLogger(LOG, client);
    }

    private void releaseDfsResourcesAndThrow() throws Exception {
        out.close();
        client.close();
    }
}
