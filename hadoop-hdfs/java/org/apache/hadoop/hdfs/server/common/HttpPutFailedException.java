package org.apache.hadoop.hdfs.server.common;

import org.apache.hadoop.classification.InterfaceAudience;

import java.io.IOException;

@InterfaceAudience.Private
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
