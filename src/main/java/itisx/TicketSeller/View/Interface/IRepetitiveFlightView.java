package itisx.TicketSeller.View.Interface;

import java.io.Serializable;

public interface IRepetitiveFlightView extends Serializable{

	void setVisible(boolean b);

	Integer getNumberOfSeats();

	String getTo();

	String getFrom();

	String getDayOfWeek();

	Double getChildrenPrice();

	Double getAdultPrice();

}
