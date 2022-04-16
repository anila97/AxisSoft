package com.employee.utility;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class EmployeeUtility implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employee_id;
	private String employee_nm;
	private String contact_no;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contact_no == null) ? 0 : contact_no.hashCode());
		result = prime * result + employee_id;
		result = prime * result + ((employee_nm == null) ? 0 : employee_nm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeUtility other = (EmployeeUtility) obj;
		if (contact_no == null) {
			if (other.contact_no != null)
				return false;
		} else if (!contact_no.equals(other.contact_no))
			return false;
		if (employee_id != other.employee_id)
			return false;
		if (employee_nm == null) {
			if (other.employee_nm != null)
				return false;
		} else if (!employee_nm.equals(other.employee_nm))
			return false;
		return true;
	}

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
