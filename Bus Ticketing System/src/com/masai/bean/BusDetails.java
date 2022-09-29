package com.masai.bean;

public class BusDetails {
  private String bname;
  private String broute;
  private String ac_non_ac;
  private int bseats;
  private int bfare;
public BusDetails() {
	super();
}
public BusDetails(String bname, String broute, String ac_non_ac, int bseats, int bfare) {
	super();
	this.bname = bname;
	this.broute = broute;
	this.ac_non_ac = ac_non_ac;
	this.bseats = bseats;
	this.bfare = bfare;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getBroute() {
	return broute;
}
public void setBroute(String broute) {
	this.broute = broute;
}
public String getAc_non_ac() {
	return ac_non_ac;
}
public void setAc_non_ac(String ac_non_ac) {
	this.ac_non_ac = ac_non_ac;
}
public int getBseats() {
	return bseats;
}
public void setBseats(int bseats) {
	this.bseats = bseats;
}
public int getBfare() {
	return bfare;
}
public void setBfare(int bfare) {
	this.bfare = bfare;
}
@Override
public String toString() {
	return "BusDetails [bname=" + bname + ", broute=" + broute + ", ac_non_ac=" + ac_non_ac + ", bseats=" + bseats
			+ ", bfare=" + bfare + "]";
}
  
  
}
