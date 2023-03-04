package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Candidate;
import com.example.service.CandidateService;

@CrossOrigin
@RestController
public class CandidateController {
	
	@Autowired
	CandidateService candyservice;
	
	@PostMapping("/candidate")
	public String addCandidate(@RequestBody Candidate candidate) {
		return candyservice.addCandidate(candidate);
	}
}
