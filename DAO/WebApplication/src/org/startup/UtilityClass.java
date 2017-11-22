package org.startup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UtilityClass {

	private static SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		System.out.println("called configure()");
		sessionFactory = configuration.buildSessionFactory();
		System.out.println("called buildSessionFactory()");
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static Session getSession(){
		Session session = sessionFactory.openSession();
		return session;
	}
	private UtilityClass(){}
	}


