package com.tcs.credit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.credit.entity.CreditScore;

@Repository
public interface CreditScoreRepo extends JpaRepository<CreditScore,String>{

}
