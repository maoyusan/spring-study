package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import pojo.User;

@ComponentScan("pojo")
public class MyConfig {

    @Bean
    public User user() {
        return new User();
    }
}
