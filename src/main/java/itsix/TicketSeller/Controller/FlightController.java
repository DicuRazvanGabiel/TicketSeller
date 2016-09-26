package itsix.TicketSeller.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import itisx.TicketSeller.Model.IDate;
import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.Model.RepositorySerializator;
import itisx.TicketSeller.View.ListOfFlightView;
import itisx.TicketSeller.View.Interface.IFlightView;
import itisx.TicketSeller.View.Interface.IListOfFlightsView;

public class FlightController implements IFlightController {

	private IFlightView flightView;

	private IFlightRepository flightRepository;

	private IListOfFlightsView listOfFlightsView;

	private ISingleFlightController singleFlightcontroller;

	private IRepetitiveFlightController repetitiveFlightController;

	private RepositorySerializator repositorySerializator;

	public FlightController(IFlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	@Override
	public void searchFlights() {
		String from = flightView.getFrom();
		String to = flightView.getTo();
		IDate date = flightView.getDate();

		List<IFlightWithEscale> flights = flightRepository.searchForFlights(from, to, date);

		if (flights.isEmpty()) {
			JOptionPane.showMessageDialog(new JFrame(), "Flight not found", "Dialog", JOptionPane.ERROR_MESSAGE);
		} else {
			listOfFlightsView.makeVisible(flights);
		}

	}

	@Override
	public List<String> getMakeListTo() {
		return flightRepository.makeListTo();
	}

	@Override
	public List<String> getMakeListFrom() {
		return flightRepository.makeListFrom();
	}

	@Override
	public void setFlightView(IFlightView flightView) {
		this.flightView = flightView;

	}

	@Override
	public void setListOfFlightsView(IListOfFlightsView listOfFlightsView) {
		this.listOfFlightsView = listOfFlightsView;

	}

	@Override
	public void refreshView() {
		flightView.refresh();
		
	}

	@Override
	public void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller) {
		this.singleFlightcontroller = singleFlightcontroller;
	}

	@Override
	public void setRepetitiveFlightController(IRepetitiveFlightController repetitiveFlightController) {
		this.repetitiveFlightController = repetitiveFlightController;
	}

	@Override
	public void serialize() {
		try {
			repositorySerializator.serialize(flightRepository);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void setRepositorySerializator(RepositorySerializator repositorySerializator) {
		this.repositorySerializator = repositorySerializator;
		
	}

}
