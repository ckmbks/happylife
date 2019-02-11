package ckmbks.happylife.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
}, scanBasePackages = "ckmbks.happylife")
@ComponentScan(basePackages="ckmbks.happylife")
@EntityScan(basePackages={"ckmbks.happylife"})
@EnableJpaRepositories(basePackages={"ckmbks.happylife"})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}

