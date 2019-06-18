package com.itheima.test.demo02;

import java.sql.*;

public class Demo07 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb", "root", "root");
            stmt = conn.createStatement();
            String sql = "SELECT avg(score) FROM student WHERE sex = '男'";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int avg = rs.getInt("avg(score)");
                System.out.println(avg);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
