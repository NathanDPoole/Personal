package com.revature;

//import java.util.Date;

//import org.hibernate.Session;

import com.revature.dao.EmployeeDaoImp;
//import com.revature.model.Customer;
//import com.revature.model.Employee;
//import com.revature.util.HibernateUtil;

public class TestClass {

	public static void main(String[] args) {

		EmployeeDaoImp ed = new EmployeeDaoImp();
		//ed.insertEmployee(new Employee("tom","Nathan", new Date()));
		
		//ed.updateEmployeeName(1, "John");
		//System.out.println((ed.findById(1).toString()));
		//System.out.println((ed.findByName("Tom").toString()));
		System.out.println((ed.getAllEmployees()).toString());
		//ed.hplExample();
		//System.out.println(ed.findByName("Bob"));

	}

//	public static void insertCustomer() {
//		Session session = HibernateUtil.getSession();
//
//		session.beginTransaction();
//
//		Customer c1 = new Customer();
//
//		c1.setCustName("Peyton Manning4");
//		c1.setCustPhone("123-456-7890");
//		c1.setCustAddress("1, main St, herndon, va 20170");
//
//		session.save(c1);
//		session.getTransaction().commit();
//		session.close();
//		HibernateUtil.closeSession();
//	}


}
