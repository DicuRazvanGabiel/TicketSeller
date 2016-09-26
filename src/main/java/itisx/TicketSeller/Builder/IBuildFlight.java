package itisx.TicketSeller.Builder;

import java.io.Serializable;
import java.util.List;

import itisx.TicketSeller.Model.Flight;
import itisx.TicketSeller.Model.IDate;
import itisx.TicketSeller.Model.IPrice;
import itisx.TicketSeller.Model.ITicket;
import itisx.TicketSeller.Model.WeeklyDate;

public interface IBuildFlight extends Serializable{

	Flight normalFlight(String from, String to, IDate makeDate, List<ITicket> tickets, Integer seatsNumber,
			IPrice makePrice);

	Flight weeklyFlight(String from, String to, IDate makeDate, List<ITicket> tickets, Integer seatsNumber,
			IPrice makePrice);

}
