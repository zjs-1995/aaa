package com.itheima.JdbcTemplate;

import com.itheima.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSourse());
        String sql = "insert into student values (?,?,?,?)";
        int count = template.update(sql, null, "杨幂", "女", 40);
        System.out.println(count);
    }
}
