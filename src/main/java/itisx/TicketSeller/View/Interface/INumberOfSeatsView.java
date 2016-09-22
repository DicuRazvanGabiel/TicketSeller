package itisx.TicketSeller.View.Interface;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itsix.TicketSeller.Controller.IPersonRegistrationController;

public interface INumberOfSeatsView {

	void makeVisible(IFlightWithEscale flight);

	void setPersonRegistrationController(IPersonRegistrationController personRegistrationController);


}
