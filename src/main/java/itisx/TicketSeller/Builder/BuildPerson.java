package itisx.TicketSeller.Builder;

import itisx.TicketSeller.Model.IPerson;
import itisx.TicketSeller.Model.Person;
import itsix.TicketSeller.Controller.IPersonRegistrationController;

public class BuildPerson implements IBuildPerson {

	private IPersonRegistrationController personRegistrationController;

	public BuildPerson(IPersonRegistrationController personRegistrationController) {
		this.personRegistrationController = personRegistrationController;
	}

	@Override
	public IPerson person() {
		return new Person();
	}

}
