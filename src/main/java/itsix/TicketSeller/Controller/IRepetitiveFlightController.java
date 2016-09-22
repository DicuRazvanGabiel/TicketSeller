package itsix.TicketSeller.Controller;

import java.util.List;

import itisx.TicketSeller.Builder.IBuildTicket;
import itisx.TicketSeller.Model.ITicket;
import itisx.TicketSeller.View.Interface.IRepetitiveFlightView;
import itisx.TicketSeller.View.Interface.ITicketRegistView;

public interface IRepetitiveFlightController {

	void registFlight();

	void setVisible(boolean b);

	String[] getDayOfWeek();

	void setRepetitiveFlightView(IRepetitiveFlightView repetitiveFlightView);

	void getTicket(Integer value);

	void makeTicket();

	void setTicketRegistView(ITicketRegistView ticketRegistView);

	void setBuidTicket(IBuildTicket buidTicket);

}
