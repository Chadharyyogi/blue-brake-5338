package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Bus;
import com.masai.bean.Customer;
import com.masai.exceptions.AdminException;
import com.masai.exceptions.BusException;
import com.masai.exceptions.CustomerException;
import com.masai.utility.DBUtil;

public class PassengerDaoImpl implements PassengerDao{

	@Override
	public String registerCoustomer(Customer c) {
		// TODO Auto-generated method stub
		String message="Not inserted";
		
		try(Connection conn= DBUtil.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement
					("insert into Customer(cusId,cname,mobile) values(?,?,?)");
			ps.setInt(1,c.getCusId());
			ps.setString(2, c.getCname());
			ps.setInt(3, c.getMobile());
			
        int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Customer Registered Sucessfully !";
			
		} catch (SQLException e) {
			// TODO: handle exception
			message=e.getMessage();
		}
		return message;
	}

	@Override
	public String registerBus(Bus b) {
		// TODO Auto-generated method stub
		String message="Not inserted";
		try(Connection conn= DBUtil.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement
					("insert into Bus(busNo,bname,routefrom,routeto,btype,arrival,departure,totalseats,availseats,fare) values(?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,b.getBusNo());
			ps.setString(2, b.getBname());
			ps.setString(3, b.getRoutefrom());
			ps.setString(4, b.getRouteto());
			ps.setString(5, b.getBtype());
			ps.setString(6, b.getArrival());
			ps.setString(7, b.getDeparture());
			ps.setInt(8, b.getTotalseats());
			ps.setInt(9, b.getAvailseats());
			ps.setInt(10, b.getFare());
			
			
        int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Bus Registered Sucessfully !";
			
		} catch (SQLException e) {
			// TODO: handle exception
			message=e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public void loginadmin(String username, String password) throws AdminException {
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from Admin where username = ? AND password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
//				String e= rs.getString("username");
//				String p= rs.getString("password");
//				
				
			System.out.println("Admin Login Successfully");
				
				
			}else
				throw new AdminException("Invalid Username or password.. ");
			
			
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new AdminException(e.getMessage());
		}
	}

	@Override
	public List<Bus> getAllBusDetails() throws BusException {
		List<Bus> buses=new ArrayList<>();
		

		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from Bus");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				int busNo=rs.getInt("busNo");
				String bname=rs.getString("bname");
				String routefrom=rs.getString("routefrom");	
				String routeto=rs.getString("routeto");
				String btype=rs.getString("btype");
				String arrival=rs.getString("arrival");
				String departure=rs.getString("departure");
				int totalSeats=rs.getInt("totalSeats");
				int availSeats=rs.getInt("availSeats");
				int fare=rs.getInt("fare");
				
    Bus b=new Bus(busNo, bname, routefrom, routeto, btype, arrival, departure, totalSeats, availSeats, fare);					
			buses.add(b);
	
			}		
			
		} catch (SQLException e) {
			throw new BusException(e.getMessage());
		}
		
		
		if(buses.size() == 0)
			throw new BusException("No Buses found..");
		return buses;
		
	}

	@Override
	public String seatBookingViaCustomer(int cusId, int busNo) throws BusException,CustomerException {
   String message="No Seat Booked";
	try(Connection conn= DBUtil.provideConnection()) {
		
	 	PreparedStatement ps= conn.prepareStatement("select * from customer where cusId =?");
		
	 	ps.setInt(1, cusId);
	 	
	 	ResultSet rs= ps.executeQuery();
		
	 	if(rs.next()) {
	 		
	 		PreparedStatement ps2= conn.prepareStatement("select * from bus where busNo=?");
	 		
	 		ps2.setInt(1, busNo);

	 		ResultSet rs2= ps2.executeQuery();
	 		
	 		if(rs2.next()) {
	 			

	 			PreparedStatement ps3= conn.prepareStatement("insert into booking values(?,?)");
	 			
	 			
	 			ps3.setInt(1, cusId);
	 			ps3.setInt(2, busNo);
	 			
	 			int x= ps3.executeUpdate();
	 			
	 			if(x > 0)
	 				message = "Seat Booked Successfully.... ";
	 			else
	 				throw new BusException("Techical error..");
	 		}
	 		else
	 			throw new BusException("Invalid Bus Details..");	 		
	 	}else
	 		throw new BusException("Invalid Customer Details...");
	
	} catch (SQLException e) {
		throw new BusException(e.getMessage());
	}

   return message;
	}

	@Override
	public String cancelSeat(int cusId,int busNo) throws CustomerException{
		String message="Seat can not be Cancelled";
		
		try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("delete from booking where cusId =? AND busNo=?");
			ps.setInt(1, cusId);
			ps.setInt(2, busNo);
			int x=ps.executeUpdate();
			if(x>0) {
				message="Seat cancelled successfully...";
			}		
 			
		} catch (Exception e) {
			// TODO: handle exception
	throw new CustomerException("Wrong Details...");
			
		}
		
		return message;
	}

	
		
		
		
	
   
}
