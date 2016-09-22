package itisx.TicketSeller.Model;

public interface IFlight {

	boolean isFlying(String from, String to, IDate date);

	void buyTicket(IPerson person);

	String getFrom();

	String getTo();

	Integer getNumberOfSeats();

	boolean isSeatVelabel();

	IDate getDate();


	Double getPriceChildren();

	Double getPriceAdult();

}
