package itisx.TicketSeller.View.Interface;

public interface IRepetitiveFlightView {

	void setVisible(boolean b);

	Integer getNumberOfSeats();

	String getTo();

	String getFrom();

	String getDayOfWeek();

	Double getChildrenPrice();

	Double getAdultPrice();

}
