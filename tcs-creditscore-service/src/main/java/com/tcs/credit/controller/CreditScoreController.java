package com.tcs.credit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.credit.entity.CreditScore;
import com.tcs.credit.service.CreditScoreService;

@RestController
@RequestMapping("/creditscore")
public class CreditScoreController {
	@Autowired
	CreditScoreService service;
	
	@PostMapping
	public ResponseEntity<String> add(@RequestBody CreditScore score){
		service.save(score);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<CreditScore>> findAll(){
		return new ResponseEntity<List<CreditScore>>(service.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/{pancard}")
	public ResponseEntity<Optional<CreditScore>> findById(@PathVariable String pancard){
			Optional<CreditScore> score = service.findById(pancard);
		return new ResponseEntity<Optional<CreditScore>>(score,HttpStatus.OK);
	}
}
