package com.tcs.loan.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.loan.dto.CreditScore;
import com.tcs.loan.entity.LoanDetails;
import com.tcs.loan.repo.LoanDetailsRepo;

@Service
public class LoanDetailServiceImpl implements LoanDetailService{
	@Autowired
	LoanDetailsRepo repo;
	
	@Autowired
	RestTemplate template;
	
	@Override
	public int applyLoan(LoanDetails loanDetails) {
		int loanId=1000;
		Optional<Integer> id =  repo.getMaxId();
		if(id.isEmpty())
			loanId = 1001;
		else {
			loanId = id.get();
			loanId++;
		}
		loanDetails.setLoanId(loanId); 
		LocalDate appliedDate = LocalDate.now();
		loanDetails.setDateApplied(appliedDate.toString()); 
		loanDetails.setLoanStatus("APPLIED"); 
		repo.save(loanDetails);
		return loanDetails.getLoanId();
	}

	@Override
	public String verifyLoan(int loanId) {
		Optional<LoanDetails> optionalDetails = repo.findById(loanId);
		LoanDetails loandetails = optionalDetails.get();
		String url = "http://hp:8182/creditscoreapp/creditscore/"+loandetails.getPancard();
		CreditScore creditscore = template.getForObject(url, CreditScore.class);
		loandetails.setCreditscore(creditscore.getCreditscore()); 
		if(loandetails.getCreditscore()>=600) {
			loandetails.setLoanStatus("APPROVED"); 
			LocalDate sanctionedDate = LocalDate.now();
			loandetails.setDateSanctioned(sanctionedDate.toString()); 
		}
		else {
			loandetails.setLoanStatus("REJECTED");
			loandetails.setRemarks("Less credit score ");  
		}  
		repo.save(loandetails);
		return "Verification done";
	}

	@Override
	public String checkStatus(int loanId) {
		Optional<LoanDetails> details = repo.findById(loanId);
		LoanDetails loan = details.get();
		String  status = loan.getLoanStatus()+loan.getRemarks();
		return status;
	}

}
