package itisx.TicketSeller.Model;

import java.awt.Container;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import itisx.TicketSeller.View.ListOfFlightView;
import itsix.TicketSeller.Controller.ISingleFlightController;

public class FlightRepository implements IFlightRepository, java.io.Serializable {

	private List<IFlight> listOfFlisght = new ArrayList<>();

	List<ITicket> listOfticket = new ArrayList();

	private ISingleFlightController singleFlightcontroller;

	private IFlight f1 = new Flight("Oslo", "Moscova", new Date(1, 1, 2016), listOfticket, 5, new Price(2.5, 5.0));
	private IFlight f12 = new Flight("Ankara", "Roma", new Date(1, 1, 2016), listOfticket, 4, new Price(2.5, 5.0));
	private IFlight f13 = new Flight("Viena", "Roma", new Date(1, 1, 2016), listOfticket, 2, new Price(2.5, 5.0));
	private IFlight f14 = new Flight("Roma", "Moscova", new Date(1, 1, 2016), listOfticket, 5, new Price(2.5, 5.0));
	private IFlight f2 = new Flight("Roma", "Bucuresti", new Date(1, 1, 2016), listOfticket, 5, new Price(2.5, 5.0));
	private IFlight f3 = new Flight("Bucuresti", "Atena", new Date(1, 1, 2016), listOfticket, 5, new Price(2.5, 5.0));
	private IFlight f4 = new Flight("Oslo", "Viena", new Date(8, 9, 2016), listOfticket, 5, new Price(2.5, 5.0));
	private IFlight f5 = new Flight("Viena", "Paris", new Date(3, 2, 2018), listOfticket, 5, new Price(2.5, 5.0));
	private IFlight f6 = new Flight("Oslo", "Viena", new Date(15, 8, 2020), listOfticket, 5, new Price(2.5, 5.0));
	private IFlight f7 = new Flight("Praga", "Moscova", new Date(6, 5, 2017), listOfticket, 5, new Price(2.5, 5.0));

	public FlightRepository() {
		listOfticket.add(new Ticket("1a"));
		listOfticket.add(new Ticket("1b"));
		listOfticket.add(new Ticket("1c"));
		listOfticket.add(new Ticket("1d"));
		listOfticket.add(new Ticket("1e"));

		listOfFlisght.add(f1);
		listOfFlisght.add(f12);
		listOfFlisght.add(f13);
		listOfFlisght.add(f14);
		listOfFlisght.add(f2);
		listOfFlisght.add(f3);
		listOfFlisght.add(f4);
		listOfFlisght.add(f5);
		listOfFlisght.add(f6);
		listOfFlisght.add(f7);

	}

	@Override
	public List<String> makeListFrom() {
		List<String> listFrom = new ArrayList();
		Set<String> set = new HashSet<String>();
		for (IFlight flight : listOfFlisght) {
			set.add(flight.getFrom());
		}
		for (String string : set) {
			listFrom.add(string);
		}

		return listFrom;
	}

	@Override
	public List<String> makeListTo() {
		List<String> listTo = new ArrayList();
		Set<String> set = new HashSet<String>();
		for (IFlight flight : listOfFlisght) {
			set.add(flight.getTo());
		}
		for (String string : set) {
			listTo.add(string);
		}
		return listTo;
	}

	@Override
	public List<IFlightWithEscale> searchForFlights(String from, String to, IDate date) {
		List<IFlight> flightsEqualsFrom = new ArrayList();
		List<IFlight> flightsEqualsTo = new ArrayList();
		List<IFlightWithEscale> listOfAvalabelFlights = new ArrayList();

		for (IFlight flight : listOfFlisght) {
			if (flight.getFrom() == from && flight.isSeatVelabel() && date.isTheSame(flight.getDate())) {
				flightsEqualsFrom.add(flight);
			}
		}

		for (IFlight flight : listOfFlisght) {
			if (flight.getTo() == to && flight.isSeatVelabel() && date.isTheSame(flight.getDate())) {
				flightsEqualsTo.add(flight);
			}
		}

		for (IFlight flightFrom : flightsEqualsFrom) {
			for (IFlight flightTo : flightsEqualsTo) {
				if (flightFrom.getTo() == flightTo.getFrom()
						|| (flightFrom.getFrom() == flightTo.getFrom() && flightFrom.getTo() == flightTo.getTo())) {
					ArrayList<IFlight> auxList = new ArrayList();
					IFlightWithEscale auxFlightWithEscale = new FlightWithEscale();
					auxFlightWithEscale.addFlight(flightTo);
					auxFlightWithEscale.addFlight(flightFrom);
					listOfAvalabelFlights.add(auxFlightWithEscale);
				}
			}
		}

		return listOfAvalabelFlights;
	}

	@Override
	public void add(Flight flight) {
		listOfFlisght.add(flight);
	}

	@Override
	public void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller) {
		this.singleFlightcontroller = singleFlightcontroller;
	}

}
