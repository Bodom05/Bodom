package bcccp.carpark.exit;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class ExitController 
		implements ICarSensorResponder,
		           IExitController {
	
	private IGate exitGate;
	private ICarSensor insideSensor;
	private ICarSensor outsideSensor; 
	private IExitUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long exitTime;
	private String seasonTicketId = null;
	
	

	public ExitController(Carpark carpark, IGate exitGate, 
			ICarSensor is,
			ICarSensor os, 
			IExitUI ui) {
		//TODO Implement constructor
	    ExitController controller = new ExitController();
            this.carpark = carpark;
            this.exitGate = exitGate;
            this.insideSensor = is;
            this.outsideSensor = os;
            this.ui = ui;
            
	}



	@Override
	public void ticketInserted(String ticketStr) {
		System.out.println("The ticket was inserted with the number: "+ticketStr);
	}



	@Override
	public void ticketTaken() {
		System.out.println("The ticket has been taken");
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		System.out.println("The car dectector with Id +"+detectorId +" has detected the car : "+ detected);
	}

	
	
}
