package itsix.TicketSeller.Controller;

import itisx.TicketSeller.Builder.IBuildPerson;
import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.Model.IPerson;
import itisx.TicketSeller.Model.Person;
import itisx.TicketSeller.View.Interface.IPersonRegistrationView;

public class PersonRegistrationController implements IPersonRegistrationController {

	private IPersonRegistrationView personRegistrationView;

	private IFlightWithEscale flight;

	private INumberOfSeatsController numberOfSeatsController;

	private Integer numberOfSeats;

	private IBuildPerson buildPerson;

	public PersonRegistrationController(INumberOfSeatsController numberOfSeatsController) {
		this.numberOfSeatsController = numberOfSeatsController;
	}

	@Override
	public void setPerson() {
		IPerson person = buildPerson.person();
		person.setFirstName(personRegistrationView.getTxtFirstName());
		person.setLastName(personRegistrationView.getTxtLastName());
		person.setSocialSecurityNumber(personRegistrationView.getTxtSocialSecurityNumber());
		person.setIdentityCard(personRegistrationView.getTxtIdentityCard());
		person.setNationality(personRegistrationView.getTxtNationality());
		person.setCountry(personRegistrationView.getTxtCountry());
		person.setAddress(personRegistrationView.getTxtAddress());
		personRegistrationView.setVesibleTo(false);
		buyTicket(person);
		numberOfSeats--;
		if (numberOfSeats > 0) {
			personRegistrationView.clear();
			showMakePersonGUI();
		} 
	}

	

	@Override
	public void setPersonRegistrationView(IPersonRegistrationView personRegistrationView) {
		this.personRegistrationView = personRegistrationView;

	}

	private void showMakePersonGUI() {
		personRegistrationView.makeVesible();

	}

	@Override
	public void regisPerson(IFlightWithEscale flight, Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
		this.flight = flight;
		showMakePersonGUI();

	}

	@Override
	public void buyTicket(IPerson person) {
		flight.buyTicket(person);

	}

	@Override
	public void setBuildPerson(IBuildPerson buildPerson) {
		this.buildPerson = buildPerson;
	}

}
