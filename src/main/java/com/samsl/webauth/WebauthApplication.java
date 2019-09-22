package com.samsl.webauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.samsl")
public class WebauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebauthApplication.class, args);
	}

}
