package com.teamsankya.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empp_contact")
public class EmployeeContactBean implements Serializable
{
	
	@Id
	@OneToOne
	@JoinColumn(name="id",referencedColumnName="id")
	private EmployeeBean empBean;
	
	@Column(name="phnum")
	private long phnum;
	
	@Column(name="email")
	private String email;
	
	@Override
	public String toString()
	{
		return "EmployeeContactBean [eid=" + empBean.getId() + ", phnum=" + phnum  
				+" , email= "+ email  + "]";
	}

	public EmployeeBean getEmpBean() {
		return empBean;
	}

	public void setEmpBean(EmployeeBean empBean) {
		this.empBean = empBean;
	}

	public long getPhnum() {
		return phnum;
	}

	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
