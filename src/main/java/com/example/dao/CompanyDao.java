package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Company;

@Repository
public class CompanyDao {

	@Autowired
	SessionFactory sf;
	
	public String getCompanyDetails(Company company) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(company);
		tr.commit();
		session.close();
		return "New Comapny Added";
		
	}
		

}
