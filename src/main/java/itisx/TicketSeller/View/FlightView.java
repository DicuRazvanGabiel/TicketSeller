package itisx.TicketSeller.View;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import itisx.TicketSeller.Model.Date;
import itisx.TicketSeller.Model.IDate;
import itisx.TicketSeller.Model.IFlightRepository;
import itisx.TicketSeller.Model.RepositorySerializator;
import itisx.TicketSeller.View.Interface.IFlightView;
import itsix.TicketSeller.Controller.IFlightController;
import itsix.TicketSeller.Controller.ITypeOfFlightController;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.awt.event.ActionEvent;

public class FlightView extends JFrame implements IFlightView {


	private IFlightController flightController;

	private JComboBox startComboBox;

	private JComboBox endComboBox;
	
	private JLabel fromLabel;

	private JLabel toLabel;

	private JLabel dateLabel;

	private JSpinner daySpinner;

	private JSpinner monthSpinner;

	private JSpinner yearSpinner;
	
	private ITypeOfFlightController typeOfFlightController;

	

	public FlightView(IFlightController flightController, List<String> listOfStart, List<String> listOfEnd) {
		initialize(listOfStart, listOfEnd);
		this.flightController = flightController;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(List<String> listOfStart, List<String> listOfEnd) {
		setTitle("Ticket Seller");
		setResizable(false);
		setBounds(100, 100, 489, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		fromLabel = new JLabel("From");
		fromLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		fromLabel.setLabelFor(this);
		fromLabel.setToolTipText("");
		fromLabel.setBounds(93, 43, 51, 28);
		getContentPane().add(fromLabel);

		toLabel = new JLabel("To");
		toLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		toLabel.setBounds(93, 92, 26, 28);
		getContentPane().add(toLabel);

		startComboBox = new JComboBox();
		startComboBox.setModel(new DefaultComboBoxModel(listOfStart.toArray()));
		startComboBox.setBounds(163, 56, 157, 20);
		getContentPane().add(startComboBox);

		endComboBox = new JComboBox();
		endComboBox.setModel(new DefaultComboBoxModel<>(listOfEnd.toArray()));
		endComboBox.setBounds(163, 100, 157, 20);
		getContentPane().add(endComboBox);

		dateLabel = new JLabel("Date");
		dateLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		dateLabel.setBounds(93, 153, 46, 28);
		getContentPane().add(dateLabel);

		daySpinner = new JSpinner();
		daySpinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		daySpinner.setBounds(163, 157, 39, 20);
		getContentPane().add(daySpinner);

		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(163, 131, 39, 14);
		getContentPane().add(lblDay);

		monthSpinner = new JSpinner();
		monthSpinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		monthSpinner.setBounds(227, 157, 39, 20);
		getContentPane().add(monthSpinner);

		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(227, 131, 39, 14);
		getContentPane().add(lblMonth);

		yearSpinner = new JSpinner();
		yearSpinner.setModel(new SpinnerNumberModel(2016, 2016, 2020, 1));
		yearSpinner.setBounds(286, 157, 63, 20);
		getContentPane().add(yearSpinner);

		JLabel lblNewLabel = new JLabel("Year");
		lblNewLabel.setBounds(286, 131, 34, 14);
		getContentPane().add(lblNewLabel);

		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				flightController.searchFlights();

			}
		});
		searchButton.setBounds(198, 240, 89, 23);
		getContentPane().add(searchButton);
		
		JButton sddFlightButton = new JButton("Add flight");
		sddFlightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				typeOfFlightController.setViseble(true);
			}
		});
		sddFlightButton.setBounds(384, 287, 89, 23);
		getContentPane().add(sddFlightButton);
		setVisible(true);
		setLocationRelativeTo(null);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
		    private RepositorySerializator repositorySerializator;
			private IFlightRepository flightRepository;

			@Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				flightController.serialize();
				
//		    	try {
//					repositorySerializator.serialize(flightRepository);
//				} catch (IOException e) {
//					
//					e.printStackTrace();
//				}
		    	setVisible(false);
		    	dispose();
		    }
		});
	}

	@Override
	public String getFrom() {
		return String.valueOf( startComboBox.getSelectedItem());
	}

	@Override
	public String getTo() {
		return String.valueOf(endComboBox.getSelectedItem());
	}

	@Override
	public IDate getDate() {
		int day = (Integer)(daySpinner.getValue());
		int month= (Integer)(monthSpinner.getValue());
		int year = (Integer)(yearSpinner.getValue());
		
		return new Date(day, month, year);
	}

	@Override
	public void setFlightController(IFlightController flightController) {
		this.flightController = flightController;
		
	}

	@Override
	public void setTypeOfFlightController(ITypeOfFlightController typeOfFlightController) {
		this.typeOfFlightController=typeOfFlightController;
		
	}

	@Override
	public void refresh() {
		startComboBox.setModel(new DefaultComboBoxModel(flightController.getMakeListFrom().toArray()));
		endComboBox.setModel(new DefaultComboBoxModel<>(flightController.getMakeListTo().toArray()));
	}
	
	
}
