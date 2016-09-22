package itisx.TicketSeller.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightWithEscale implements IFlightWithEscale {
	private Set<IFlight> listOfFlightWithEscale = new HashSet<IFlight>();

	@Override
	public void addFlight(IFlight flight) {
		listOfFlightWithEscale.add(flight);
	}

	@Override
	public String toString() {
		String route = "";
		
		for (IFlight flight : listOfFlightWithEscale) {
			
			route = route + flight.getFrom() + " --> " + flight.getTo() + " Number of seats: "
					+ flight.getNumberOfSeats() +" | ";
		}
		return route;
	}

	@Override
	public Integer getNumberOfSeats() {
		Integer value = 0;
		for (IFlight flight : listOfFlightWithEscale) {
			value += flight.getNumberOfSeats();
		}
		return value;
	}

	@Override
	public void buyTicket(IPerson person) {
			for (IFlight flight : listOfFlightWithEscale) {
				flight.buyTicket(person);
		}

	}

	@Override
	public Double getPriceChildren() {
		Double price = 0.0;
		for (IFlight flight : listOfFlightWithEscale) {
			price += flight.getPriceChildren();
		}
		return price;
	}

	@Override
	public Double getPriceAdult() {
		Double price = 0.0;
		for (IFlight flight : listOfFlightWithEscale) {
			price += flight.getPriceAdult();
		}
		return price;
	}

}
