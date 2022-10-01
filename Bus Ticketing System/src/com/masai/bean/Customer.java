package com.masai.bean;

public class Customer {
 private int cusId;
 private String cname;
 private int mobile;
public Customer(int cusId, String cname, int mobile) {
	super();
	this.cusId = cusId;
	this.cname = cname;
	this.mobile = mobile;
}
public Customer() {
	super();
}
public int getCusId() {
	return cusId;
}
public void setCusId(int cusId) {
	this.cusId = cusId;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Customer [cusId=" + cusId + ", cname=" + cname + ", mobile=" + mobile + "]";
}
 
 
}
