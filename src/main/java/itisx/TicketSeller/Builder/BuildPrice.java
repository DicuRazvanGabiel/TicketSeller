package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.IPrice;
import itisx.TicketSeller.Model.Price;
import itsix.TicketSeller.Controller.ISingleFlightController;

public class BuildPrice implements IBuildPrice {

	private ISingleFlightController singleFlightcontroller;

	public BuildPrice(ISingleFlightController singleFlightcontroller) {
		this.singleFlightcontroller = singleFlightcontroller;
	}

	@Override
	public IPrice price(Double adultPrice, Double childrenPrice) {
		return new Price(adultPrice,childrenPrice);
	}

}
