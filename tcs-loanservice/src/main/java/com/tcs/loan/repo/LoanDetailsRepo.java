package com.tcs.loan.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tcs.loan.entity.LoanDetails;

@Repository
public interface LoanDetailsRepo extends JpaRepository<LoanDetails, Integer>{
	
	@Query(value = "select max(loan.loanId) from LoanDetails loan")
	Optional<Integer> getMaxId();
}
