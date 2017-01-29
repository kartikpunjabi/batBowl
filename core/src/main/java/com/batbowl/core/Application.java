package com.batbowl.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kartikpunjabi on 11/24/16.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"com.batbowl.core"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
