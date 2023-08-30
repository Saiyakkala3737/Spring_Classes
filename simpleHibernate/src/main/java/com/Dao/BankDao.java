package com.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Bank;

public class BankDao {

	public void makePersistent(Bank b) {
		Transaction tx = null;
		try {
			Session session = HibernateUtil.getFactory().openSession();
			tx = session.beginTransaction();
			session.save(b);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

	public void makeTransient(Bank b) {
		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.delete(b);
			tx.commit();
			session.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Bank getBankfromID(int id) {
		Bank b = null;
		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			b = (Bank) session.load(Bank.class, new Integer(id));
			System.out.println("BankDAO - getBank() : b.getBank after load " + b.getBank());
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			;
		}
		return b;
	}

	public void update(Bank b) {
		try {
			Session session = HibernateUtil.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(b);
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
