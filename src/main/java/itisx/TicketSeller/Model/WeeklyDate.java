package itisx.TicketSeller.Model;

public class WeeklyDate implements IDate {

	private Integer dayOfFlight;

	public WeeklyDate(Integer aux) {
		dayOfFlight = aux;
	}

	@Override
	public boolean isTheSame(IDate date) {
		return true;
	}

	@Override
	public boolean isTheSame(Integer day, Integer month, Integer year) {
		Integer[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		if(month < 3)
	    year -= month;
	    return ( year + year/4 - year/100 + year/400 + t[month-1] + day) % 7 == dayOfFlight;
	}

}
