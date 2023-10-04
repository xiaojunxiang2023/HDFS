package org.apache.hadoop.hdfs.net;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.net.unix.DomainSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.SocketTimeoutException;

@InterfaceAudience.Private
public class DomainPeerServer implements PeerServer {
    static final Logger LOG = LoggerFactory.getLogger(DomainPeerServer.class);
    private final DomainSocket sock;

    DomainPeerServer(DomainSocket sock) {
        this.sock = sock;
    }

    public DomainPeerServer(String path, int port)
            throws IOException {
        this(DomainSocket.bindAndListen(DomainSocket.getEffectivePath(path, port)));
    }

    public String getBindPath() {
        return sock.getPath();
    }

    @Override
    public int getReceiveBufferSize() throws IOException {
        return sock.getAttribute(DomainSocket.RECEIVE_BUFFER_SIZE);
    }

    @Override
    public void setReceiveBufferSize(int size) throws IOException {
        sock.setAttribute(DomainSocket.RECEIVE_BUFFER_SIZE, size);
    }

    @Override
    public Peer accept() throws IOException, SocketTimeoutException {
        DomainSocket connSock = sock.accept();
        Peer peer = null;
        boolean success = false;
        try {
            peer = new DomainPeer(connSock);
            success = true;
            return peer;
        } finally {
            if (!success) {
                if (peer != null) peer.close();
                connSock.close();
            }
        }
    }

    @Override
    public String getListeningString() {
        return "unix:" + sock.getPath();
    }

    @Override
    public void close() throws IOException {
        try {
            sock.close();
        } catch (IOException e) {
            LOG.error("error closing DomainPeerServer: ", e);
        }
    }

    @Override
    public String toString() {
        return "DomainPeerServer(" + getListeningString() + ")";
    }
}
