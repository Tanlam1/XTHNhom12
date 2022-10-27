package com.nhom12shop.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class NHOM12ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(NHOM12ShopApplication.class, args);
	}

}
