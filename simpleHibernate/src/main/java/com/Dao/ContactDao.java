package com.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Contact;

public class ContactDao {
	public void makePersistent(Contact c) {
		Transaction tx = null;
		try {
			Session session = HibernateUtil.getFactory().openSession();
			tx = session.beginTransaction();
			session.save(c);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

	public void makeTransient(Contact c) {

		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.delete(c);
			tx.commit();
			session.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Contact getContactfromID(int id) {
		Contact c = null;
		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			c = (Contact) session.load(Contact.class, new Integer(id));
			System.out.println("ContactDaO - getContactfromID() : c.getAddress after load " + c.getAddress());
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			;
		}
		return c;
	}

	public void update(Contact c) {
		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(c);
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
