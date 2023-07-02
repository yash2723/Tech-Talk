package com.techtalk;

import com.techtalk.config.OpenAPIConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(OpenAPIConfiguration.class)
public class TechTalkApplication {
    public static void main(String[] args) {
        SpringApplication.run(TechTalkApplication.class, args);
    }

}
