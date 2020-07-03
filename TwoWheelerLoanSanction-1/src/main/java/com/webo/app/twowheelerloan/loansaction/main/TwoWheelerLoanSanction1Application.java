package com.webo.app.twowheelerloan.loansaction.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@EnableEurekaClient
@SpringBootApplication
public class TwoWheelerLoanSanction1Application {

	public static void main(String[] args) {
		SpringApplication.run(TwoWheelerLoanSanction1Application.class, args);
	}

}
