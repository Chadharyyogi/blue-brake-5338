package com.masai.usecaes;

import java.util.Scanner;

import com.masai.dao.PassengerDao;
import com.masai.dao.PassengerDaoImpl;
import com.masai.exceptions.BusException;
import com.masai.exceptions.CustomerException;

public class BookSeat {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("CHAUDHARY TRAVELS");
	System.out.println("Book your Ticket Here");
	System.out.println("Enter Customer ID");
	int cusId=sc.nextInt();
	System.out.println("Enter Bus Number");
	int busNo=sc.nextInt();
	
	PassengerDao dao=new PassengerDaoImpl();
	try {
		String result=dao.seatBookingViaCustomer(cusId, busNo);
		System.out.println(result);
	} catch (BusException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (CustomerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sc.close();
}
}
