package itisx.TicketSeller.Builder;

import java.util.List;

import itisx.TicketSeller.Model.Flight;
import itisx.TicketSeller.Model.IDate;
import itisx.TicketSeller.Model.IPrice;
import itisx.TicketSeller.Model.ITicket;

public interface IBuildFlight {

	Flight normalFlight(String from, String to, IDate makeDate, List<ITicket> tickets, Integer seatsNumber,
			IPrice makePrice);

}
