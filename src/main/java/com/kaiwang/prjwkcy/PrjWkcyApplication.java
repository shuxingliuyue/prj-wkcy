package com.kaiwang.prjwkcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.core.annotation.EruptScan;

@SpringBootApplication
public class PrjWkcyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrjWkcyApplication.class, args);
    }

}
