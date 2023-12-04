package org.apache.hadoop.hdfs.server.federation.router;

import org.apache.hadoop.fs.BatchedRemoteIterator.BatchedEntries;
import org.apache.hadoop.fs.CacheFlag;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.protocol.CacheDirectiveEntry;
import org.apache.hadoop.hdfs.protocol.CacheDirectiveInfo;
import org.apache.hadoop.hdfs.protocol.CachePoolEntry;
import org.apache.hadoop.hdfs.protocol.CachePoolInfo;
import org.apache.hadoop.hdfs.server.federation.resolver.ActiveNamenodeResolver;
import org.apache.hadoop.hdfs.server.federation.resolver.FederationNamespaceInfo;
import org.apache.hadoop.hdfs.server.federation.resolver.RemoteLocation;
import org.apache.hadoop.hdfs.server.namenode.NameNode;

import java.io.IOException;
import java.util.*;

// 缓存管理相关的向 NameNode RPC调用
public class RouterCacheAdmin {

  private final RouterRpcServer rpcServer;
  private final RouterRpcClient rpcClient;
  private final ActiveNamenodeResolver namenodeResolver;

  public RouterCacheAdmin(RouterRpcServer server) {
    this.rpcServer = server;
    this.rpcClient = this.rpcServer.getRPCClient();
    this.namenodeResolver = this.rpcClient.getNamenodeResolver();
  }

  public long addCacheDirective(CacheDirectiveInfo path,
                                EnumSet<CacheFlag> flags) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE, true);
    final List<RemoteLocation> locations =
        rpcServer.getLocationsForPath(path.getPath().toString(), true, false);
    RemoteMethod method = new RemoteMethod("addCacheDirective",
        new Class<?>[]{CacheDirectiveInfo.class, EnumSet.class},
        new RemoteParam(getRemoteMap(path, locations)), flags);
    Map<RemoteLocation, Long> response =
        rpcClient.invokeConcurrent(locations, method, false, false, long.class);
    return response.values().iterator().next();
  }

  public void modifyCacheDirective(CacheDirectiveInfo directive,
                                   EnumSet<CacheFlag> flags) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE, true);
    Path p = directive.getPath();
    if (p != null) {
      final List<RemoteLocation> locations = rpcServer
          .getLocationsForPath(directive.getPath().toString(), true, false);
      RemoteMethod method = new RemoteMethod("modifyCacheDirective",
          new Class<?>[]{CacheDirectiveInfo.class, EnumSet.class},
          new RemoteParam(getRemoteMap(directive, locations)), flags);
      rpcClient.invokeConcurrent(locations, method);
      return;
    }
    RemoteMethod method = new RemoteMethod("modifyCacheDirective",
        new Class<?>[]{CacheDirectiveInfo.class, EnumSet.class}, directive,
        flags);
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();
    rpcClient.invokeConcurrent(nss, method, false, false);
  }

  public void removeCacheDirective(long id) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE, true);
    RemoteMethod method = new RemoteMethod("removeCacheDirective",
        new Class<?>[]{long.class}, id);
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();
    rpcClient.invokeConcurrent(nss, method, false, false);
  }

  public BatchedEntries<CacheDirectiveEntry> listCacheDirectives(long prevId,
                                                                 CacheDirectiveInfo filter) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.READ, true);
    if (filter.getPath() != null) {
      final List<RemoteLocation> locations = rpcServer
          .getLocationsForPath(filter.getPath().toString(), true, false);
      RemoteMethod method = new RemoteMethod("listCacheDirectives",
          new Class<?>[]{long.class, CacheDirectiveInfo.class}, prevId,
          new RemoteParam(getRemoteMap(filter, locations)));
      Map<RemoteLocation, BatchedEntries> response = rpcClient.invokeConcurrent(
          locations, method, false, false, BatchedEntries.class);
      return response.values().iterator().next();
    }
    RemoteMethod method = new RemoteMethod("listCacheDirectives",
        new Class<?>[]{long.class, CacheDirectiveInfo.class}, prevId,
        filter);
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();
    Map<FederationNamespaceInfo, BatchedEntries> results = rpcClient
        .invokeConcurrent(nss, method, true, false, BatchedEntries.class);
    return results.values().iterator().next();
  }

  public void addCachePool(CachePoolInfo info) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE, true);
    RemoteMethod method = new RemoteMethod("addCachePool",
        new Class<?>[]{CachePoolInfo.class}, info);
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();
    rpcClient.invokeConcurrent(nss, method, true, false);
  }

  public void modifyCachePool(CachePoolInfo info) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE, true);
    RemoteMethod method = new RemoteMethod("modifyCachePool",
        new Class<?>[]{CachePoolInfo.class}, info);
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();
    rpcClient.invokeConcurrent(nss, method, true, false);
  }

  public void removeCachePool(String cachePoolName) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE, true);
    RemoteMethod method = new RemoteMethod("removeCachePool",
        new Class<?>[]{String.class}, cachePoolName);
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();
    rpcClient.invokeConcurrent(nss, method, true, false);
  }

  public BatchedEntries<CachePoolEntry> listCachePools(String prevKey)
      throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.READ, true);
    RemoteMethod method = new RemoteMethod("listCachePools",
        new Class<?>[]{String.class}, prevKey);
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();
    Map<FederationNamespaceInfo, BatchedEntries> results = rpcClient
        .invokeConcurrent(nss, method, true, false, BatchedEntries.class);
    return results.values().iterator().next();
  }

  /**
   * Returns a map with the CacheDirectiveInfo mapped to each location.
   * @param path CacheDirectiveInfo to be mapped to the locations.
   * @param locations the locations to map.
   * @return map with CacheDirectiveInfo mapped to the locations.
   */
  private Map<RemoteLocation, CacheDirectiveInfo> getRemoteMap(
      CacheDirectiveInfo path, final List<RemoteLocation> locations) {
    final Map<RemoteLocation, CacheDirectiveInfo> dstMap = new HashMap<>();
    for (RemoteLocation location : locations) {
      dstMap.put(location, path);
    }
    return dstMap;
  }
}