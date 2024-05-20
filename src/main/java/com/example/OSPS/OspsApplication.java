package com.example.OSPS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Repository")
@ComponentScan({"com.example.OSPS","com.example.Entity","com.example.Controller","com.example.Service","com.example.Repository"})
@EntityScan({"com.example.demo","com.example.model","com.example.controller","com.example.service","com.example.repository"})
public class OspsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OspsApplication.class, args);
	}

}