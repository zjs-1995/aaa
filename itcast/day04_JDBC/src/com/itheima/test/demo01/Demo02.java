package com.itheima.test.demo01;

import java.sql.*;

//*5.我想知道森海塞尔品牌耳机的记录一共录入了多少条数据.并且知道耳机最贵的多少钱
public class Demo02 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4headset", "root", "root");
            String sql = "select max(price),count(id) from headset WHERE brand = '森海塞尔'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int count = rs.getInt("count(id)");
                double max = rs.getDouble("max(price)");
                System.out.println(count+"   "+max);
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
