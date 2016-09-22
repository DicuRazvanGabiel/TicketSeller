package itisx.TicketSeller.Model;

public class Person implements IPerson {

	private String firstName;

	private String lastName;

	private String socialSecurityNumber;

	private String identityCard;

	private String nationality;

	private String country;

	private String address;

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	@Override
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

}
