package com.employee.service;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeHibernate;
import com.employee.entity.EmployeeDetails;
import com.employee.utility.EmployeeUtility;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeUtility empUtility;
	@Autowired
	private EmployeeHibernate empHibernate;

	@Override
	public String saveEmployee(EmployeeDetails empDetails) {

		try {
			BeanUtils.copyProperties(empDetails, empUtility);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return empHibernate.save(empUtility);
	}

}
