package itsix.TicketSeller.Controller;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.View.Interface.INumberOfSeatsView;

public interface INumberOfSeatsController {

	void setNumberOfSeatsView(INumberOfSeatsView numberOfSeatsView);

	void makeVisible(IFlightWithEscale iFlight);

}
