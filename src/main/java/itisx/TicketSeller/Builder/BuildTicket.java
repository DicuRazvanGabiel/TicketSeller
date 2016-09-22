package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.ITicket;
import itisx.TicketSeller.Model.Ticket;
import itsix.TicketSeller.Controller.ISingleFlightController;

public class BuildTicket implements IBuildTicket {

	private ISingleFlightController singleFlightcontroller;

	public BuildTicket(ISingleFlightController singleFlightcontroller) {
		this.singleFlightcontroller = singleFlightcontroller;
	}

	@Override
	public ITicket ticket(String seat) {
		return new Ticket(seat);
	}

}
