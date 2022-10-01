package com.masai.main;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Booking;
import com.masai.bean.Bus;
import com.masai.bean.Customer;
import com.masai.dao.PassengerDao;
import com.masai.dao.PassengerDaoImpl;
import com.masai.exceptions.AdminException;
import com.masai.exceptions.BookingException;
import com.masai.exceptions.BusException;
import com.masai.exceptions.CustomerException;


public class Main {
  public static void main(String[] args) throws CustomerException  {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Welcome to CHAUDHARY TRAVELS");
		System.out.println("Enter as Admin/Customer");
		System.out.println("1. Customer");
		System.out.println("2. Admin");
		System.out.println("3.Exit!!");
		int n=sc.nextInt();
		if(n==1) {
			try {
				System.out.println("Wecome to Ticket Booking counter");
				System.out.println("1. Registration for New Customers");
				System.out.println("2. Book a ticket");
				System.out.println("3. Cancel a ticket");
				System.out.println("4. Get all Bus Details");
				System.out.println("5. Exit!!");
				int ti=sc.nextInt();
				if(ti==1) {
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
				}
				if(ti==2) {
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
				
				}
				if(ti==3) {
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
				}
				if(ti==4) {
					PassengerDao dao=new PassengerDaoImpl();
					
					try {
						List<Bus> buses=dao.getAllBusDetails();
						buses.forEach(b->{
							System.out.println("Bus Number              : "+b.getBusNo());
							System.out.println("Bus Name                : "+b.getBname());
							System.out.println("Route From              : "+b.getRoutefrom());
							System.out.println("Rout to                 : "+b.getRouteto());
							System.out.println("Bus type                : "+b.getBtype());
							System.out.println("Bus Arrival date        : "+b.getArrival());
							System.out.println("Bus Departure date      : "+b.getDeparture());
							System.out.println("Total Seats in Bus      : "+b.getTotalseats());
							System.out.println("Available Seats in Bus  : "+b.getAvailseats());
							System.out.println("Bus fare for individual : "+b.getFare());
							
							System.out.println("******************");
						});
						
					} catch (BusException be) {
						System.out.println(be.getMessage());
					}
				}
				if(ti==5) {
					System.out.println("Thank You...");
				}
				sc.close();
			} catch (Exception e) {
				throw new CustomerException("Invalid input...");
			}
			
		}
		if(n==2) {
			System.out.println("Welcome Admin");
			System.out.println("Enter Admin Username");
			String username=sc.next();
			System.out.println("Enter Admin Password");
			String password=sc.next();
			
			PassengerDao dao=new PassengerDaoImpl();
		    try {
				dao.loginadmin(username, password);
				System.out.println("Welcome Admin");
				System.out.println("1. Register Bus Details");
				System.out.println("2. Get All Bus Details");
				System.out.println("3. Check All Booked Tickets");
				System.out.println("4. Exit!!");
				int t2=sc.nextInt();
				if(t2==1) {
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
				}
				if(t2==2) {
					
					try {
						List<Bus> buses=dao.getAllBusDetails();
						buses.forEach(b->{
							System.out.println("Bus Number              : "+b.getBusNo());
							System.out.println("Bus Name                : "+b.getBname());
							System.out.println("Route From              : "+b.getRoutefrom());
							System.out.println("Rout to                 : "+b.getRouteto());
							System.out.println("Bus type                : "+b.getBtype());
							System.out.println("Bus Arrival date        : "+b.getArrival());
							System.out.println("Bus Departure date      : "+b.getDeparture());
							System.out.println("Total Seats in Bus      : "+b.getTotalseats());
							System.out.println("Available Seats in Bus  : "+b.getAvailseats());
							System.out.println("Bus fare for individual : "+b.getFare());
							
							System.out.println("******************");
						});
						
					} catch (BusException be) {
						System.out.println(be.getMessage());
					}
				}
				if(t2==3) {
					try {
						List<Booking> bookings=dao.showAllBooking();
						bookings.forEach(b->{
						System.out.println("Customer ID                 : "+b.getCusId());
						    System.out.println("Bus Number              : "+b.getBusNo());
							System.out.println("Customer Name           : "+b.getCname());
							System.out.println("Route from              : "+b.getRoutefrom());
							System.out.println("Route to                : "+b.getRouteto());
							System.out.println("Bus Arrivale date       : "+b.getArrival());
							System.out.println("Bus departure date      : "+b.getDeparture());
							System.out.println("Bus fare for Individual : "+b.getFare());
							System.out.println("******************");
						});
						
						
					} catch (BookingException e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
				}
				if(t2==4) {
					System.out.println("Thank You...");
				}
				sc.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new AdminException("Invalid Input..");
			}
		}
		if(n==3) {
			System.out.println("Thank You..!!");
		}
	} catch (Exception e) {
		// TODO: handle exception
		throw new CustomerException("Invalid input...");
	}
	
	
//	sc.close();
}
}
