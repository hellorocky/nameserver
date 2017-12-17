package com.rockywu.nameserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.rockywu.nameserver"})
@SpringBootApplication
public class NameserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameserverApplication.class, args);
	}
}
