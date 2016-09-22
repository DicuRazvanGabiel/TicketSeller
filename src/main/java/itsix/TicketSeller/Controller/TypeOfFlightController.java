package itsix.TicketSeller.Controller;

import itisx.TicketSeller.View.Interface.IFlightView;
import itisx.TicketSeller.View.Interface.ITypeOfFlightView;

public class TypeOfFlightController implements ITypeOfFlightController {

	private  ITypeOfFlightView typeOfFlightView ;
	private IFlightView flightView;

	public TypeOfFlightController(IFlightView flightView, ITypeOfFlightView typeOfFlightView) {
		this.flightView = flightView;
		this.typeOfFlightView = typeOfFlightView;
	}

	@Override
	public void setViseble(boolean b) {
		typeOfFlightView.setViseble(b);

	}

}
