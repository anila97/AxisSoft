package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.EmployeeDetails;
import com.employee.service.EmployeeService;

@RestController("/addEmployee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(consumes = { "application/xml", "application/json" }, method = RequestMethod.POST)
	public String addEmployee(@RequestBody EmployeeDetails empDetails) {

		return employeeService.saveEmployee(empDetails);
	}

}
