package itisx.TicketSeller.Builder;

import java.io.Serializable;

import itisx.TicketSeller.Model.IPrice;

public interface IBuildPrice extends Serializable{

	IPrice price(Double adultPrice, Double childrenPrice);

}
