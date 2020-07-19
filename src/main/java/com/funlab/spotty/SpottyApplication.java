package com.funlab.spotty;

import com.funlab.spotty.config.AppProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class) // enabling support for @ConfigurationProperties
													// (AppProperties.java)
public class SpottyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpottyApplication.class, args);
	}

}
