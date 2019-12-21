package com.learn_1.learn_1.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

  @Bean
  public DataSource dataSource(){
    DataSourceBuilder builder = DataSourceBuilder.create();
    builder.url("jdbc:postgresql://localhost:5432/spring_course_1");
    builder.username("postgres");
    builder.password("postgres");
    System.out.println("datasource bean initialized and set");
    return builder.build();
  }

}
