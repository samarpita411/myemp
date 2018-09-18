package com.teamsankya.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
