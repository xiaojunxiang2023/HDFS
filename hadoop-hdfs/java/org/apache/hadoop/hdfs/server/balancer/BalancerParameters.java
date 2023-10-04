package org.apache.hadoop.hdfs.server.balancer;

import org.apache.hadoop.classification.InterfaceAudience;

import java.util.Collections;
import java.util.Set;

@InterfaceAudience.Private
final class BalancerParameters {
    static final BalancerParameters DEFAULT = new BalancerParameters();
    private final BalancingPolicy policy;
    private final double threshold;
    private final int maxIdleIteration;
    /** Exclude the nodes in this set. */
    private final Set<String> excludedNodes;
    /** If empty, include any node; otherwise, include only these nodes. */
    private final Set<String> includedNodes;
    /**
     * If empty, any node can be a source; otherwise, use only these nodes as
     * source nodes.
     */
    private final Set<String> sourceNodes;
    /**
     * A set of block pools to run the balancer on.
     */
    private final Set<String> blockpools;
    /**
     * Whether to run the balancer during upgrade.
     */
    private final boolean runDuringUpgrade;
    private final boolean runAsService;

    private BalancerParameters() {
        this(new Builder());
    }

    private BalancerParameters(Builder builder) {
        this.policy = builder.policy;
        this.threshold = builder.threshold;
        this.maxIdleIteration = builder.maxIdleIteration;
        this.excludedNodes = builder.excludedNodes;
        this.includedNodes = builder.includedNodes;
        this.sourceNodes = builder.sourceNodes;
        this.blockpools = builder.blockpools;
        this.runDuringUpgrade = builder.runDuringUpgrade;
        this.runAsService = builder.runAsService;
    }

    BalancingPolicy getBalancingPolicy() {
        return this.policy;
    }

    double getThreshold() {
        return this.threshold;
    }

    int getMaxIdleIteration() {
        return this.maxIdleIteration;
    }

    Set<String> getExcludedNodes() {
        return this.excludedNodes;
    }

    Set<String> getIncludedNodes() {
        return this.includedNodes;
    }

    Set<String> getSourceNodes() {
        return this.sourceNodes;
    }

    Set<String> getBlockPools() {
        return this.blockpools;
    }

    boolean getRunDuringUpgrade() {
        return this.runDuringUpgrade;
    }

    boolean getRunAsService() {
        return this.runAsService;
    }

    @Override
    public String toString() {
        return String.format("%s.%s [%s," + " threshold = %s,"
                        + " max idle iteration = %s," + " #excluded nodes = %s,"
                        + " #included nodes = %s," + " #source nodes = %s,"
                        + " #blockpools = %s," + " run during upgrade = %s]",
                Balancer.class.getSimpleName(), getClass().getSimpleName(), policy,
                threshold, maxIdleIteration, excludedNodes.size(),
                includedNodes.size(), sourceNodes.size(), blockpools.size(),
                runDuringUpgrade);
    }

    static class Builder {
        // Defaults
        private BalancingPolicy policy = BalancingPolicy.Node.INSTANCE;
        private double threshold = 10.0;
        private int maxIdleIteration =
                NameNodeConnector.DEFAULT_MAX_IDLE_ITERATIONS;
        private Set<String> excludedNodes = Collections.<String>emptySet();
        private Set<String> includedNodes = Collections.<String>emptySet();
        private Set<String> sourceNodes = Collections.<String>emptySet();
        private Set<String> blockpools = Collections.<String>emptySet();
        private boolean runDuringUpgrade = false;
        private boolean runAsService = false;

        Builder() {
        }

        Builder setBalancingPolicy(BalancingPolicy p) {
            this.policy = p;
            return this;
        }

        Builder setThreshold(double t) {
            this.threshold = t;
            return this;
        }

        Builder setMaxIdleIteration(int m) {
            this.maxIdleIteration = m;
            return this;
        }

        Builder setExcludedNodes(Set<String> nodes) {
            this.excludedNodes = nodes;
            return this;
        }

        Builder setIncludedNodes(Set<String> nodes) {
            this.includedNodes = nodes;
            return this;
        }

        Builder setSourceNodes(Set<String> nodes) {
            this.sourceNodes = nodes;
            return this;
        }

        Builder setBlockpools(Set<String> pools) {
            this.blockpools = pools;
            return this;
        }

        Builder setRunDuringUpgrade(boolean run) {
            this.runDuringUpgrade = run;
            return this;
        }

        Builder setRunAsService(boolean asService) {
            this.runAsService = asService;
            return this;
        }

        BalancerParameters build() {
            return new BalancerParameters(this);
        }
    }
}