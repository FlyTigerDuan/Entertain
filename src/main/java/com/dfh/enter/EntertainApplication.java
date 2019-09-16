package com.dfh.enter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.dfh.enter.mappers"})
@SpringBootApplication
public class EntertainApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntertainApplication.class, args);
	}

}
