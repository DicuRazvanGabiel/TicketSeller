package itisx.TicketSeller.Builder;

import java.io.Serializable;

import itisx.TicketSeller.Model.IDate;

public interface IBuildWeeklyDate extends Serializable{

	IDate date(Integer aux);

}
