package itisx.TicketSeller.View.Interface;

import itsix.TicketSeller.Controller.IRepetitiveFlightController;

public interface ITicketRegistView {

	void setVisible(boolean b);

	String getSeat();

	void clear();

	void setLabelSeats(Integer seatsNumber);

	void setRepetitiveFlightController(IRepetitiveFlightController repetitiveFlightController);

}
