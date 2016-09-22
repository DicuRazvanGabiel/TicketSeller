package itisx.TicketSeller;

import java.awt.EventQueue;

import itisx.TicketSeller.Builder.BuildDate;
import itisx.TicketSeller.Builder.BuildFlight;
import itisx.TicketSeller.Builder.BuildPerson;
import itisx.TicketSeller.Builder.BuildPrice;
import itisx.TicketSeller.Builder.BuildTicket;
import itisx.TicketSeller.Builder.IBuildDate;
import itisx.TicketSeller.Builder.IBuildFlight;
import itisx.TicketSeller.Builder.IBuildPerson;
import itisx.TicketSeller.Builder.IBuildPrice;
import itisx.TicketSeller.Builder.IBuildTicket;
import itisx.TicketSeller.Model.FlightRepository;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.View.FlightView;
import itisx.TicketSeller.View.ListOfFlightView;
import itisx.TicketSeller.View.NumberOfSeatsView;
import itisx.TicketSeller.View.PersonRegistrationView;
import itisx.TicketSeller.View.RepetitiveFlightView;
import itisx.TicketSeller.View.SingleFlightRegistrationView;
import itisx.TicketSeller.View.TicketRegistView;
import itisx.TicketSeller.View.TypeOfFlightView;
import itisx.TicketSeller.View.Interface.IFlightView;
import itisx.TicketSeller.View.Interface.IListOfFlightsView;
import itisx.TicketSeller.View.Interface.INumberOfSeatsView;
import itisx.TicketSeller.View.Interface.IPersonRegistrationView;
import itisx.TicketSeller.View.Interface.IRepetitiveFlightView;
import itisx.TicketSeller.View.Interface.ISingleFlightRegistrationView;
import itisx.TicketSeller.View.Interface.ITicketRegistView;
import itisx.TicketSeller.View.Interface.ITypeOfFlightView;
import itsix.TicketSeller.Controller.FlightController;
import itsix.TicketSeller.Controller.IFlightController;
import itsix.TicketSeller.Controller.INumberOfSeatsController;
import itsix.TicketSeller.Controller.IPersonRegistrationController;
import itsix.TicketSeller.Controller.IRepetitiveFlightController;
import itsix.TicketSeller.Controller.ISingleFlightController;
import itsix.TicketSeller.Controller.ITypeOfFlightController;
import itsix.TicketSeller.Controller.NumberOfSeatsController;
import itsix.TicketSeller.Controller.PersonRegistrationController;
import itsix.TicketSeller.Controller.RepetitiveFlightController;
import itsix.TicketSeller.Controller.SingleFlightController;
import itsix.TicketSeller.Controller.TypeOfFlightController;


public class App {
	public static void main(String[] args) {

		IFlightRepository flightRepository = new FlightRepository();
		IListOfFlightsView listOfFlightsView = new ListOfFlightView();
		IFlightController flightController = new FlightController(flightRepository);
		IFlightView flightView = new FlightView(flightController, flightController.getMakeListFrom(), flightController.getMakeListTo());
		flightController.setListOfFlightsView(listOfFlightsView);
		
		INumberOfSeatsController numberOfSeatsController = new NumberOfSeatsController(listOfFlightsView);
		INumberOfSeatsView  numberOfSeatsView = new NumberOfSeatsView(numberOfSeatsController);
		numberOfSeatsController.setNumberOfSeatsView(numberOfSeatsView);
		listOfFlightsView.setNumberOfSeatsController(numberOfSeatsController);
		
		IPersonRegistrationController personRegistrationController = new PersonRegistrationController(numberOfSeatsController);
		numberOfSeatsView.setPersonRegistrationController(personRegistrationController);
		IPersonRegistrationView personRegistrationView = new PersonRegistrationView(personRegistrationController);
		personRegistrationController.setPersonRegistrationView(personRegistrationView);
		
		ITypeOfFlightView typeOfFlightView = new TypeOfFlightView();
		ITypeOfFlightController typeOfFlightController = new TypeOfFlightController(flightView, typeOfFlightView );
		typeOfFlightView.setTypeOfFlightController(typeOfFlightController);
		flightView.setTypeOfFlightController(typeOfFlightController);
		
		ISingleFlightRegistrationView singleFlightRegistrationView = new SingleFlightRegistrationView();
		ISingleFlightController singleFlightController = new SingleFlightController(singleFlightRegistrationView,typeOfFlightController);
		singleFlightRegistrationView.setSingleFlightcontroller(singleFlightController);
		typeOfFlightView.setSingleFlightcontroller(singleFlightController);
		
		ITicketRegistView ticketRegistView = new TicketRegistView(singleFlightController);
		singleFlightController.setTicketRegistView(ticketRegistView);
		singleFlightController.setFlightRepository(flightRepository);
		flightRepository.setSingleFlightcontroller(singleFlightController);
		flightController.setSingleFlightcontroller(singleFlightController);
		singleFlightController.setFlightController(flightController);
		
		IBuildFlight buildFlight = new BuildFlight(singleFlightController);
		singleFlightController.setBuildFlight(buildFlight);
		IBuildPrice buildPrice = new BuildPrice(singleFlightController);
		singleFlightController.setBuildPrice(buildPrice);
		IBuildTicket buildTicket = new BuildTicket(singleFlightController);
		singleFlightController.setBuildTicket(buildTicket);
		IBuildDate buildDate = new BuildDate(singleFlightController);
		singleFlightController.setBuildDate(buildDate);
		IBuildPerson buildPerson = new BuildPerson(personRegistrationController);
		personRegistrationController.setBuildPerson(buildPerson);
		
		IRepetitiveFlightController repetitiveFlightController = new RepetitiveFlightController(typeOfFlightView);
		typeOfFlightView.setRepetitiveFlightController(repetitiveFlightController);
		IRepetitiveFlightView repetitiveFlightView = new RepetitiveFlightView(repetitiveFlightController.getDayOfWeek(),repetitiveFlightController);
		repetitiveFlightController.setRepetitiveFlightView(repetitiveFlightView);
		ticketRegistView.setRepetitiveFlightController(repetitiveFlightController);
		repetitiveFlightController.setTicketRegistView(ticketRegistView);
		repetitiveFlightController.setBuidTicket(buildTicket);
		buildTicket.setRepetitiveFlightController(repetitiveFlightController);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flightController.setFlightView(flightView);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
