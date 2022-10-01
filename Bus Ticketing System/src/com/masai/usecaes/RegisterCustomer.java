package com.masai.usecaes;

import java.util.Scanner;

import com.masai.bean.Customer;
import com.masai.dao.PassengerDao;
import com.masai.dao.PassengerDaoImpl;

public class RegisterCustomer {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  
	  System.out.println("Enter Customer details");
	  System.out.println("**************");
	  System.out.println("Enter Customer ID ");
	  int cusId=sc.nextInt();
	  System.out.println("Enter Customer Name");
	  String cname=sc.next();
	  System.out.println("Enter Customer mobile number");
	  int mobile=sc.nextInt();
	  
	  PassengerDao dao=new PassengerDaoImpl();
      Customer c=new Customer();
      c.setCusId(cusId);
      c.setCname(cname);
      c.setMobile(mobile);
      
      String result=dao.registerCoustomer(c);
      System.out.println(result);
      sc.close();
}
}
