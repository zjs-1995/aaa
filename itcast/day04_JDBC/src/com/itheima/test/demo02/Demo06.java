package com.itheima.test.demo02;

import java.sql.*;

//查询成绩大于60的女性,显示姓名,性别,成绩
public class Demo06 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb", "root", "root");
             stmt = conn.createStatement();
            String sql = "SELECT sname,sex,score FROM student WHERE score>60";
             rs = stmt.executeQuery(sql);
            while(rs.next()){
                String sname = rs.getString("sname");
                String sex = rs.getString("sex");
                int score = rs.getInt("score");
                System.out.println(sname+"  "+sex+"  "+score);
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
