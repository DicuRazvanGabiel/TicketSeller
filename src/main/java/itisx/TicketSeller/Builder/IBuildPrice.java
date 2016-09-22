package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.IPrice;

public interface IBuildPrice {

	IPrice price(Double adultPrice, Double childrenPrice);

}
