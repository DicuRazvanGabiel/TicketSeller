package itisx.TicketSeller.Model;

public class Price implements IPrice{
	
	Double priceChildren;
	
	Double priceAdult;
	
	

	public Price(Double priceChildren, Double priceAdult) {
		this.priceChildren = priceChildren;
		this.priceAdult = priceAdult;
	}

	@Override
	public Double getPriceChildren() {
		return priceChildren;
	}

	@Override
	public Double getPriceAdult() {
		return priceAdult;
	}

}
