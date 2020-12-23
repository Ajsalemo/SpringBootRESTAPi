package com.springbootrestapi.application.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://${SPRING_DATASOURCE_HOST}.postgres.database.azure.com:${SPRING_DATASOURCE_PORT}/${SPRING_DATASOURCE_DB}?user=${SPRING_DATASOURCE_USERNAME}@${SPRING_DATASOURCE_HOST}&password=${SPRING_DATASOURCE_PASSWORD}&sslmode=require");
        System.out.println("Custom datasource bean has been initialized and set.");
        return builder.build();
    }
}
