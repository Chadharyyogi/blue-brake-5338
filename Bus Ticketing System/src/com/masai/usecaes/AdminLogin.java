package com.masai.usecaes;

import java.util.Scanner;

import com.masai.dao.PassengerDao;
import com.masai.dao.PassengerDaoImpl;
import com.masai.exceptions.AdminException;

public class AdminLogin {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Admin Username");
	String username=sc.next();
	System.out.println("Enter Admin Password");
	String password=sc.next();
	
	PassengerDao dao=new PassengerDaoImpl();
    try {
		dao.loginadmin(username, password);
		
	} catch (AdminException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   sc.close();
}
  
}
