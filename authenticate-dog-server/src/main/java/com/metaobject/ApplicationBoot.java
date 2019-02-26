package com.metaobject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jeffy
 * @date 2019-02-26
 **/
@SpringBootApplication
public class ApplicationBoot implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
