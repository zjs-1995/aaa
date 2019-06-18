package com.itheima.test.demo01;

import java.sql.*;

//6.我知道所有品牌耳机里面各自的均价是多少并按照价格的高低降序排列
public class Demo03 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4headset", "root", "root");
            stmt = conn.createStatement();
            String sql = "SELECT avg(price) FROM headset group BY brand ORDER BY price DESC";
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                double avg = rs.getDouble("avg(price)");
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
