package org.apache.hadoop.hdfs.server.sps;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.DFSUtil;
import org.apache.hadoop.hdfs.HdfsConfiguration;
import org.apache.hadoop.hdfs.protocol.HdfsConstants.StoragePolicySatisfierMode;
import org.apache.hadoop.hdfs.server.balancer.NameNodeConnector;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants;
import org.apache.hadoop.hdfs.server.namenode.sps.StoragePolicySatisfier;
import org.apache.hadoop.net.NetUtils;
import org.apache.hadoop.security.SecurityUtil;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.List;

import static org.apache.hadoop.util.ExitUtil.terminate;

/**
 * This class starts and runs external SPS service.
 */
public final class ExternalStoragePolicySatisfier {
    public static final Logger LOG = LoggerFactory
            .getLogger(ExternalStoragePolicySatisfier.class);

    private ExternalStoragePolicySatisfier() {
        // This is just a class to start and run external sps.
    }

    /**
     * Main method to start SPS service.
     */
    public static void main(String[] args) throws Exception {
        NameNodeConnector nnc = null;
        try {
            StringUtils.startupShutdownMessage(StoragePolicySatisfier.class, args,
                    LOG);
            HdfsConfiguration spsConf = new HdfsConfiguration();
            // login with SPS keytab
            secureLogin(spsConf);
            StoragePolicySatisfier sps = new StoragePolicySatisfier(spsConf);
            nnc = getNameNodeConnector(spsConf);

            ExternalSPSContext context = new ExternalSPSContext(sps, nnc);
            sps.init(context);
            sps.start(StoragePolicySatisfierMode.EXTERNAL);
            if (sps != null) {
                sps.join();
            }
        } catch (Throwable e) {
            LOG.error("Failed to start storage policy satisfier.", e);
            terminate(1, e);
        } finally {
            if (nnc != null) {
                nnc.close();
            }
        }
    }

    private static void secureLogin(Configuration conf)
            throws IOException {
        UserGroupInformation.setConfiguration(conf);
        String addr = conf.get(DFSConfigKeys.DFS_SPS_ADDRESS_KEY,
                DFSConfigKeys.DFS_SPS_ADDRESS_DEFAULT);
        InetSocketAddress socAddr = NetUtils.createSocketAddr(addr, 0,
                DFSConfigKeys.DFS_SPS_ADDRESS_KEY);
        SecurityUtil.login(conf, DFSConfigKeys.DFS_SPS_KEYTAB_FILE_KEY,
                DFSConfigKeys.DFS_SPS_KERBEROS_PRINCIPAL_KEY,
                socAddr.getHostName());
    }

    private static NameNodeConnector getNameNodeConnector(Configuration conf)
            throws IOException, InterruptedException {
        final Collection<URI> namenodes = DFSUtil.getInternalNsRpcUris(conf);
        final Path externalSPSPathId = HdfsServerConstants.MOVER_ID_PATH;
        while (true) {
            try {
                final List<NameNodeConnector> nncs = NameNodeConnector
                        .newNameNodeConnectors(namenodes,
                                ExternalStoragePolicySatisfier.class.getSimpleName(),
                                externalSPSPathId, conf,
                                NameNodeConnector.DEFAULT_MAX_IDLE_ITERATIONS);
                return nncs.get(0);
            } catch (IOException e) {
                LOG.warn("Failed to connect with namenode", e);
                Thread.sleep(3000); // retry the connection after few secs
            }
        }
    }
}
