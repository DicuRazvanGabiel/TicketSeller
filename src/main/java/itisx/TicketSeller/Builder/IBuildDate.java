package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.IDate;

public interface IBuildDate {

	IDate date(Integer day, Integer month, Integer year);

}
