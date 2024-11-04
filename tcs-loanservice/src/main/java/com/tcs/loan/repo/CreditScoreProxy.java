package com.tcs.loan.repo;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tcs.loan.dto.CreditScore;

@FeignClient(name = "creditscore-service", url = "http://hp:8182/creditscoreapp/creditscore")
public interface CreditScoreProxy {
	@GetMapping(value = "/{pancard}")
	Optional<CreditScore> getCreditScore(@PathVariable String pancard);
}
