package org.apache.hadoop.hdfs.server.sps;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DFSUtilClient;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.BlockStoragePolicy;
import org.apache.hadoop.hdfs.protocol.HdfsConstants.DatanodeReportType;
import org.apache.hadoop.hdfs.protocol.HdfsFileStatus;
import org.apache.hadoop.hdfs.protocol.HdfsLocatedFileStatus;
import org.apache.hadoop.hdfs.server.balancer.NameNodeConnector;
import org.apache.hadoop.hdfs.server.blockmanagement.BlockStoragePolicySuite;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants;
import org.apache.hadoop.hdfs.server.namenode.sps.*;
import org.apache.hadoop.hdfs.server.namenode.sps.StoragePolicySatisfier.DatanodeMap;
import org.apache.hadoop.hdfs.server.namenode.sps.StoragePolicySatisfier.DatanodeWithStorage;
import org.apache.hadoop.hdfs.server.protocol.BlockStorageMovementCommand.BlockMovingInfo;
import org.apache.hadoop.hdfs.server.protocol.DatanodeStorageReport;
import org.apache.hadoop.net.NetworkTopology;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class used to connect to Namenode and gets the required information to
 * SPS from Namenode state.
 */
public class ExternalSPSContext implements Context {
    public static final Logger LOG = LoggerFactory
            .getLogger(ExternalSPSContext.class);
    private final SPSService service;
    private final NameNodeConnector nnc;
    private final BlockStoragePolicySuite createDefaultSuite =
            BlockStoragePolicySuite.createDefaultSuite();
    private final FileCollector fileCollector;
    private final BlockMoveTaskHandler externalHandler;
    private final BlockMovementListener blkMovementListener;

    public ExternalSPSContext(SPSService service, NameNodeConnector nnc) {
        this.service = service;
        this.nnc = nnc;
        this.fileCollector = new ExternalSPSFilePathCollector(service);
        this.externalHandler = new ExternalSPSBlockMoveTaskHandler(
                service.getConf(), nnc, service);
        this.blkMovementListener = new ExternalBlockMovementListener();
    }

    @Override
    public boolean isRunning() {
        return service.isRunning();
    }

    @Override
    public boolean isInSafeMode() {
        try {
            return nnc != null ? nnc.getDistributedFileSystem().isInSafeMode()
                    : false;
        } catch (IOException e) {
            LOG.warn("Exception while creating Namenode Connector..", e);
            return false;
        }
    }

    @Override
    public NetworkTopology getNetworkTopology(DatanodeMap datanodeMap) {
        // create network topology.
        NetworkTopology cluster = NetworkTopology.getInstance(service.getConf());
        List<DatanodeWithStorage> targets = datanodeMap.getTargets();
        for (DatanodeWithStorage node : targets) {
            cluster.add(node.getDatanodeInfo());
        }
        return cluster;
    }

    @Override
    public boolean isFileExist(long path) {
        Path filePath = DFSUtilClient.makePathFromFileId(path);
        try {
            return nnc.getDistributedFileSystem().exists(filePath);
        } catch (IllegalArgumentException | IOException e) {
            LOG.warn("Exception while getting file is for the given path:{}",
                    filePath, e);
        }
        return false;
    }

    @Override
    public BlockStoragePolicy getStoragePolicy(byte policyId) {
        return createDefaultSuite.getPolicy(policyId);
    }

    @Override
    public void removeSPSHint(long inodeId) throws IOException {
        Path filePath = DFSUtilClient.makePathFromFileId(inodeId);
        try {
            nnc.getDistributedFileSystem().removeXAttr(filePath,
                    HdfsServerConstants.XATTR_SATISFY_STORAGE_POLICY);
        } catch (IOException e) {
            List<String> listXAttrs = nnc.getDistributedFileSystem()
                    .listXAttrs(filePath);
            if (!listXAttrs
                    .contains(HdfsServerConstants.XATTR_SATISFY_STORAGE_POLICY)) {
                LOG.info("SPS hint already removed for the inodeId:{}."
                        + " Ignoring exception:{}", inodeId, e.getMessage());
            }
        }
    }

    @Override
    public int getNumLiveDataNodes() {
        try {
            return nnc.getDistributedFileSystem()
                    .getDataNodeStats(DatanodeReportType.LIVE).length;
        } catch (IOException e) {
            LOG.warn("Exception while getting number of live datanodes.", e);
        }
        return 0;
    }

    @Override
    public HdfsFileStatus getFileInfo(long path) throws IOException {
        HdfsLocatedFileStatus fileInfo = null;
        try {
            Path filePath = DFSUtilClient.makePathFromFileId(path);
            fileInfo = nnc.getDistributedFileSystem().getClient()
                    .getLocatedFileInfo(filePath.toString(), false);
        } catch (FileNotFoundException e) {
            LOG.debug("Path:{} doesn't exists!", path, e);
        }
        return fileInfo;
    }

    @Override
    public DatanodeStorageReport[] getLiveDatanodeStorageReport()
            throws IOException {
        return nnc.getLiveDatanodeStorageReport();
    }

    @Override
    public Long getNextSPSPath() {
        try {
            return nnc.getNNProtocolConnection().getNextSPSPath();
        } catch (IOException e) {
            LOG.warn("Exception while getting next sps path id from Namenode.", e);
            return null;
        }
    }

    @Override
    public void scanAndCollectFiles(long path)
            throws IOException, InterruptedException {
        fileCollector.scanAndCollectFiles(path);
    }

    @Override
    public void submitMoveTask(BlockMovingInfo blkMovingInfo) throws IOException {
        externalHandler.submitMoveTask(blkMovingInfo);
    }

    @Override
    public void notifyMovementTriedBlocks(Block[] moveAttemptFinishedBlks) {
        // External listener if it is plugged-in
        if (blkMovementListener != null) {
            blkMovementListener.notifyMovementTriedBlocks(moveAttemptFinishedBlks);
        }
    }

    /**
     * Its an implementation of BlockMovementListener.
     */
    private static class ExternalBlockMovementListener
            implements BlockMovementListener {

        private List<Block> actualBlockMovements = new ArrayList<>();

        @Override
        public void notifyMovementTriedBlocks(Block[] moveAttemptFinishedBlks) {
            for (Block block : moveAttemptFinishedBlks) {
                actualBlockMovements.add(block);
            }
            LOG.info("Movement attempted blocks", actualBlockMovements);
        }
    }
}