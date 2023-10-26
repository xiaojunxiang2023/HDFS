package org.apache.hadoop.hdfs.server.datanode.metrics;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.metrics2.MetricsJsonBuilder;
import org.apache.hadoop.metrics2.lib.MutableRollingAverages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static org.apache.hadoop.hdfs.DFSConfigKeys.DFS_DATANODE_PEER_METRICS_MIN_OUTLIER_DETECTION_SAMPLES_DEFAULT;
import static org.apache.hadoop.hdfs.DFSConfigKeys.DFS_DATANODE_PEER_METRICS_MIN_OUTLIER_DETECTION_SAMPLES_KEY;

/**
 * This class maintains DataNode peer metrics (e.g. numOps, AvgTime, etc.) for
 * various peer operations.
 */
public class DataNodePeerMetrics {

    public static final Logger LOG = LoggerFactory.getLogger(
            DataNodePeerMetrics.class);
    /**
     * Threshold in milliseconds below which a DataNode is definitely not slow.
     */
    private static final long LOW_THRESHOLD_MS = 5;
    private static final long MIN_OUTLIER_DETECTION_NODES = 10;
    private final MutableRollingAverages sendPacketDownstreamRollingAverages;
    private final String name;
    private final OutlierDetector slowNodeDetector;

    /**
     * Minimum number of packet send samples which are required to qualify
     * for outlier detection. If the number of samples is below this then
     * outlier detection is skipped.
     */
    private final long minOutlierDetectionSamples;

    public DataNodePeerMetrics(final String name, Configuration conf) {
        this.name = name;
        minOutlierDetectionSamples = conf.getLong(
                DFS_DATANODE_PEER_METRICS_MIN_OUTLIER_DETECTION_SAMPLES_KEY,
                DFS_DATANODE_PEER_METRICS_MIN_OUTLIER_DETECTION_SAMPLES_DEFAULT);
        this.slowNodeDetector = new OutlierDetector(MIN_OUTLIER_DETECTION_NODES,
                LOW_THRESHOLD_MS);
        sendPacketDownstreamRollingAverages = new MutableRollingAverages("Time");
    }

    /**
     * Creates an instance of DataNodePeerMetrics, used for registration.
     */
    public static DataNodePeerMetrics create(String dnName, Configuration conf) {
        final String name = "DataNodePeerActivity-" + (dnName.isEmpty()
                ? "UndefinedDataNodeName" + ThreadLocalRandom.current().nextInt()
                : dnName.replace(':', '-'));

        return new DataNodePeerMetrics(name, conf);
    }

    public String name() {
        return name;
    }

    long getMinOutlierDetectionSamples() {
        return minOutlierDetectionSamples;
    }

    /**
     * Adds invocation and elapsed time of SendPacketDownstream for peer.
     * <p>
     * The caller should pass in a well-formatted peerAddr. e.g.
     * "[192.168.1.110:1010]" is good. This will be translated into a full
     * qualified metric name, e.g. "[192.168.1.110:1010]AvgTime".
     * </p>
     */
    public void addSendPacketDownstream(
            final String peerAddr,
            final long elapsedMs) {
        sendPacketDownstreamRollingAverages.add(peerAddr, elapsedMs);
    }

    /**
     * Dump SendPacketDownstreamRollingAvgTime metrics as JSON.
     */
    public String dumpSendPacketDownstreamAvgInfoAsJson() {
        final MetricsJsonBuilder builder = new MetricsJsonBuilder(null);
        sendPacketDownstreamRollingAverages.snapshot(builder, true);
        return builder.toString();
    }

    /**
     * Collects states maintained in {@link ThreadLocal}, if any.
     */
    public void collectThreadLocalStates() {
        sendPacketDownstreamRollingAverages.collectThreadLocalStates();
    }

    /**
     * Retrieve the set of dataNodes that look significantly slower
     * than their peers.
     */
    public Map<String, Double> getOutliers() {
        // This maps the metric name to the aggregate latency.
        // The metric name is the datanode ID.
        final Map<String, Double> stats =
                sendPacketDownstreamRollingAverages.getStats(
                        minOutlierDetectionSamples);
        LOG.trace("DataNodePeerMetrics: Got stats: {}", stats);

        return slowNodeDetector.getOutliers(stats);
    }

    public MutableRollingAverages getSendPacketDownstreamRollingAverages() {
        return sendPacketDownstreamRollingAverages;
    }
}
