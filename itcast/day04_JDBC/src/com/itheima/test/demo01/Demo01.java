package com.itheima.test.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//4.森海塞尔得ie80降价了,现在只卖1399
public class Demo01 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4headset", "root", "root");
            String sql = "Update headset set price = 1399 where model = 'ie80'";
            stmt = conn.createStatement();
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows);
            if (rows > 0){
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
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
        }
    }
}
