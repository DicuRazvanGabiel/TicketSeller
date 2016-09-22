package itsix.TicketSeller.Controller;

import java.util.ArrayList;
import java.util.List;

import itisx.TicketSeller.Builder.IBuildDate;
import itisx.TicketSeller.Builder.IBuildFlight;
import itisx.TicketSeller.Builder.IBuildPrice;
import itisx.TicketSeller.Builder.IBuildTicket;
import itisx.TicketSeller.Model.Date;
import itisx.TicketSeller.Model.Flight;
import itisx.TicketSeller.Model.IDate;
import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.Model.IPrice;
import itisx.TicketSeller.Model.ITicket;
import itisx.TicketSeller.Model.Price;
import itisx.TicketSeller.Model.Ticket;
import itisx.TicketSeller.View.Interface.ISingleFlightRegistrationView;
import itisx.TicketSeller.View.Interface.ITicketRegistView;

public class SingleFlightController implements ISingleFlightController {

	ISingleFlightRegistrationView singleFlightRegistrationView;

	private ITypeOfFlightController typeOfFlightController;

	private ITicketRegistView ticketRegistView;

	private Integer seatsNumberAux;

	private List<ITicket> tickets = new ArrayList();

	private IFlight flight;

	private Integer seatsNumber;

	private IFlightRepository flightRepository;

	private IFlightController flightController;

	private IBuildFlight buildFlight;

	private IBuildPrice buildPrice;

	private IBuildTicket buildTicket;

	private IBuildDate buildDate;

	public SingleFlightController(ISingleFlightRegistrationView singleFlightRegistrationView,
			ITypeOfFlightController typeOfFlightController) {
		this.singleFlightRegistrationView = singleFlightRegistrationView;
		this.typeOfFlightController = typeOfFlightController;
	}

	@Override
	public void setViseble(boolean b) {
		singleFlightRegistrationView.setViseble(b);
	}

	@Override
	public void getTicket(Integer numberOfseats) {
		seatsNumberAux = numberOfseats;
		seatsNumber = numberOfseats;
		tickets.clear();
		ticketRegistView.setVisible(true);
		ticketRegistView.setLabelSeats(seatsNumberAux);
	}

	@Override
	public void setTicketRegistView(ITicketRegistView ticketRegistView) {
		this.ticketRegistView = ticketRegistView;
	}

	@Override
	public void makeTicket() {
		ITicket ticket = buildTicket.ticket(ticketRegistView.getSeat());
		tickets.add(ticket);
		seatsNumberAux--;
		ticketRegistView.clear();
		ticketRegistView.setVisible(false);
		ticketRegistView.setLabelSeats(seatsNumberAux);
		if (seatsNumberAux > 0) {
			ticketRegistView.setLabelSeats(seatsNumberAux);
			ticketRegistView.clear();
			ticketRegistView.setVisible(true);
		}
	}

	@Override
	public void makeFlight() {
		flightRepository.add(buildFlight.normalFlight(singleFlightRegistrationView.getFrom(), singleFlightRegistrationView.getTo(),
				makeDate(), tickets, seatsNumber, makePrice()));
		
	}

	private IPrice makePrice() {
		IPrice price = buildPrice.price(singleFlightRegistrationView.getAdultPrice(),
				singleFlightRegistrationView.getChildrenPrice());
		return price;
	}

	private IDate makeDate() {
		IDate date = buildDate.date(singleFlightRegistrationView.getDay(), singleFlightRegistrationView.getMonth(),
				singleFlightRegistrationView.getYear());
		return date;
	}

	@Override
	public void setFlightRepository(IFlightRepository flightRepository) {
		this.flightRepository = flightRepository; 
	}

	@Override
	public void refreshFlightView() {
		flightController.refreshView();
		
	}

	@Override
	public void setFlightController(IFlightController flightController) {
		this.flightController = flightController;
	}

	@Override
	public void setBuildFlight(IBuildFlight buildFlight) {
		this.buildFlight = buildFlight;
		
	}

	@Override
	public void setBuildPrice(IBuildPrice buildPrice) {
		this.buildPrice = buildPrice;
		
	}

	@Override
	public void setBuildTicket(IBuildTicket buidTicket) {
		this.buildTicket = buidTicket;
		
	}

	@Override
	public void setBuildDate(IBuildDate buildDate) {
		this.buildDate = buildDate;
	}

}
