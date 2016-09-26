package itisx.TicketSeller.View.Interface;

import java.io.Serializable;

import itsix.TicketSeller.Controller.IRepetitiveFlightController;

public interface ITicketRegistView extends Serializable{

	void setVisible(boolean b);

	String getSeat();

	void clear();

	void setLabelSeats(Integer seatsNumber);

	void setRepetitiveFlightController(IRepetitiveFlightController repetitiveFlightController);

}
