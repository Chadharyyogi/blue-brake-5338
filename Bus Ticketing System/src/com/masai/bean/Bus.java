package com.masai.bean;



public class Bus {
  private int busNo;
  private String bname;
  private String routefrom ;
  private String routeto;
  private String btype;
  private String arrival;
  private String departure;
  private int totalseats;
  private int availseats;
  private int fare;
public Bus(int busNo, String bname, String routefrom, String routeto, String btype, String arrival, String departure,
		int totalseats, int availseats, int fare) {
	super();
	this.busNo = busNo;
	this.bname = bname;
	this.routefrom = routefrom;
	this.routeto = routeto;
	this.btype = btype;
	this.arrival = arrival;
	this.departure = departure;
	this.totalseats = totalseats;
	this.availseats = availseats;
	this.fare = fare;
}
public Bus() {
	super();
}
public int getBusNo() {
	return busNo;
}
public void setBusNo(int busNo) {
	this.busNo = busNo;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
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
public String getBtype() {
	return btype;
}
public void setBtype(String btype) {
	this.btype = btype;
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
public int getTotalseats() {
	return totalseats;
}
public void setTotalseats(int totalseats) {
	this.totalseats = totalseats;
}
public int getAvailseats() {
	return availseats;
}
public void setAvailseats(int availseats) {
	this.availseats = availseats;
}
public int getFare() {
	return fare;
}
public void setFare(int fare) {
	this.fare = fare;
}
@Override
public String toString() {
	return "Bus [busNo=" + busNo + ", bname=" + bname + ", routefrom=" + routefrom + ", routeto=" + routeto + ", btype="
			+ btype + ", arrival=" + arrival + ", departure=" + departure + ", totalseats=" + totalseats
			+ ", availseats=" + availseats + ", fare=" + fare + "]";
}
  
  
}
