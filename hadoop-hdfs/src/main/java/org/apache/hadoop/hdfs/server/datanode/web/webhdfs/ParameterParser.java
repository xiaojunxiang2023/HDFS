package org.apache.hadoop.hdfs.server.datanode.web.webhdfs;

import io.netty.handler.codec.http.QueryStringDecoder;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CreateFlag;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.hdfs.HAUtilClient;
import org.apache.hadoop.hdfs.security.token.delegation.DelegationTokenIdentifier;
import org.apache.hadoop.hdfs.web.resources.*;
import org.apache.hadoop.security.SecurityUtil;
import org.apache.hadoop.security.token.Token;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import static org.apache.hadoop.hdfs.protocol.HdfsConstants.HDFS_URI_SCHEME;
import static org.apache.hadoop.hdfs.server.datanode.web.webhdfs.WebHdfsHandler.WEBHDFS_PREFIX_LENGTH;

class ParameterParser {
    private final Configuration conf;
    private final String path;
    private final Map<String, List<String>> params;

    ParameterParser(QueryStringDecoder decoder, Configuration conf) {
        this.path = decoder.path().substring(WEBHDFS_PREFIX_LENGTH);
        this.params = decoder.parameters();
        this.conf = conf;
    }

    /**
     * Helper to decode half of a hexadecimal number from a string.
     * @param c The ASCII character of the hexadecimal number to decode.
     * Must be in the range {@code [0-9a-fA-F]}.
     * @return The hexadecimal value represented in the ASCII character
     * given, or {@link Character#MAX_VALUE} if the character is invalid.
     */
    private static char decodeHexNibble(final char c) {
        if ('0' <= c && c <= '9') {
            return (char) (c - '0');
        } else if ('a' <= c && c <= 'f') {
            return (char) (c - 'a' + 10);
        } else if ('A' <= c && c <= 'F') {
            return (char) (c - 'A' + 10);
        } else {
            return Character.MAX_VALUE;
        }
    }

    String path() {
        return path;
    }

    String op() {
        return param(HttpOpParam.NAME);
    }

    long offset() {
        return new OffsetParam(param(OffsetParam.NAME)).getOffset();
    }

    long length() {
        return new LengthParam(param(LengthParam.NAME)).getLength();
    }

    String namenodeId() {
        return new NamenodeAddressParam(param(NamenodeAddressParam.NAME))
                .getValue();
    }

    String doAsUser() {
        return new DoAsParam(param(DoAsParam.NAME)).getValue();
    }

    String userName() {
        return new UserParam(param(UserParam.NAME)).getValue();
    }

    int bufferSize() {
        return new BufferSizeParam(param(BufferSizeParam.NAME)).getValue(conf);
    }

    long blockSize() {
        return new BlockSizeParam(param(BlockSizeParam.NAME)).getValue(conf);
    }

    short replication() {
        return new ReplicationParam(param(ReplicationParam.NAME)).getValue(conf);
    }

    FsPermission permission() {
        return new PermissionParam(param(PermissionParam.NAME)).
                getFileFsPermission();
    }

    FsPermission unmaskedPermission() {
        String value = param(UnmaskedPermissionParam.NAME);
        return value == null ? null :
                new UnmaskedPermissionParam(value).getFileFsPermission();
    }

    boolean overwrite() {
        return new OverwriteParam(param(OverwriteParam.NAME)).getValue();
    }

    boolean noredirect() {
        return new NoRedirectParam(param(NoRedirectParam.NAME)).getValue();
    }

    Token<DelegationTokenIdentifier> delegationToken() throws IOException {
        String delegation = param(DelegationParam.NAME);
        final Token<DelegationTokenIdentifier> token = new
                Token<DelegationTokenIdentifier>();
        token.decodeFromUrlString(delegation);
        URI nnUri = URI.create(HDFS_URI_SCHEME + "://" + namenodeId());
        boolean isLogical = HAUtilClient.isLogicalUri(conf, nnUri);
        if (isLogical) {
            token.setService(
                    HAUtilClient.buildTokenServiceForLogicalUri(nnUri, HDFS_URI_SCHEME));
        } else {
            token.setService(SecurityUtil.buildTokenService(nnUri));
        }
        return token;
    }

    public boolean createParent() {
        return new CreateParentParam(param(CreateParentParam.NAME)).getValue();
    }

    public EnumSet<CreateFlag> createFlag() {
        String cf = "";
        if (param(CreateFlagParam.NAME) != null) {
            QueryStringDecoder decoder = new QueryStringDecoder(
                    param(CreateFlagParam.NAME),
                    StandardCharsets.UTF_8);
            cf = decoder.path();
        }
        return new CreateFlagParam(cf).getValue();
    }

    Configuration conf() {
        return conf;
    }

    private String param(String key) {
        List<String> p = params.get(key);
        return p == null ? null : p.get(0);
    }
}
