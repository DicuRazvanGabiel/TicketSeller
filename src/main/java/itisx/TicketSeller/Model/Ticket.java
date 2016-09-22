package itisx.TicketSeller.Model;

public class Ticket implements ITicket {

	private IPerson person;

	private String seat;

	public Ticket(String seat) {
		this.seat = seat;
	}

	@Override
	public void registPerson(IPerson person) {
		this.person = person;
	}

}
