package itsix.TicketSeller.Controller;

import itisx.TicketSeller.Builder.IBuildPerson;
import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.Model.IPerson;
import itisx.TicketSeller.View.Interface.IPersonRegistrationView;

public interface IPersonRegistrationController {

	void setPerson();

	void setPersonRegistrationView(IPersonRegistrationView personRegistrationView);


	void regisPerson(IFlightWithEscale flight, Integer value);

	void buyTicket(IPerson person);

	void setBuildPerson(IBuildPerson buildPerson);

}
