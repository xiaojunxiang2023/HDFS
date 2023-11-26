package utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {

    public static Connection getConn() {

        try {
            // 读取配置文件
            InputStream is = new FileInputStream(new File("/tmp/jdbc.properties"));
            Properties pros = new Properties();
            pros.load(is);
            String user = pros.getProperty("jdbc.user");
            String password = pros.getProperty("jdbc.password");
            String url = pros.getProperty("jdbc.url");
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (IOException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String select(Connection conn, String sql) {
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            // 获取结果集的元数据 :ResultSetMetaData, 元数据是修饰数据的数据,
            // 比如查询的内容是数据,查询的数据总行数就是元数据
            ResultSetMetaData rsmd = rs.getMetaData();
            return rsmd.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "None";
    }

    public static int update(Connection conn, String sql) {
        try {
            Statement statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }

}
