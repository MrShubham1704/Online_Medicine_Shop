package com.demo.Medicine_Shop;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.demo.Medicine_Shop.entities.User;
import com.demo.Medicine_Shop.entities.Medicalshop;
import com.demo.Medicine_Shop.entities.Medicines;
import com.demo.Medicine_Shop.entities.Order;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
	try {
	return new Configuration().configure("Hibernate.cfg.xml")
			.addAnnotatedClass(User.class)
//			.addAnnotatedClass(Login.class)
			.addAnnotatedClass(Medicalshop.class)
			.addAnnotatedClass(Medicines.class)
			.addAnnotatedClass(Order.class)
			
	.buildSessionFactory();
	} catch (Throwable ex) {
	throw new ExceptionInInitializerError(ex);
	}
	}
	public static SessionFactory getSessionFactory() {
	return sessionFactory;
	}
}
