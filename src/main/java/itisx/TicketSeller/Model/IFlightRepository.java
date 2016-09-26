package itisx.TicketSeller.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import itsix.TicketSeller.Controller.ISingleFlightController;

public interface IFlightRepository extends Serializable {
	List<IFlightWithEscale> searchForFlights(String from, String to, IDate date);

	List<String> makeListFrom();

	List<String> makeListTo();

	void add(Flight flight);

	void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller);

}
