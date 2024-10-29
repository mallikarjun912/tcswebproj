package com.tcs.credit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.credit.entity.CreditScore;
import com.tcs.credit.repo.CreditScoreRepo;

@Service
public class CreditScoreServiceImpl implements CreditScoreService{
	@Autowired
	CreditScoreRepo repo;
	
	@Override
	public List<CreditScore> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<CreditScore> findById(String pancard) {
		return repo.findById(pancard);
	}

	@Override
	public void save(CreditScore score) {
		repo.save(score);		
	}
}
