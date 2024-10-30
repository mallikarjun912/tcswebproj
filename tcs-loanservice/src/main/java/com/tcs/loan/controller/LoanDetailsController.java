package com.tcs.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.loan.entity.LoanDetails;
import com.tcs.loan.service.LoanDetailService;

@RestController
@RequestMapping("/loandetails")
public class LoanDetailsController {
	@Autowired
	LoanDetailService service;
	
	@PostMapping
	public ResponseEntity<String> applyForLoan(@RequestBody LoanDetails details){
		int loanId = service.applyLoan(details);
		return new ResponseEntity<String>("loan ref ID = "+loanId,HttpStatus.OK);
	}
	
	@GetMapping("/verify/{loanId}")
	public ResponseEntity<String> verifyLoan(@PathVariable int loanId){
		String str = service.verifyLoan(loanId);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@GetMapping("/checkstatus/{loanId}")
	public ResponseEntity<String> checkStatus(@PathVariable int loanId){
		String str = service.checkStatus(loanId);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}
