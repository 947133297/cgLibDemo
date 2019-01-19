package com.example.demo;

import com.example.demo.enhancer.LoggerProcesser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public LoggerProcesser getLoggerProcesser() {
		return new LoggerProcesser();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

