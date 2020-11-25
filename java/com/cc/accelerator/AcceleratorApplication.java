package com.cc.accelerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cc.accelerator.repository.BaseRepositoryImpl;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableJpaRepositories(basePackages = "com.cc.accelerator.repository",repositoryBaseClass = BaseRepositoryImpl.class )
//@EnableMongoRepositories
@EnableSwagger2
@SpringBootApplication
@EnableAutoConfiguration
public class AcceleratorApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AcceleratorApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AcceleratorApplication.class);
	}
}
