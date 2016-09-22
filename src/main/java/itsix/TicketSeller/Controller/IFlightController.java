package itsix.TicketSeller.Controller;

import java.util.List;

import itisx.TicketSeller.View.Interface.IFlightView;
import itisx.TicketSeller.View.Interface.IListOfFlightsView;

public interface IFlightController {

	void searchFlights();

	List<String> getMakeListTo();

	List<String> getMakeListFrom();

	void setFlightView(IFlightView flightView);

	void setListOfFlightsView(IListOfFlightsView listOfFlightsView);

	void refreshView();

	void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller);

	void setRepetitiveFlightController(IRepetitiveFlightController repetitiveFlightController);

}
