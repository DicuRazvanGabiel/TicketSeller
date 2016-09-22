package itisx.TicketSeller.Model;

public class Date implements IDate {

	private Integer day;

	private Integer month;

	private Integer year;

	public Date(Integer day, Integer month, Integer year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean isTheSame(IDate date) {
		return date.isTheSame(day, month, year);
	}

	@Override
	public boolean isTheSame(Integer day, Integer month, Integer year) {
		return this.day.equals(day) && this.month.equals(month) && this.year.equals(year);
	}

}
