package itsix.TicketSeller.Controller;

import java.io.Serializable;
import java.util.List;

import itisx.TicketSeller.Builder.IBuildFlight;
import itisx.TicketSeller.Builder.IBuildPrice;
import itisx.TicketSeller.Builder.IBuildTicket;
import itisx.TicketSeller.Builder.IBuildWeeklyDate;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.Model.ITicket;
import itisx.TicketSeller.View.Interface.IRepetitiveFlightView;
import itisx.TicketSeller.View.Interface.ITicketRegistView;

public interface IRepetitiveFlightController extends Serializable{

	void registFlight();

	void setVisible(boolean b);

	String[] getDayOfWeek();

	void setRepetitiveFlightView(IRepetitiveFlightView repetitiveFlightView);

	void getTicket(Integer value);

	void makeTicket();

	void setTicketRegistView(ITicketRegistView ticketRegistView);

	void setBuidTicket(IBuildTicket buidTicket);

	void setBuildWeklyDate(IBuildWeeklyDate buildWeklyDate);

	void setFlightRepository(IFlightRepository flightRepository);

	void setFlightController(IFlightController flightController);

	void setBuildPrice(IBuildPrice buildPrice);

	void setBuildFlight(IBuildFlight buildFlight);

}
