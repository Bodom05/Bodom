package bcccp.carpark.paystation;

import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.IAdhocTicket;

public class PaystationController 
		implements IPaystationController {
	
	private IPaystationUI ui;	
	private ICarpark carpark;

	private IAdhocTicket  adhocTicket = null;
	private float charge;
	
	

	public PaystationController(ICarpark carpark, IPaystationUI ui) {
		//TODO Implement constructor
            this.carpark = carpark;
            this.ui = ui;
	}



	@Override
	public void ticketInserted(String barcode) {
            System.out.println("The ticked was inserted with barcode : "+ barcode);
		
	}



	@Override
	public void ticketPaid() {
		System.out.println("The price for the ticked is paid.");
	}



	@Override
	public void ticketTaken() {
		System.out.println("The ticked has been taken.");
	}

	
	
}
