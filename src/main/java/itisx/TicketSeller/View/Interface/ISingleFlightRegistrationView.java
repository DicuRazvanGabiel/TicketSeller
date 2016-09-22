package itisx.TicketSeller.View.Interface;

import itsix.TicketSeller.Controller.ISingleFlightController;

public interface ISingleFlightRegistrationView {

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
