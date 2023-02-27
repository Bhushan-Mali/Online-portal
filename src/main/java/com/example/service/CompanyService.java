package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CompanyDao;
import com.example.model.Company;

@Service
public class CompanyService {

	@Autowired
	CompanyDao cdao;
	
	public String getCompanyDetails(Company company) {
		return cdao.getCompanyDetails(company);
		
	}

}
