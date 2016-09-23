package itisx.TicketSeller.View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.View.Interface.INumberOfSeatsView;
import itsix.TicketSeller.Controller.INumberOfSeatsController;
import itsix.TicketSeller.Controller.IPersonRegistrationController;
import javax.swing.SpinnerModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class NumberOfSeatsView implements INumberOfSeatsView {

	private JFrame frmTicketsSeller;

	private JLabel numberOfSeatsAvalabelLabel;

	private JSpinner numberOfSeatsSpinner;

	private INumberOfSeatsController numberOfSeatsController;

	private IPersonRegistrationController personRegistrationController;
	
	private JLabel totalPrice;
	
	private JLabel totalPriceLabel;


	public NumberOfSeatsView(INumberOfSeatsController numberOfSeatsController) {
		this.numberOfSeatsController = numberOfSeatsController;
	}

	private void initialize(final IFlightWithEscale flight) {
		frmTicketsSeller = new JFrame();
		frmTicketsSeller.setTitle("Tickets Seller");
		frmTicketsSeller.setResizable(false);
		frmTicketsSeller.setBounds(100, 100, 385, 410);
		frmTicketsSeller.getContentPane().setLayout(null);
		frmTicketsSeller.setLocationRelativeTo(null);
		
		totalPriceLabel = new JLabel(String.valueOf(flight.getPriceAdult()));
		totalPriceLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		totalPriceLabel.setBounds(262, 194, 125, 45);
		frmTicketsSeller.getContentPane().add(totalPriceLabel);

		JLabel seatsAvalabelLabel = new JLabel("Seats Avalabel");
		seatsAvalabelLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		seatsAvalabelLabel.setBounds(10, 32, 148, 45);
		frmTicketsSeller.getContentPane().add(seatsAvalabelLabel);

		numberOfSeatsAvalabelLabel = new JLabel(String.valueOf(flight.getNumberOfSeats()-1));
		numberOfSeatsAvalabelLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		numberOfSeatsAvalabelLabel.setBounds(262, 30, 125, 45);
		frmTicketsSeller.getContentPane().add(numberOfSeatsAvalabelLabel);

		JLabel lblSelectNumberOf = new JLabel("Number of seats adults");
		lblSelectNumberOf.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblSelectNumberOf.setBounds(10, 88, 226, 45);
		frmTicketsSeller.getContentPane().add(lblSelectNumberOf);
		
		JLabel lblNumberOfSeats = new JLabel("Number of seats children");
		lblNumberOfSeats.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNumberOfSeats.setBounds(10, 145, 254, 45);
		frmTicketsSeller.getContentPane().add(lblNumberOfSeats);

		final JSpinner numberOfSeatsChildrenSpinner = new JSpinner();
		numberOfSeatsChildrenSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				numberOfSeatsController.updateView(flight,numberOfSeatsSpinner,numberOfSeatsChildrenSpinner);
			}
		});
		numberOfSeatsChildrenSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), flight.getNumberOfSeats(), new Integer(1)));
		numberOfSeatsChildrenSpinner.setBounds(262, 160, 66, 23);
		frmTicketsSeller.getContentPane().add(numberOfSeatsChildrenSpinner);

		totalPrice = new JLabel("Total price");
		totalPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		totalPrice.setBounds(10, 194, 254, 45);
		frmTicketsSeller.getContentPane().add(totalPrice);

		numberOfSeatsSpinner = new JSpinner();
		numberOfSeatsSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), flight.getNumberOfSeats(), new Integer(1)));
		numberOfSeatsSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				numberOfSeatsController.updateView(flight,numberOfSeatsSpinner,numberOfSeatsChildrenSpinner);
			}
		});
		numberOfSeatsSpinner.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		numberOfSeatsSpinner.setBounds(262, 101, 66, 23);
		frmTicketsSeller.getContentPane().add(numberOfSeatsSpinner);

		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personRegistrationController.regisPerson(flight, (Integer) numberOfSeatsSpinner.getValue() + (Integer) numberOfSeatsChildrenSpinner.getValue());
				frmTicketsSeller.setVisible(false);
			}
		});
		nextButton.setBounds(149, 321, 89, 23);
		frmTicketsSeller.getContentPane().add(nextButton);
		frmTicketsSeller.setVisible(true);
	}

	@Override
	public void makeVisible(IFlightWithEscale flight) {
		initialize(flight);

	}

	@Override
	public void setPersonRegistrationController(IPersonRegistrationController personRegistrationController) {
		this.personRegistrationController = personRegistrationController;

	}

	@Override
	public void setTotalPrice(Double calculateTotalPrice) {
		totalPriceLabel.setText(String.valueOf(calculateTotalPrice));
		
	}


	@Override
	public void setSeatsAvalabel(Integer calculateSeatsAvalebal) {
		numberOfSeatsAvalabelLabel.setText(String.valueOf(calculateSeatsAvalebal));
		
	}
}
