package itisx.TicketSeller.View.Interface;

import java.io.Serializable;

import itisx.TicketSeller.Model.IDate;
import itsix.TicketSeller.Controller.IFlightController;
import itsix.TicketSeller.Controller.ITypeOfFlightController;

public interface IFlightView extends Serializable{

	String getFrom();

	String getTo();

	IDate getDate();
	
	void setFlightController(IFlightController flightController);

	void setTypeOfFlightController(ITypeOfFlightController typeOfFlightController);

	void refresh();

}
