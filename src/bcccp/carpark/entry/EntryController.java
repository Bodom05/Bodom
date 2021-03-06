package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class EntryController 
		implements ICarSensorResponder,
				   ICarparkObserver,
		           IEntryController {
	
	private IGate entryGate;
	private ICarSensor outsideSensor; 
	private ICarSensor insideSensor;
	private IEntryUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long entryTime;
	private String seasonTicketId = null;
	
	

	public EntryController(Carpark carpark, IGate entryGate, 
			ICarSensor os, 
			ICarSensor is,
			IEntryUI ui) {
            this.carpark = carpark;
            this.entryGate =entryGate;
            this.outsideSensor = os;
            this.insideSensor = is;
            this.ui = ui;
	}



	@Override
	public void buttonPushed() {
		    System.out.println("The button has been pushed for the car to pass.");
	}



	@Override
	public void ticketInserted(String barcode) {
            System.out.println("The ticket of barcode " + barcode+ " has been inserted.");
            
		
	}



	@Override
	public void ticketTaken() {
                System.out.println("The ticket has been taken.");
		
	}



	@Override
	public void notifyCarparkEvent() {
                System.out.println("The car has been successfully parked.");
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		System.out.println("The detector with detector ID "+detectorId+" has detected the car: "+ detected);
	}

	
	
}
