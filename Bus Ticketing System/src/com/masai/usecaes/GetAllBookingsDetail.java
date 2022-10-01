package com.masai.usecaes;

import java.util.List;

import com.masai.bean.Booking;
import com.masai.dao.PassengerDao;
import com.masai.dao.PassengerDaoImpl;
import com.masai.exceptions.BookingException;

public class GetAllBookingsDetail {
public static void main(String[] args) {
	PassengerDao dao=new PassengerDaoImpl();
	
	try {
		List<Booking> bookings=dao.showAllBooking();
		bookings.forEach(b->{
		System.out.println(b.getCusId());
		    System.out.println(b.getBusNo());
			System.out.println(b.getCname());
			System.out.println(b.getRoutefrom());
			System.out.println(b.getRouteto());
			System.out.println(b.getArrival());
			System.out.println(b.getDeparture());
			System.out.println(b.getFare());
			System.out.println("******************");
		});
		
		
	} catch (BookingException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}
