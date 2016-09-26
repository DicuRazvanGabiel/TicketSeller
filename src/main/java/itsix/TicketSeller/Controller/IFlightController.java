package itsix.TicketSeller.Controller;

import java.io.Serializable;
import java.util.List;

import itisx.TicketSeller.Model.RepositorySerializator;
import itisx.TicketSeller.View.Interface.IFlightView;
import itisx.TicketSeller.View.Interface.IListOfFlightsView;

public interface IFlightController extends Serializable{

	void searchFlights();

	List<String> getMakeListTo();

	List<String> getMakeListFrom();

	void setFlightView(IFlightView flightView);

	void setListOfFlightsView(IListOfFlightsView listOfFlightsView);

	void refreshView();

	void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller);

	void setRepetitiveFlightController(IRepetitiveFlightController repetitiveFlightController);

	void serialize();

	void setRepositorySerializator(RepositorySerializator repositorySerializator);

}
