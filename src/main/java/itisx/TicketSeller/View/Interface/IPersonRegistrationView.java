package itisx.TicketSeller.View.Interface;

import java.io.Serializable;

import itsix.TicketSeller.Controller.IPersonRegistrationController;

public interface IPersonRegistrationView extends Serializable{

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
