package itisx.TicketSeller.View.Interface;

import itsix.TicketSeller.Controller.IPersonRegistrationController;

public interface IPersonRegistrationView {

	void makeVesible();

	void setPersonRegistrationController(IPersonRegistrationController personRegistrationController);

	void clear();

	void setVesibleTo(boolean b);

	String getTxtFirstName();

	String getTxtLastName();

	String getTxtSocialSecurityNumber();

	String getTxtIdentityCard();

	String getTxtNationality();

	String getTxtCountry();

	String getTxtAddress();

}
