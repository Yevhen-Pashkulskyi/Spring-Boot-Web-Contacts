package com.example.app.SpringBootWebContacts;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootWebContactsApplication {
    private static final Logger LOGGER = Logger.getLogger(SpringBootWebContactsApplication.class.getName());

    public static void main(String[] args) {
        (new SpringApplicationBuilder(SpringBootWebContactsApplication.class))
                .bannerMode(Banner.Mode.OFF).run(args);
        LOGGER.info("Application started");
    }

}
