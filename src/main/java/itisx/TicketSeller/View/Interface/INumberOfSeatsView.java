package itisx.TicketSeller.View.Interface;

import java.io.Serializable;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itsix.TicketSeller.Controller.IPersonRegistrationController;

public interface INumberOfSeatsView extends Serializable{

	void makeVisible(IFlightWithEscale flight);

	void setPersonRegistrationController(IPersonRegistrationController personRegistrationController);

	void setTotalPrice(Double calculateTotalPrice);

	void setSeatsAvalabel(Integer calculateSeatsAvalebal);


}
