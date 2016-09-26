package itsix.TicketSeller.Controller;

import java.io.Serializable;
import java.util.List;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.View.Interface.IListRemoveFlightView;

public interface IListRemoveFlightController extends Serializable{

	void makeVisible();

	List<IFlight> getFlights();

	void removeFlight(IFlight selectedValue);

	void setListRemoveFlightView(IListRemoveFlightView listRemoveFlightView);

	void setFlightRepository(IFlightRepository flightRepository);

	void updateView();

}
