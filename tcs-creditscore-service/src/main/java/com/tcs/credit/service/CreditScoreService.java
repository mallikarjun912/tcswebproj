package com.tcs.credit.service;

import java.util.List;
import java.util.Optional;

import com.tcs.credit.entity.CreditScore;

public interface CreditScoreService {
	List<CreditScore> findAll();
	Optional<CreditScore> findById(String pancard);
	void save(CreditScore score);
}
