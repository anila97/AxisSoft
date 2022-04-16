package com.employee.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "id", "name", "number" })
@JsonIgnoreType
@Configuration
public class EmployeeDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonIgnoreProperties
	private int employee_id;
	@JsonIgnoreProperties
	private String employee_nm;
	@JsonIgnoreProperties
	private String contact_no;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_nm() {
		return employee_nm;
	}

	public void setEmployee_nm(String employee_nm) {
		this.employee_nm = employee_nm;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employee_id=" + employee_id + ", employee_nm=" + employee_nm + ", contact_no="
				+ contact_no + "]";
	}

}
