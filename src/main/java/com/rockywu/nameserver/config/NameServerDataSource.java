package com.rockywu.nameserver.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class NameServerDataSource {

    @Bean
    public JdbcTemplate getTemplate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://victor.rockywu.me:3306/mytest?useUnicode=true&characterEncoding=utf-8");
        dataSource.setUsername("victor");
        dataSource.setPassword("12345678");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}

//@ConfigurationProperties(prefix = "spring.datasource")
//class MysqlConfig {
//    private String url;
//    private String username;
//    private String password;
//    private String driver_class_name;
//}
