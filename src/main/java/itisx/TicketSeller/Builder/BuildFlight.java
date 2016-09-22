package itisx.TicketSeller.Builder;

import java.util.List;

import itisx.TicketSeller.Model.Flight;
import itisx.TicketSeller.Model.IDate;
import itisx.TicketSeller.Model.IPrice;
import itisx.TicketSeller.Model.ITicket;
import itisx.TicketSeller.Model.WeeklyDate;
import itsix.TicketSeller.Controller.ISingleFlightController;

public class BuildFlight implements IBuildFlight {

	private ISingleFlightController singleFlightcontroller;

	public BuildFlight(ISingleFlightController singleFlightcontroller) {
		this.singleFlightcontroller = singleFlightcontroller;
	}

	@Override
	public Flight normalFlight(String from, String to, IDate makeDate, List<ITicket> tickets, Integer seatsNumber,
			IPrice makePrice) {
		return new Flight(from,to,makeDate,tickets,seatsNumber,makePrice);
	}

	@Override
	public Flight weeklyFlight(String from, String to, IDate makeDate, List<ITicket> tickets, Integer numberOfSeats,
			IPrice price) {
		return new Flight(from,to,makeDate,tickets,numberOfSeats,price);
	}


}
