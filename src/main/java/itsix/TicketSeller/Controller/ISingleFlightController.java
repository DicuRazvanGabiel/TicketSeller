package itsix.TicketSeller.Controller;

import itisx.TicketSeller.Builder.IBuildDate;
import itisx.TicketSeller.Builder.IBuildFlight;
import itisx.TicketSeller.Builder.IBuildPrice;
import itisx.TicketSeller.Builder.IBuildTicket;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.View.Interface.ITicketRegistView;

public interface ISingleFlightController {

	void setViseble(boolean b);

	void getTicket(Integer integer);

	void setTicketRegistView(ITicketRegistView ticketRegistView);

	void makeTicket();

	void makeFlight();

	void setFlightRepository(IFlightRepository flightRepository);

	void refreshFlightView();

	void setFlightController(IFlightController flightController);

	void setBuildFlight(IBuildFlight buildFlight);

	void setBuildPrice(IBuildPrice buildPrice);

	void setBuildTicket(IBuildTicket buidTicket);

	void setBuildDate(IBuildDate buildDate);

}
