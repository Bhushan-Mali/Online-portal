package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Company;
import com.example.service.CompanyService;

@CrossOrigin
@RestController
public class CompanyController {
	
	@Autowired
	CompanyService cservice;
	
	@PostMapping("/newcompany")
	public String getCompanyDetails(@RequestBody Company company) {
		return cservice.getCompanyDetails(company);
	}
	
	
}
