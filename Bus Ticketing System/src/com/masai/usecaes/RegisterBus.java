package com.masai.usecaes;


import java.util.Scanner;

import com.masai.bean.Bus;
import com.masai.dao.PassengerDao;
import com.masai.dao.PassengerDaoImpl;

public class RegisterBus {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter bus Details");
	System.out.println("****************");
	System.out.println("Enter Bus Number");
	int busNo=sc.nextInt();
	System.out.println("Enter Bus Name");
	String bname =sc.next();
	System.out.println("Enter Bus route from");
	String routefrom=sc.next();
	System.out.println("Enter Bus route to");
	String routeto=sc.next();
	System.out.println("Enter Bus Type ");
	String btype=sc.next();
	System.out.println("Enter Date of Arrival");
	 String arrival=sc.next();
	 System.out.println("Enter Date of Departure");
	 String departure=sc.next();
	 System.out.println("Enter Total Seats in Bus");
		int totalseats=sc.nextInt(); 
		System.out.println("Enter Available Seats in Bus");
		int availseats=sc.nextInt();
		System.out.println("Enter fare of Bus");
		int fare=sc.nextInt();
	 
	 PassengerDao dao=new PassengerDaoImpl();
	 Bus b=new Bus();
	 b.setBusNo(busNo);
	 b.setBname(bname);
	 b.setRoutefrom(routefrom);
	 b.setRouteto(routeto);
	 b.setBtype(btype);
	 b.setArrival(arrival);
	 b.setDeparture(departure);
	 b.setTotalseats(totalseats);
	 b.setAvailseats(availseats);
	 b.setFare(fare);
	 
	 String result=dao.registerBus(b);
	 System.out.println(result);
	sc.close();
}
}
