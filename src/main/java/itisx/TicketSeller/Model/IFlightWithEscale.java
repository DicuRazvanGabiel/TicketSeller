package itisx.TicketSeller.Model;

public interface IFlightWithEscale {

	void addFlight(IFlight flightFrom);

	Integer getNumberOfSeats();

	void buyTicket(IPerson person);

	Double getPriceChildren();

	Double getPriceAdult();

}
