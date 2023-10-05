package org.apache.hadoop.hdfs.server.federation.resolver;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Compares NNs in the same namespace and prioritizes by their status. The
 * priorities are:
 * <ul>
 * <li>ACTIVE
 * <li>STANDBY
 * <li>UNAVAILABLE
 * </ul>
 * When two NNs have the same state, the last modification date is the tie
 * breaker, newest has priority. Expired NNs are excluded.
 */
public class NamenodePriorityComparator
        implements Comparator<FederationNamenodeContext>, Serializable {

    private static final long serialVersionUID = 2304924292036293331L;

    @Override
    public int compare(FederationNamenodeContext o1,
                       FederationNamenodeContext o2) {
        FederationNamenodeServiceState state1 = o1.getState();
        FederationNamenodeServiceState state2 = o2.getState();

        if (state1 == state2) {
            // Both have the same state, use mode dates
            return compareModDates(o1, o2);
        } else {
            // Enum is ordered by priority
            return state1.compareTo(state2);
        }
    }

    /**
     * Compare the modification dates.
     *
     * @param o1 Context 1.
     * @param o2 Context 2.
     * @return Comparison between dates.
     */
    private int compareModDates(FederationNamenodeContext o1,
                                FederationNamenodeContext o2) {
        // Reverse sort, lowest position is highest priority.
        return (int) (o2.getDateModified() - o1.getDateModified());
    }
}
