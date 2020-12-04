package com.pack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.pack.model.Login;

public class LoginDao {
	
	@Autowired
	private	 SessionFactory sessionFactory;
	 
	 
	 
	public void addUser(Login user) {
		   
		 Session session=sessionFactory.openSession();
		  Transaction tx=session.beginTransaction();
		  session.save(user);
		  tx.commit();
		  session.close(); 
	  }
}
