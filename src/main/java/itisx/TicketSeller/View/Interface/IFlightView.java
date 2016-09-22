package itisx.TicketSeller.View.Interface;

import itisx.TicketSeller.Model.IDate;
import itsix.TicketSeller.Controller.IFlightController;
import itsix.TicketSeller.Controller.ITypeOfFlightController;

public interface IFlightView {

	String getFrom();

	String getTo();

	IDate getDate();
	
	void setFlightController(IFlightController flightController);

	void setTypeOfFlightController(ITypeOfFlightController typeOfFlightController);

	void refresh();

}
