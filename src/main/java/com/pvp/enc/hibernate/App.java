package com.pvp.enc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pvp.enc.employee.Employee;

/**
 * Employee
 */
public class App {

	public static void main(String[] args) {

		Employee emp = new Employee();
		// emp.setEmpId(100);
		emp.setName("Praveen");
		emp.setDepartment("java");
		emp.setJob("programmer");

		System.out.println(emp.toString());

		Configuration conf = new Configuration().configure().addAnnotatedClass(Employee.class);

		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();

		session.save(emp);
		tx.commit();
	}

}
