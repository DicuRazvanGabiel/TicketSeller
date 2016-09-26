package itisx.TicketSeller.View.Interface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itsix.TicketSeller.Controller.IFlightController;
import itsix.TicketSeller.Controller.INumberOfSeatsController;

public interface IListOfFlightsView extends Serializable{

	void setFlightController(IFlightController flightController);

	void makeVisible(List<IFlightWithEscale> flights);

	void setNumberOfSeatsController(INumberOfSeatsController numberOfSeatsController);
}
