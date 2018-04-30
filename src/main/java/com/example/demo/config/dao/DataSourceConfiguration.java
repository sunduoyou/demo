package com.example.demo.config.dao;

import com.example.demo.config.bean.DBProperties;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
@MapperScan("com.example.demo.dao")
public class DataSourceConfiguration {
    /*@Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;*/

    @Autowired
    private DBProperties db;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        /*dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);*/
        dataSource.setDriverClass(db.getDriver());
        dataSource.setJdbcUrl(db.getUrl());
        dataSource.setUser(db.getUsername());
        dataSource.setPassword(db.getPassword());
        //关闭连接后不自动提交
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
