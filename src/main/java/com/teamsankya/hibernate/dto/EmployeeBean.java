package com.teamsankya.hibernate.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="empp_info")
public class EmployeeBean implements Serializable
{
	
	@Override
	public String toString() {
		return "EmployeeBean [eid=" + id + ", name=" + fnm  +" "+ lnm  + "]";
	}
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="fnm")
	private String fnm;
	
	@Column(name="lnm")
	private String lnm;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="empBean")
	private EmployeeContactBean empContactBean;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="empBean")
	private List<EmployeeTaskBean> empTaskBean;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="empAddressPk.empBean")
	private List<EmployeeAddressBean> empAddressBean;
	
	

	public EmployeeContactBean getEmpContactBean() {
		return empContactBean;
	}

	public void setEmpContactBean(EmployeeContactBean empContactBean) {
		this.empContactBean = empContactBean;
	}

	public List<EmployeeTaskBean> getEmpTaskBean() {
		return empTaskBean;
	}

	public void setEmpTaskBean(List<EmployeeTaskBean> empTaskBean) {
		this.empTaskBean = empTaskBean;
	}

	public List<EmployeeAddressBean> getEmpAddressBean() {
		return empAddressBean;
	}

	public void setEmpAddressBean(List<EmployeeAddressBean> empAddressBean) {
		this.empAddressBean = empAddressBean;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFnm() {
		return fnm;
	}

	public void setFnm(String fnm) {
		this.fnm = fnm;
	}

	public String getLnm() {
		return lnm;
	}

	public void setLnm(String lnm) {
		this.lnm = lnm;
	}

	
	
}
