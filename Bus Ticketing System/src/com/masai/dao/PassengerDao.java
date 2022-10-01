package com.masai.dao;

import java.util.List;

import com.masai.bean.Bus;
import com.masai.bean.Customer;
import com.masai.exceptions.AdminException;
import com.masai.exceptions.BusException;
import com.masai.exceptions.CustomerException;

public interface PassengerDao {
   public String registerCoustomer(Customer c);
   public String registerBus(Bus b);
   public void loginadmin(String username, String password)throws AdminException;
   public List<Bus> getAllBusDetails() throws BusException;
   public String seatBookingViaCustomer(int cusId, int busNo)throws BusException, CustomerException ;
   public String cancelSeat(int cusId,int busNo) throws CustomerException;
}
