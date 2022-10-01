package com.masai.usecaes;

import java.util.Scanner;

import com.masai.dao.PassengerDao;
import com.masai.dao.PassengerDaoImpl;

import com.masai.exceptions.CustomerException;

public class CancelBooking {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Canel your ticket by a simple step");	
    System.out.println("Enter Customer ID");
    int cusId=sc.nextInt();
    System.out.println("Enter bus number");
    int busNo=sc.nextInt();
   
   
    PassengerDao dao=new PassengerDaoImpl();
    try {
		String result=dao.cancelSeat(cusId,busNo);
		System.out.println(result);
	} 
    catch (CustomerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   sc.close();
    
}
}
