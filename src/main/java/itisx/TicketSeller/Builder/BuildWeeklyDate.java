package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.IDate;
import itisx.TicketSeller.Model.WeeklyDate;
import itsix.TicketSeller.Controller.IRepetitiveFlightController;

public class BuildWeeklyDate implements IBuildWeeklyDate {

	@Override
	public IDate date(Integer aux) {
		return new WeeklyDate(aux);
	}

}
