package com.tcs.loan.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.loan.dto.CreditScore;
import com.tcs.loan.repo.CreditScoreProxy;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Component
public class CircuitBreakingR4J {
	@Autowired
	CreditScoreProxy proxy;
	
	@CircuitBreaker(name = "creditscore-service", fallbackMethod = "getCreditScoreFallback")
	public Optional<CreditScore> getCreditScore(String pancard){
		System.out.println("Inside Delegate class FromProxy()");
		Optional<CreditScore> optionalScore = proxy.getCreditScore(pancard);
		return optionalScore;
	}
	
	public Optional<CreditScore> getCreditScoreFallback(String pancard, Exception ex){
		System.out.println("credit score service is down!!!... fallback route enable...  "
				+ex.getMessage());
	System.out.println("CIRCUIT BREAKER ENABLED!!! No response from CreditScore "
			+ "service at this moment.  Service will back shortly... " + new Date());
		return Optional.of(new CreditScore());
	}
}
