package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Candidate;

@Repository
public class CandidateDao {

	@Autowired
	SessionFactory sf;
	
	public String addCandidate(Candidate candidate) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(candidate);
		tr.commit();
		session.close();
		return "Registration Successful";
		
	}

}
