package com.tcs.loan.service;

import com.tcs.loan.entity.LoanDetails;

public interface LoanDetailService {
	int applyLoan(LoanDetails loanDetails);
	String verifyLoan(int loanId);
	String checkStatus(int loanId);
}
