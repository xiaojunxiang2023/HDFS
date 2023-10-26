package org.apache.hadoop.hdfs.net;
import org.apache.hadoop.hdfs.DFSUtilClient;
import org.apache.hadoop.hdfs.server.datanode.SecureDataNodeStarter.SecureResources;
import org.apache.hadoop.ipc.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketTimeoutException;
import java.nio.channels.ServerSocketChannel;
public class TcpPeerServer implements PeerServer {
    static final Logger LOG = LoggerFactory.getLogger(TcpPeerServer.class);

    private final ServerSocket serverSocket;

    /**
     * Create a non-secure TcpPeerServer.
     *
     * @param socketWriteTimeout    The Socket write timeout in ms.
     * @param bindAddr              The address to bind to.
     * @param backlogLength         The length of the tcp accept backlog
     * @throws IOException
     */
    public TcpPeerServer(int socketWriteTimeout,
                         InetSocketAddress bindAddr,
                         int backlogLength) throws IOException {
        this.serverSocket = (socketWriteTimeout > 0) ?
                ServerSocketChannel.open().socket() : new ServerSocket();
        Server.bind(serverSocket, bindAddr, backlogLength);
    }

    /**
     * Create a secure TcpPeerServer.
     *
     * @param secureResources   Security resources.
     */
    public TcpPeerServer(SecureResources secureResources) {
        this.serverSocket = secureResources.getStreamingSocket();
    }

    /**
     * @return the IP address which this TcpPeerServer is listening on.
     */
    public InetSocketAddress getStreamingAddr() {
        return new InetSocketAddress(
                serverSocket.getInetAddress().getHostAddress(),
                serverSocket.getLocalPort());
    }

    @Override
    public int getReceiveBufferSize() throws IOException {
        return this.serverSocket.getReceiveBufferSize();
    }

    @Override
    public void setReceiveBufferSize(int size) throws IOException {
        this.serverSocket.setReceiveBufferSize(size);
    }

    @Override
    public Peer accept() throws IOException, SocketTimeoutException {
        Peer peer = DFSUtilClient.peerFromSocket(serverSocket.accept());
        return peer;
    }

    @Override
    public String getListeningString() {
        return serverSocket.getLocalSocketAddress().toString();
    }

    @Override
    public void close() throws IOException {
        try {
            serverSocket.close();
        } catch (IOException e) {
            LOG.error("error closing TcpPeerServer: ", e);
        }
    }

    @Override
    public String toString() {
        return "TcpPeerServer(" + getListeningString() + ")";
    }
}
