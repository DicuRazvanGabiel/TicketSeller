package itisx.TicketSeller.View.Interface;

import java.io.Serializable;

import itsix.TicketSeller.Controller.IRepetitiveFlightController;
import itsix.TicketSeller.Controller.ISingleFlightController;
import itsix.TicketSeller.Controller.ITypeOfFlightController;

public interface ITypeOfFlightView extends Serializable{

	void setViseble(boolean b);

	void setTypeOfFlightController(ITypeOfFlightController typeOfFlightController);

	void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller);

	void setRepetitiveFlightController(IRepetitiveFlightController repetitiveFlightController);

}
