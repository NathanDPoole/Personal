package com.revature.util;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static Session mysession = new Configuration().configure().buildSessionFactory().openSession();

	public static Session getSession() {
		return mysession;
	}
	
	public static void closeSession() {
		mysession.close();
	}
	
//	private static Session mysession = null;
//	
//	private HibernateUtil() {}
//	
//	public static SessionFactory mySessionFactory() {
//		
//		return new Configuration().configure().buildSessionFactory();
//	}
//	
//	public static Session getSession() {
//		if(mysession == null || !mysession.isConnected()) {
//			mysession = HibernateUtil.mySessionFactory().openSession();
//		}
//		return mysession;
//	}
//	
//	public static void closeSession() {
//		mysession.close();
//	}
//	
//	public static void checkSession() {
//		if( mysession == null || !mysession.isConnected()) {
//			System.out.println("session is null");
//			System.out.println(mysession.isOpen());
//			System.out.println(mysession.isConnected());
//		} else {
//			System.out.println(mysession);
//		}
//	}
}
