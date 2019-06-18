package com.itheima.jdbc;

import java.sql.*;

public class JdbcDemo4 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb1", "root", "root");
            String sql = "select * from student";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){

                int i = rs.getInt("sid");
                String s = rs.getString(2);
                String s1 = rs.getString("sex");
                int score = rs.getInt("score");

            System.out.println(i+"----"+s+"-----"+s1+"----"+score);
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
