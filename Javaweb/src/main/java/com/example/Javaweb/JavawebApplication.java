package com.example.Javaweb;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavawebApplication {
	
	public static final Logger logger  = LoggerFactory.getLogger(JavawebApplication.class);

	public static void main(String[] args) {
		
		logger.info("hello Logger Test");
		SpringApplication.run(JavawebApplication.class, args);
		
		System.out.println("Hii");
	}

}
