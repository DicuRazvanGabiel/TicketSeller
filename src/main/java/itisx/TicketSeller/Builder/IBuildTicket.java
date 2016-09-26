package itisx.TicketSeller.Builder;

import java.io.Serializable;

import itisx.TicketSeller.Model.ITicket;
import itsix.TicketSeller.Controller.IRepetitiveFlightController;

public interface IBuildTicket extends Serializable{

	ITicket ticket(String seat);

	void setRepetitiveFlightController(IRepetitiveFlightController repetitiveFlightController);

}
