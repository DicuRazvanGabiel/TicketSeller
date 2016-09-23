package itsix.TicketSeller.Controller;

import javax.swing.JSpinner;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.View.Interface.IListOfFlightsView;
import itisx.TicketSeller.View.Interface.INumberOfSeatsView;

public class NumberOfSeatsController implements INumberOfSeatsController{

	private IListOfFlightsView listOfFlightsView;
	
	private INumberOfSeatsView numberOfSeatsView;
	
	public NumberOfSeatsController (IListOfFlightsView listOfFlightsView) {
		this.listOfFlightsView = listOfFlightsView;
	}

	@Override
	public void setNumberOfSeatsView(INumberOfSeatsView numberOfSeatsView) {
		this.numberOfSeatsView = numberOfSeatsView;
		
	}

	@Override
	public void makeVisible(IFlightWithEscale flight) {
		numberOfSeatsView.makeVisible(flight);
		
	}

	@Override
	public void updateView(IFlightWithEscale flight, JSpinner numberOfSeatsSpinner,
			JSpinner numberOfSeatsChildrenSpinner) {
		numberOfSeatsView.setTotalPrice(calculateTotalPrice(flight,numberOfSeatsSpinner,numberOfSeatsChildrenSpinner));
		numberOfSeatsView.setSeatsAvalabel(calculateSeatsAvalebal(flight,numberOfSeatsSpinner,numberOfSeatsChildrenSpinner));
		
	}
	

	private Integer calculateSeatsAvalebal(IFlightWithEscale flight, JSpinner numberOfSeatsSpinner,
			JSpinner numberOfSeatsChildrenSpinner) {
		return flight.getNumberOfSeats() - ((Integer)numberOfSeatsSpinner.getValue() + (Integer)numberOfSeatsChildrenSpinner.getValue());
	}

	private Double calculateTotalPrice(IFlightWithEscale flight, JSpinner numberOfSeatsAdult, JSpinner numberOfSeatsChildren){
		return flight.getPriceAdult()*(Integer)numberOfSeatsAdult.getValue() + flight.getPriceChildren()*(Integer)numberOfSeatsChildren.getValue();	
	}

}
