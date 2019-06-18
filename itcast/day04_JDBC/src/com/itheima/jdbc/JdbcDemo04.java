package com.itheima.jdbc;

import java.sql.*;

public class JdbcDemo04 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb1", "root", "root");
            String sql = "SELECT * FROM student where sid = ?";
             pstmt = conn.prepareStatement(sql);
             pstmt.setInt(1,3);
             rs = pstmt.executeQuery();
            while (rs.next()){
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                System.out.println(sid+"-----"+sname);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
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
