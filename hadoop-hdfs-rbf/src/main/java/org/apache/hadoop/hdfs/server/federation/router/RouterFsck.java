package org.apache.hadoop.hdfs.server.federation.router;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.server.federation.resolver.FederationNamenodeServiceState;
import org.apache.hadoop.hdfs.server.federation.store.MembershipStore;
import org.apache.hadoop.hdfs.server.federation.store.StateStoreService;
import org.apache.hadoop.hdfs.server.federation.store.protocol.GetNamenodeRegistrationsRequest;
import org.apache.hadoop.hdfs.server.federation.store.protocol.GetNamenodeRegistrationsResponse;
import org.apache.hadoop.hdfs.server.federation.store.records.MembershipState;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.util.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@InterfaceAudience.Private
@InterfaceStability.Unstable
public class RouterFsck {

  public static final Logger LOG = LoggerFactory.getLogger(RouterFsck.class.getName());

  private final Router router;
  private final InetAddress remoteAddress;
  private final PrintWriter out;
  private final Map<String, String[]> pmap;

  public RouterFsck(Router router, Map<String, String[]> pmap,
                    PrintWriter out, InetAddress remoteAddress) {
    this.router = router;
    this.remoteAddress = remoteAddress;
    this.out = out;
    this.pmap = pmap;
  }

  public void fsck() {
    final long startTime = Time.monotonicNow();
    try {
      String warnMsg = "Now FSCK to DFSRouter is unstable feature. There may be incompatible changes between releases.";
      LOG.warn(warnMsg);
      out.println(warnMsg);
      String msg = "Federated FSCK started by " + UserGroupInformation.getCurrentUser() + " from " + remoteAddress + " at " + new Date();
      LOG.info(msg);
      out.println(msg);

      // Check each Namenode in the federation
      StateStoreService stateStore = router.getStateStore();
      MembershipStore membership = stateStore.getRegisteredRecordStore(MembershipStore.class);
      GetNamenodeRegistrationsRequest request = GetNamenodeRegistrationsRequest.newInstance();
      GetNamenodeRegistrationsResponse response = membership.getNamenodeRegistrations(request);
      List<MembershipState> memberships = response.getNamenodeMemberships();
      Collections.sort(memberships);
      for (MembershipState nn : memberships) {
        if (nn.getState() == FederationNamenodeServiceState.ACTIVE) {
          try {
            String webAddress = nn.getWebAddress();
            out.write("Checking " + nn + " at " + webAddress + "\n");
            remoteFsck(nn);
          } catch (IOException ioe) {
            out.println("Cannot query " + nn + ": " + ioe.getMessage() + "\n");
          }
        }
      }
      out.println("Federated FSCK ended at " + new Date() + " in " + (Time.monotonicNow() - startTime + " milliseconds"));
    } catch (Exception e) {
      String errMsg = "Fsck " + e.getMessage();
      LOG.warn(errMsg, e);
      out.println("Federated FSCK ended at " + new Date() + " in "
          + (Time.monotonicNow() - startTime + " milliseconds"));
      out.println(e.getMessage());
      out.print("\n\n" + errMsg);
    } finally {
      out.close();
    }
  }

  // 转发给 NameNode做 fsck
  private void remoteFsck(MembershipState nn) throws IOException {
    final String scheme = nn.getWebScheme();
    final String webAddress = nn.getWebAddress();
    final String args = getURLArguments(pmap);
    final URL url = new URL(scheme + "://" + webAddress + "/fsck?" + args);

    // Connect to the Namenode and output
    final URLConnection conn = url.openConnection();
    try (InputStream is = conn.getInputStream();
         InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
         BufferedReader br = new BufferedReader(isr)) {
      String line;
      while ((line = br.readLine()) != null) {
        out.write(line + "\n");
      }
    }
  }

  private static String getURLArguments(Map<String, String[]> map) {
    StringBuilder sb = new StringBuilder();
    for (Entry<String, String[]> entry : map.entrySet()) {
      String key = entry.getKey();
      String[] value = entry.getValue();
      if (sb.length() > 0) {
        sb.append("&");
      }
      sb.append(key);
      sb.append("=");
      sb.append(value[0]);
    }
    return sb.toString();
  }
}
