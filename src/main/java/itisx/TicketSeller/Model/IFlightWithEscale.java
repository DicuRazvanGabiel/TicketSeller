package itisx.TicketSeller.Model;

import java.io.Serializable;

public interface IFlightWithEscale extends Serializable {

	void addFlight(IFlight flightFrom);

	Integer getNumberOfSeats();

	void buyTicket(IPerson person);

	Double getPriceChildren();

	Double getPriceAdult();

}
