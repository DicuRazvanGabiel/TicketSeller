package itisx.TicketSeller.Model;

public class WeeklyDate implements IDate {

	private Integer dayOfFlight;

	public WeeklyDate(Integer aux) {
		dayOfFlight = aux;
	}

	@Override
	public boolean isTheSame(IDate date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTheSame(Integer day, Integer month, Integer year) {
		// TODO Auto-generated method stub
		return false;
	}

}
