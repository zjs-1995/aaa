package com.itheima.JdbcTemplate;

import com.itheima.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo2 {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());

    @Test
    public void test1() {
        String sql = "update student set sex = '男' where sid = ?";
        int count = template.update(sql, 12);
        System.out.println(count);
    }

    @Test
    public void test2() {
       String sql = "insert into student values(?,?,?,?)";
        int count = template.update(sql, null, "迪丽热巴", "女", 40);
        System.out.println(count);
    }
}
