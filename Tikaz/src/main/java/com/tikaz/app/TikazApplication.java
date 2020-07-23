package com.tikaz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.tikaz.repository")
@EntityScan("com.tikaz.entity")
@ComponentScan(basePackages = {"com.tikaz.controller"})
public class TikazApplication {

	public static void main(String[] args) {
		SpringApplication.run(TikazApplication.class, args);
	}

}
