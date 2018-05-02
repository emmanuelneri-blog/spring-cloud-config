package br.com.emmanuelneri.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

}
