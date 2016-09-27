package itisx.TicketSeller.View.Interface;

import java.io.Serializable;

import itisx.TicketSeller.Model.IFlight;

public interface IListRemoveFlightView extends Serializable {

	void makeVisible(boolean b);

	void refresh();

	void removeFlight(IFlight selectedValue);

}
