package com.masai.usecaes;

import java.util.List;

import com.masai.bean.Bus;
import com.masai.dao.PassengerDao;
import com.masai.dao.PassengerDaoImpl;
import com.masai.exceptions.BusException;

public class GetAllBusDetails {
public static void main(String[] args) {
	PassengerDao dao=new PassengerDaoImpl();
	
try {
	List<Bus> buses=dao.getAllBusDetails();
	buses.forEach(b->{
		System.out.println(b.getBusNo());
		System.out.println(b.getBname());
		System.out.println(b.getRoutefrom());
		System.out.println(b.getRouteto());
		System.out.println(b.getBtype());
		System.out.println(b.getArrival());
		System.out.println(b.getDeparture());
		System.out.println(b.getTotalseats());
		System.out.println(b.getAvailseats());
		System.out.println(b.getFare());
		
		System.out.println("******************");
	});
	
} catch (BusException be) {
	System.out.println(be.getMessage());
}
}
}
