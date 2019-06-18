package com.itheima.test.demo02;

import java.sql.*;

//.查询男性,成绩80以上的学生数量
public class Demo04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb", "root", "root");
            stmt = conn.createStatement();
            String sql = "SELECT count(sid) FROM student WHERE sex = '男'";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int count = rs.getInt("count(sid)");
                System.out.println(count);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
