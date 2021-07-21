package com.acko.pager.pager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.acko.pager.pager")
public class PagerProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagerProductApplication.class, args);
	}

}
