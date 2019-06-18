package com.itheima.jdbc;

import com.itheima.domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo8 {
    public static void main(String[] args) {
        List<Student> list = new JdbcDemo8().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }



    public List<Student> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Student> list= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/stdb1", "root", "root");
            String sql = "select * from student";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            Student stu = null;
            list = new ArrayList<>();
            while (rs.next()) {
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                String sex = rs.getString("sex");
                int score = rs.getInt("score");
                stu = new Student();
                stu.setSid(sid);
                stu.setSname(sname);
                stu.setSex(sex);
                stu.setScore(score);
                list.add(stu);
                //  System.out.println(sid+"  "+sname+"  "+sex+"  "+score);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
