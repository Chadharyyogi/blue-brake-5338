package com.masai.bean;

public class Booking {
  private int cusId;
  private int busNo;
  private String cname;
  private String routefrom;
  private String routeto;
  private String arrival;
  private String departure;
  private int fare;
public Booking(int cusId, int busNo, String cname, String routefrom, String routeto, String arrival, String departure,
		int fare) {
	super();
	this.cusId = cusId;
	this.busNo = busNo;
	this.cname = cname;
	this.routefrom = routefrom;
	this.routeto = routeto;
	this.arrival = arrival;
	this.departure = departure;
	this.fare = fare;
}
public Booking() {
	super();
}
public int getCusId() {
	return cusId;
}
public void setCusId(int cusId) {
	this.cusId = cusId;
}
public int getBusNo() {
	return busNo;
}
public void setBusNo(int busNo) {
	this.busNo = busNo;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getRoutefrom() {
	return routefrom;
}
public void setRoutefrom(String routefrom) {
	this.routefrom = routefrom;
}
public String getRouteto() {
	return routeto;
}
public void setRouteto(String routeto) {
	this.routeto = routeto;
}
public String getArrival() {
	return arrival;
}
public void setArrival(String arrival) {
	this.arrival = arrival;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}
public int getFare() {
	return fare;
}
public void setFare(int fare) {
	this.fare = fare;
}
@Override
public String toString() {
	return "Booking [cusId=" + cusId + ", busNo=" + busNo + ", cname=" + cname + ", routefrom=" + routefrom
			+ ", routeto=" + routeto + ", arrival=" + arrival + ", departure=" + departure + ", fare=" + fare + "]";
}
  
  
}
