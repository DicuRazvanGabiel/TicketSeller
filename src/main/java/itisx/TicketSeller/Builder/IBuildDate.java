package itisx.TicketSeller.Builder;

import java.io.Serializable;

import itisx.TicketSeller.Model.IDate;

public interface IBuildDate extends Serializable{

	IDate date(Integer day, Integer month, Integer year);

}
