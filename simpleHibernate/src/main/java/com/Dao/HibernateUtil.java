package com.Dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static SessionFactory getFactory() {
		return sessionFactory;
	}

}
