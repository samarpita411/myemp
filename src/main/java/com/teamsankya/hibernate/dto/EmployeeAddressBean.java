package com.teamsankya.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="empp_address")
public class EmployeeAddressBean implements Serializable
{
	@EmbeddedId
	private EmployeeAddressPk empAddressPk;
	@Column(name="pincode")
	private int pincode;
	@Column(name="address1")
	private String address1;
	@Column(name="address2")
	private String address2;
	@Column(name="city")
	private String city;
	
	
	@Override
	public String toString() 
	{
		return "EmployeeAddressBean [eid=" + empAddressPk.getEmpBean().getId()
				+ ", pincode=" + pincode  +" , address1= "+ address1 
				+" , address2= "+ address2 + " , city= "+ city  + "]";
	}
	
	
	
	
	public EmployeeAddressPk getEmpAddressPk() {
		return empAddressPk;
	}
	public void setEmpAddressPk(EmployeeAddressPk empAddressPk) {
		this.empAddressPk = empAddressPk;
	}

	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
