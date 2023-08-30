package com.apex.user.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.apex.user.entity.User;
import com.apex.user.util.HibernateUtil;

public class UserDao {

	public void addUSER(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.beginTransaction();
		
		
		

	}

	public User getUser(int userId) {
		Session session=-HibernateUtil.getSessionFactory().openSession();
		User user = (User) session.load(User.class, new Integer(userId));
		return null;

	}

	public void updateUser(User user) {

	}

	public void deleteUser(int id) {

	}

}
