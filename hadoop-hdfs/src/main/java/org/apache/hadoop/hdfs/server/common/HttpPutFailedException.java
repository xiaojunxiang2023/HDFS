package org.apache.hadoop.hdfs.server.common;

import java.io.IOException;
public class HttpPutFailedException extends IOException {
    private static final long serialVersionUID = 1L;
    private final int responseCode;

    public HttpPutFailedException(String msg, int responseCode) throws IOException {
        super(msg);
        this.responseCode = responseCode;
    }

    public int getResponseCode() {
        return responseCode;
    }
}
