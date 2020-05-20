package org.hui.springbooth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zenghui
 * @date 2020-5-20
 */
@SpringBootApplication
public class H2Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }

    private final JdbcTemplate template;

    public H2Application(JdbcTemplate template) {
        this.template = template;
    }
    @Override
    public void run(String... args)  {
        String sql="SELECT count(*)  FROM USER_INFO";
        int count = template.queryForObject(sql, Integer.class);
        System.out.println("user count is " + count);
    }
}
