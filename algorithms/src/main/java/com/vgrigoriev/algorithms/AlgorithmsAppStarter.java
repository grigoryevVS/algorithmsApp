package com.vgrigoriev.algorithms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Main spring boot class to start app.
 *
 * Created by vgrigore on 30.08.2016.
 */
@SpringBootApplication(scanBasePackages = "com.vgrigoriev.algorithms")
@EnableWebMvc
public class AlgorithmsAppStarter extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AlgorithmsAppStarter.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmsAppStarter.class, args);
    }
}
