package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.ITicket;
import itsix.TicketSeller.Controller.IRepetitiveFlightController;

public interface IBuildTicket {

	ITicket ticket(String seat);

	void setRepetitiveFlightController(IRepetitiveFlightController repetitiveFlightController);

}
