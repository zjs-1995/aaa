package com.itheima.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static {

        try {
            //创建properti集合类
            Properties pro = new Properties();
            //获取配置文件路径
            URL res = JDBCUtils.class.getClassLoader().getResource("jdbc.properties");
            String path = res.getPath();
            //读取路径
            pro.load(new FileReader(path));
            //读取数据
             url = pro.getProperty("url");
             user = pro.getProperty("user");
             password = pro.getProperty("password");
             driver = pro.getProperty("driver");
            //注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取链接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    //释放资源
    public static void close(Statement stmt,Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //释放资源
    public static void close(ResultSet rs,Statement stmt,Connection coon){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (coon != null){
            try {
                coon.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
