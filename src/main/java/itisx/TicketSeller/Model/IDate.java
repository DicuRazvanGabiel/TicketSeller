package itisx.TicketSeller.Model;

import java.io.Serializable;

public interface IDate extends Serializable{

	boolean isTheSame(IDate date);

	boolean isTheSame(Integer day, Integer month, Integer year);


}
