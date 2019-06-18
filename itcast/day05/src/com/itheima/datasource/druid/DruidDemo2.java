package com.itheima.datasource.druid;

import com.itheima.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2 {
    public static void main(String[] args) {
        /*Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into student values(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 12);
            pstmt.setString(2, "赵丽颖");
            pstmt.setString(3, "女");
            pstmt.setInt(4, 30);
            int rows = pstmt.executeUpdate();
            System.out.println(rows);
            if (rows > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("修改失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt, conn);
        }
*/
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
             conn = JDBCUtils.getConnection();
            String sql = "insert into student values (?,?,?,?)";
             pstmt = conn.prepareStatement(sql);
            pstmt.setString(2,"张韶涵");
            pstmt.setString(1,null);
            pstmt.setString(3,"女");
            pstmt.setInt(4,20);
            int rows = pstmt.executeUpdate();
            System.out.println(rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }


    }
}
