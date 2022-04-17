package com.employee.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.employee.utility.EmployeeUtility;

@Repository
public class EmployeeHibernateImpl implements EmployeeHibernate {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String save(EmployeeUtility empUtility) {
		sessionFactory.getCurrentSession().save(empUtility);
		return "SUCCESS SAVE";
	}

}
