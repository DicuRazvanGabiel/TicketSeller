package itisx.TicketSeller.Model;

import java.io.Serializable;

public interface IPerson extends Serializable{

	void setFirstName(String firstName);

	void setLastName(String lastName);

	void setSocialSecurityNumber(String socialSecurityNumber);

	void setIdentityCard(String identityCard);

	void setNationality(String nationality);

	void setCountry(String country);

	void setAddress(String address);

}
