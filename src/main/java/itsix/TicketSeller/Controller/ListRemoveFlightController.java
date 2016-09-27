package itsix.TicketSeller.Controller;

import java.util.List;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.View.Interface.IFlightView;
import itisx.TicketSeller.View.Interface.IListRemoveFlightView;

public class ListRemoveFlightController implements IListRemoveFlightController {

	private IListRemoveFlightView listRemoveFlightView;
	private IFlightRepository flightRepository;
	private IFlightView flightView;
	
	public ListRemoveFlightController(IFlightView flightView) {
		this.flightView = flightView;
	}

	@Override
	public void makeVisible() {
		listRemoveFlightView.makeVisible(true);
		
	}

	@Override
	public List<IFlight> getFlights() {
		return flightRepository.getFlights();
	}

	@Override
	public void removeFlight(IFlight selectedValue) {
		flightRepository.removeFlight(selectedValue);
		listRemoveFlightView.removeFlight(selectedValue);
		
	}

	@Override
	public void setListRemoveFlightView(IListRemoveFlightView listRemoveFlightView) {
		this.listRemoveFlightView = listRemoveFlightView;
	}

	@Override
	public void setFlightRepository(IFlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	@Override
	public void updateView() {
		flightView.refresh();
	}

}
