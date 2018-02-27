package com.revature.dao;

import java.util.Date;
import java.util.List;

//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.query.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
//import org.hibernate.criterion.Restrictions;

import com.revature.model.Employee;
import com.revature.util.HibernateUtil;

public class EmployeeDaoImp implements EmployeeDao {

	@Override
	public void insertEmployee(Employee emp) {

		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(emp);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			System.out.println(session);
			//HibernateUtil.checkSession();
		}
	}

	@Override
	public void updateEmployeeName(int id, String name) {

		Session session = HibernateUtil.getSession();
		Employee emp = new Employee();
		try {
			session.beginTransaction();
			emp = session.get(Employee.class, id);
			emp.setEmpName(name);
			session.update(emp);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			HibernateUtil.closeSession();

		}
	}

	@Override
	public Employee findById(int id) {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();
			return session.get(Employee.class, id);
		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			HibernateUtil.closeSession();

		}
		return new Employee();
	}

	@Override
	public Employee findByName(String name) {
//		Session session = HibernateUtil.getSession();
//		Employee e = (Employee) session.createCriteria(Employee.class).add(Restrictions.eq("empName", name)).list().get(0);
//		//CriteriaBuilder cb = session.getCriteriaBuilder();
//		//CriteriaQuery<Employee> criteria = cb.createQuery(Employee.class);
//		session.close();
//		HibernateUtil.closeSession();
//		return e;
		return new Employee("findByName Not Implemented", "nathan", new Date());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();
			return session.createQuery("from Employee").list();
		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			//HibernateUtil.checkSession();
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public void hplExample() {
		Session session = HibernateUtil.getSession();
		Query query;
		String hql = "from com.revatrue";
		try {
			hql = "from com.revature.model.Employee";
			session.beginTransaction();
			query = session.createQuery(hql);

			System.out.println(query.list());

			hql = "from  Emoloyee where id=:someId";
			query = session.createQuery(hql);
			query.setParameter("someId", 3);

			System.out.println(query.list());
			System.out.println(query.uniqueResult());

		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			HibernateUtil.closeSession();
		}

	}

}