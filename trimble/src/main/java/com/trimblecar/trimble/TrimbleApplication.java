package com.trimblecar.trimble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.trimblecar.trimble.model")
//@EntityScan("com.trimblecar.trimble.model")
public class TrimbleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrimbleApplication.class, args);
	}

}
