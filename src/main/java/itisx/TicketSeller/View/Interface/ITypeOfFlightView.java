package itisx.TicketSeller.View.Interface;

import itsix.TicketSeller.Controller.ISingleFlightController;
import itsix.TicketSeller.Controller.ITypeOfFlightController;

public interface ITypeOfFlightView {

	void setViseble(boolean b);

	void setTypeOfFlightController(ITypeOfFlightController typeOfFlightController);

	void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller);

}
