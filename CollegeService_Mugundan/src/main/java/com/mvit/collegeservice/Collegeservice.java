package com.mvit.collegeservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Collegeservice {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="dept")
	private String dept;
	@Column(name="dob")
	private int dob;
	@Column(name="address")
	private String address;
	@Column(name="phonenumber")
	private int phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Collegeservice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collegeservice(int id, String name, String dept, int dob, String address, int phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.dob = dob;
		this.address = address;
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Collegeservice [id=" + id + ", name=" + name + ", dept=" + dept + ", dob=" + dob + ", address="
				+ address + ", phonenumber=" + phonenumber + "]";
	}
	

}
