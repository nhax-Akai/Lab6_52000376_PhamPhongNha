package edu.tdtu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;



@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfiguretion {

    @Value("${id}")
    private String id;

    @Value("${name}")
    private String name;

    // price
    @Value("${price}")
    private double price;

    // description
    @Value("${description}")
    private String description;

    @Bean
    @Scope("prototype")
    public Product product() {
        Product product = new Product(Long.valueOf(this.id), String.valueOf(this.name), Double.valueOf(this.price),
                String.valueOf(this.description));
        return product;
    }

    @Bean
    @Scope("prototype")
    public Product product1() {
        return new Product();
    }



}
