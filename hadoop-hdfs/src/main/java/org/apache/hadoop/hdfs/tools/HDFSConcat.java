package org.apache.hadoop.hdfs.tools;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;

import java.io.IOException;
public class HDFSConcat {
    private final static String def_uri = "hdfs://localhost:9000";

    public static void main(String... args) throws IOException {

        if (args.length < 2) {
            System.err.println("Usage HDFSConcat target srcs..");
            System.exit(0);
        }

        Configuration conf = new Configuration();
        String uri = conf.get("fs.default.name", def_uri);
        Path path = new Path(uri);
        DistributedFileSystem dfs =
                (DistributedFileSystem) FileSystem.get(path.toUri(), conf);

        Path[] srcs = new Path[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            srcs[i - 1] = new Path(args[i]);
        }
        dfs.concat(new Path(args[0]), srcs);
    }

}
