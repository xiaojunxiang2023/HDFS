<configuration>

    <property>
        <name>ha.zookeeper.quorum</name>
        <value>node1:2181</value>
    </property>

    <!--配置Hadoop NameNode 的HA -->
    <property>
        <name>dfs.nameservices</name>
        <value>win</value>
    </property>

    <property>
        <name>dfs.ha.namenodes.win</name>
        <value>nn1,nn2</value>
    </property>

    <property>
        <name>dfs.namenode.rpc-address.win.nn1</name>
        <value>localhost:8020</value>
    </property>

    <property>
        <name>dfs.namenode.rpc-address.win.nn2</name>
        <value>node1:8021</value>
    </property>

    <!-- 配置 WEB  界面的 访问地址和端口  -->
    <property>
        <name>dfs.namenode.http-address.win.nn1</name>
        <value>localhost:50070</value>
    </property>
    <property>
        <name>dfs.namenode.http-address.win.nn2</name>
        <value>node1:50079</value>
    </property>

    <!--配置 NameNode Shared  EDITS  Address  和NameNode 日志文件存放的位置   -->
    <property>
        <name>dfs.namenode.shared.edits.dir</name>
        <value>qjournal://localhost:8485/win</value>
    </property>

    <property>
        <name>dfs.ha.automatic-failover.enabled</name>
        <value>true</value>
    </property>

    <property>
        <name>dfs.journalnode.edits.dir</name>
        <value>/opt/module/hadoop/data/dfs/jn</value>
    </property>

    <!-- 配置 HDFS  PROXY  Client -->
    <property>
        <name>dfs.client.failover.proxy.provider.win</name>
        <value>org.apache.hadoop.hdfs.server.namenode.ha.ConfiguredFailoverProxyProvider</value>
    </property>

    <!--存储目录-->
    <property>
        <name>dfs.namenode.name.dir</name>
        <value>/docker/dfs/namenode</value>
    </property>

    <property>
        <name>dfs.datanode.data.dir</name>
        <value>/docker/dfs/datanode</value>
    </property>

    <property>
        <name>dfs.journalnode.edits.dir</name>
        <value>/docker/dfs/journalnode</value>
    </property>

    <!--负数,0代表不开启安全模式,大于等于1代表开启安全模式 -->
    <property>
        <name>dfs.safemode.threshold.pct</name>
        <value>0.1</value>
    </property>

</configuration>
