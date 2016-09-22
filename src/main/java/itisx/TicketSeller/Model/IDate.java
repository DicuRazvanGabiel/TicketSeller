package itisx.TicketSeller.Model;

public interface IDate {

	Integer getDay();
	
	Integer getMonth();
	
	Integer getYear();

	boolean isTheSame(IDate date);

	boolean isTheSame(Integer day, Integer month, Integer year);


}
