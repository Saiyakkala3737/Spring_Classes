package com.training.springwithhibernatedemo.dao;

import javax.transaction.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.websocket.Session;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public String saveProduct(Product product) {
		Session session = (Session) sessionFactory.openSession();
		Transaction ts= ((SharedSessionContract) session).beginTransaction();
		((org.hibernate.Session) session).save(product);
		ts.commit();
		session.close();
		return "Product Details Saved";
	}
}
