package com.training.springwithhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sessionFactory;

	public String saveProduct(Product product) {

		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(product);
		ts.commit();
		session.close();
		return "Product details Saved";

	}

	public List<Product> getProduct() {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		List<Product> productList = session.createQuery("from Product").list();
		ts.commit();
		session.close();
		return productList;

	}

	public Product findProduct(Integer pid) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		Product pr = session.load(Product.class, pid);
		ts.commit();
		session.close();
		return pr;

	}

	public String deleteProduct(Integer pid) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		Product pr = session.load(Product.class, pid);
		session.delete(pr);
		ts.commit();
		session.close();
		return null;

	}
}
