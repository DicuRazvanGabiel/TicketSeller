package itisx.TicketSeller.View.Interface;

import java.io.Serializable;

import itsix.TicketSeller.Controller.ISingleFlightController;

public interface ISingleFlightRegistrationView extends Serializable{

	void setViseble(boolean b);

	void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller);

	String getTo();

	String getFrom();

	Double getAdultPrice();

	Double getChildrenPrice();

	Integer getDay();

	Integer getMonth();

	Integer getYear();

	
}
