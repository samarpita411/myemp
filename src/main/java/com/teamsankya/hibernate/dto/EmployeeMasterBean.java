package com.teamsankya.hibernate.dto;

import java.io.Serializable;

public class EmployeeMasterBean implements Serializable
{
	private EmployeeBean employeeBean=new EmployeeBean();
	private EmployeeAddressBean employeeAddressBean=new EmployeeAddressBean();
	private EmployeeContactBean employeeContactBean=new EmployeeContactBean();
	private EmployeeTaskBean employeeTaskBean=new EmployeeTaskBean();
	
	public EmployeeBean getEmployeeBean() {
		return employeeBean;
	}
	public void setEmployeeBean(EmployeeBean employeeBean) {
		this.employeeBean = employeeBean;
	}
	public EmployeeAddressBean getEmployeeAddressBean() {
		return employeeAddressBean;
	}
	public void setEmployeeAddressBean(EmployeeAddressBean employeeAddressBean) {
		this.employeeAddressBean = employeeAddressBean;
	}
	public EmployeeContactBean getEmployeeContactBean() {
		return employeeContactBean;
	}
	public void setEmployeeContactBean(EmployeeContactBean employeeContactBean) {
		this.employeeContactBean = employeeContactBean;
	}
	public EmployeeTaskBean getEmployeeTaskBean() {
		return employeeTaskBean;
	}
	public void setEmployeeTaskBean(EmployeeTaskBean employeeTaskBean) {
		this.employeeTaskBean = employeeTaskBean;
	}
	
	
	
	

}
