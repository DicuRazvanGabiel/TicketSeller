package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.ITicket;

public interface IBuildTicket {

	ITicket ticket(String seat);

}
