package itsix.TicketSeller.Controller;

import java.util.ArrayList;
import java.util.List;

import itisx.TicketSeller.Builder.IBuildFlight;
import itisx.TicketSeller.Builder.IBuildPerson;
import itisx.TicketSeller.Builder.IBuildPrice;
import itisx.TicketSeller.Builder.IBuildTicket;
import itisx.TicketSeller.Builder.IBuildWeeklyDate;
import itisx.TicketSeller.Model.IDate;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.Model.IPrice;
import itisx.TicketSeller.Model.ITicket;
import itisx.TicketSeller.Model.WeeklyDate;
import itisx.TicketSeller.View.Interface.IRepetitiveFlightView;
import itisx.TicketSeller.View.Interface.ITicketRegistView;
import itisx.TicketSeller.View.Interface.ITypeOfFlightView;

public class RepetitiveFlightController implements IRepetitiveFlightController {

	private IRepetitiveFlightView repetitiveFlightView;
	
	private ITypeOfFlightView typeOfFlightView;
	
	private String[] dayOfWeek = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

	private IFlightRepository flightRepository;

	private IBuildFlight buildFlight;

	private IBuildWeeklyDate buildWeeklyDate;
	
	private IBuildPrice buildPrice;

	private ITicketRegistView ticketRegistView;

	private IBuildTicket buildTicket;

	private List<ITicket> tickets = new ArrayList();

	private Integer seatsNumberAux;

	private Integer numberOfseats;

	private Integer seatsNumber;

	private IBuildTicket buidTicket;

	public RepetitiveFlightController(ITypeOfFlightView typeOfFlightView) {
		this.typeOfFlightView = typeOfFlightView;
	}

	@Override
	public void registFlight() {
		flightRepository.add(buildFlight.weeklyFlight(repetitiveFlightView.getFrom(), repetitiveFlightView.getTo(),makeDate(), tickets, seatsNumber,makePrice()));

	}

	private IDate makeDate() {
		Integer aux = null;
		for (int i = 0; i < dayOfWeek.length; i++) {
			if(dayOfWeek[i] == repetitiveFlightView.getDayOfWeek()){
				aux = i;
				break;
			}
		}
		return buildWeeklyDate.date(aux);
	}

	private IPrice makePrice() {
		
		return buildPrice.price(repetitiveFlightView.getAdultPrice(), repetitiveFlightView.getChildrenPrice());
	}


	@Override
	public void setVisible(boolean b) {
		repetitiveFlightView.setVisible(b);
	}

	@Override
	public String[] getDayOfWeek() {
		return dayOfWeek;
	}

	@Override
	public void setRepetitiveFlightView(IRepetitiveFlightView repetitiveFlightView) {
		this.repetitiveFlightView = repetitiveFlightView;
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
	public void setBuidTicket(IBuildTicket buidTicket) {
		this.buidTicket = buidTicket;
	}

}
