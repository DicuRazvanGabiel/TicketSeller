package itisx.TicketSeller.Model;

import java.util.List;

public class Flight implements IFlight {

	private String from;

	private String to;

	private IDate date;

	private List<ITicket> tickets;

	private Integer numberOfSeats;
	
	private IPrice price;

	public Flight(String from, String to, IDate date, List<ITicket> listOfTickets, Integer numberOfSeats, IPrice price) {
		this.from = from;
		this.to = to;
		this.date = date;
		this.tickets = listOfTickets;
		this.numberOfSeats = numberOfSeats;
		this.price = price;
	}

	@Override
	public boolean isFlying(String from, String to, IDate date) {
		if (this.from == from && this.to == to && this.date.isTheSame(date)) {
			return true;

		}
		return false;
	}

	@Override
	public String getFrom() {
		return from;
	}

	@Override
	public String getTo() {
		return to;
	}

	@Override
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	@Override
	public void buyTicket(IPerson person) {
		numberOfSeats--;
		tickets.get(numberOfSeats).registPerson(person);
		
	}

	@Override
	public boolean isSeatVelabel() {
		return numberOfSeats > 0;
	}

	@Override
	public IDate getDate() {
		return date;
	}


	@Override
	public Double getPriceChildren() {
		return price.getPriceChildren();
	}

	@Override
	public Double getPriceAdult() {
		return price.getPriceAdult();
	}

	@Override
	public String toString() {
		return "From " + from + " To " + to + " numberOfSeats "
				+ numberOfSeats;
	}
}
