package tn.devcartha.ecommerci.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan(basePackages = "tn.devcartha.ecommerci")
@EnableJpaRepositories(basePackages = "tn.devcartha.ecommerci.data.repository")
@EntityScan(basePackages = "tn.devcartha.ecommerci.data.entity")
public class ECommerciApplication {

    @Bean
    @ConfigurationProperties(prefix="datasource.hikari")
    public HikariDataSource dataSource() {
        return new HikariDataSource();
    }

    public static void main(String[] args) {
        SpringApplication.run(ECommerciApplication.class, args);
    }
}
