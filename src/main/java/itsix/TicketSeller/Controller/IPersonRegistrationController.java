package itsix.TicketSeller.Controller;

import java.io.Serializable;

import itisx.TicketSeller.Builder.IBuildPerson;
import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.Model.IPerson;
import itisx.TicketSeller.View.Interface.IPersonRegistrationView;

public interface IPersonRegistrationController extends Serializable{

	void setPerson();

	void setPersonRegistrationView(IPersonRegistrationView personRegistrationView);


	void regisPerson(IFlightWithEscale flight, Integer value);

	void buyTicket(IPerson person);

	void setBuildPerson(IBuildPerson buildPerson);

}
