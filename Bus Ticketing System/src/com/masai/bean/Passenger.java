package com.masai.bean;

public class Passenger {
   private String pname;
   private int page;
   private String pemail;
   
public Passenger() {
	super();
}

public Passenger(String pname, int page, String pemail) {
	super();
	this.pname = pname;
	this.page = page;
	this.pemail = pemail;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public int getPage() {
	return page;
}

public void setPage(int page) {
	this.page = page;
}

public String getPemail() {
	return pemail;
}

public void setPemail(String pemail) {
	this.pemail = pemail;
}

@Override
public String toString() {
	return "Passenger [pname=" + pname + ", page=" + page + ", pemail=" + pemail + "]";
}
 

}
