package bcccp.carpark;

import java.util.List;

import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.ISeasonTicketDAO;

public class Carpark implements ICarpark {
	
	private List<ICarparkObserver> observers;
	private String carparkId;
	private int capacity;
	private int numberOfCarsParked;
	private IAdhocTicketDAO adhocTicketDAO;
	private ISeasonTicketDAO seasonTicketDAO;
	
	
	
	public Carpark(String name, int capacity, 
			IAdhocTicketDAO adhocTicketDAO, 
			ISeasonTicketDAO seasonTicketDAO) {
		//TODO Implement constructor
	   private String Full_name;
	   private int Parking_capacity;
	   Carpark(String name, int capacity,){
		Full_name = name;
		Parking_capacity = capacity;
	   	
	   }
           this.carparkId = name;
           this.capacity = capacity;
           this.adhocTicketDAO = adhocTicketDAO;
           this.seasonTicketDAO = seasonTicketDAO;
            
	}



	@Override
	public void register(ICarparkObserver observer) {
		// TODO Auto-generated method stub
            observers.add(observer);
        
	}

	@Override
	public void deregister(ICarparkObserver observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
            String name = carparkId;
		return name;
	}



	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
            if (numberOfCarsParked==capacity) {
                return true;
            }
		return false;
	}



	@Override
	public IAdhocTicket issueAdhocTicket() {
		// TODO Auto-generated method stub
            
		return adhocTicketDAO;
	}



	@Override
	public void recordAdhocTicketEntry() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public IAdhocTicket getAdhocTicket(String barcode) {
		// TODO Auto-generated method stub
                adhocTicketDAO = barcode;
		return adhocTicketDAO;
	}



	@Override
	public float calculateAddHocTicketCharge(long entryDateTime) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void recordAdhocTicketExit() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void registerSeasonTicket(ISeasonTicket seasonTicket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deregisterSeasonTicket(ISeasonTicket seasonTicket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean isSeasonTicketValid(String ticketId) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isSeasonTicketInUse(String ticketId) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void recordSeasonTicketEntry(String ticketId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void recordSeasonTicketExit(String ticketId) {
		// TODO Auto-generated method stub
		
	}

	
	

}
