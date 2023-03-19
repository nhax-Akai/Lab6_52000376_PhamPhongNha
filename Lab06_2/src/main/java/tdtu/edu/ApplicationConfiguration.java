package tdtu.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Product product() {
        return new Product(1, "T-shirt", 10.0, "Safe off 50%");
    }

    @Bean
    @Scope("prototype")
    public Product product1(){
        return new Product(product());
    }
    @Bean
    @Scope("singleton")
    public Product product2(){
        return new Product(4, "Shoes", 15.0, "Safe off 5%");
    }



}

