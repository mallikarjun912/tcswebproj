package com.tcs.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.tcs.loan.repo.CreditScoreProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(clients = CreditScoreProxy.class)
public class LoanServiceAppl {

	public static void main(String[] args) {
		SpringApplication.run(LoanServiceAppl.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
