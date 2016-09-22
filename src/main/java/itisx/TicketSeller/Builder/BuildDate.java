package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.Date;
import itisx.TicketSeller.Model.IDate;
import itsix.TicketSeller.Controller.ISingleFlightController;

public class BuildDate implements IBuildDate {

	private ISingleFlightController singleFlightController;

	public BuildDate(ISingleFlightController singleFlightController) {
		this.singleFlightController = singleFlightController;
	}

	@Override
	public IDate date(Integer day, Integer month, Integer year) {
		return new Date(day,month,year);
	}

}
