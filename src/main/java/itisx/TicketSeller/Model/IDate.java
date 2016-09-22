package itisx.TicketSeller.Model;

public interface IDate {

	boolean isTheSame(IDate date);

	boolean isTheSame(Integer day, Integer month, Integer year);


}
