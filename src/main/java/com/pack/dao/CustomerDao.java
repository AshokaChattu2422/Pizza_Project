package com.pack.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.pack.model.User;

public class CustomerDao<User> {

	@Autowired
	private	 SessionFactory sessionFactory;
	 
	 
	 
	public void addUser(User user) {
		   
		 Session session=((Object) sessionFactory).openSession();
		  Transaction tx=session.beginTransaction();
		   session.save(user);
		  tx.commit();
		  session.close(); 
	  }
	
	
	public CustomerDao getUser(int id)
	{
		CustomerDao user1=null;
		Session session=sessionFactory.openSession();
		 String hql="from User where id="+id;
	  	 Query query = session.createQuery(hql);
	  	 
	  	 List<CustomerDao> list=query.getResultList();
	  	 
	  	 for (CustomerDao u:list)
	  	 {
	  		 user1=u; 
	  	 }
	  	 
	  	 return user1;
	  	       
	  	         
	}
	
	
	public int delete(CustomerDao user)
	{
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="delete from User where id="+user.getId();
		 Query query = session.createQuery(hql);
		 int k=query.executeUpdate();
		 tx.commit();
		 return k;
	}
	}




}
