package itsix.TicketSeller.Controller;

import java.io.Serializable;

import javax.swing.JSpinner;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.View.Interface.INumberOfSeatsView;

public interface INumberOfSeatsController extends Serializable{

	void setNumberOfSeatsView(INumberOfSeatsView numberOfSeatsView);

	void makeVisible(IFlightWithEscale iFlight);

	void updateView(IFlightWithEscale flight, JSpinner numberOfSeatsSpinner, JSpinner numberOfSeatsChildrenSpinner);

}
