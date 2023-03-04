package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CandidateDao;
import com.example.model.Candidate;

@Service
public class CandidateService {

	@Autowired
	CandidateDao candidao;	

	public String addCandidate(Candidate candidate) {
		return candidao.addCandidate(candidate);
	}
}
