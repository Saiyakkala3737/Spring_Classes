package com.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Person;

public class PersonDao {
	public void makePersistent(Person p) {
		Transaction tx = null;
		try {
			Session session = HibernateUtil.getFactory().openSession();
			tx = session.beginTransaction();
			session.save(p);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

	public void makeTransient(Person p) {

		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.delete(p);
			tx.commit();
			session.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Person getPerfromID(int id) {
		Person p = null;
		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			p = (Person) session.load(Person.class, new Integer(id));
			System.out.println("PersonDAO - getStudfromID() : p.fName after load " + p.getfName());
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			;
		}
		return p;
	}

	public void update(Person p) {
		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(p);
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
