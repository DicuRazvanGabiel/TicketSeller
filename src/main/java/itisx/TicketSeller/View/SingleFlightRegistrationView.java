package itisx.TicketSeller.View;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import itisx.TicketSeller.View.Interface.ISingleFlightRegistrationView;
import itsix.TicketSeller.Controller.ISingleFlightController;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingleFlightRegistrationView implements ISingleFlightRegistrationView {

	private JFrame frame;

	private JTextField fromTextField;

	private JTextField toTextxField;

	private JTextField adultPriceTextField;

	private JSpinner daySpinner;

	private JSpinner monthSpinner;

	private JSpinner yearSpinner;

	private JSpinner numberOfSeatsSpinner;

	private ISingleFlightController singleFlightcontroller;

	private JTextField childrenPriceTextField;

	public SingleFlightRegistrationView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 528);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		daySpinner = new JSpinner();
		daySpinner.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		daySpinner.setBounds(116, 175, 39, 20);
		frame.getContentPane().add(daySpinner);

		monthSpinner = new JSpinner();
		monthSpinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		monthSpinner.setBounds(180, 175, 39, 20);
		frame.getContentPane().add(monthSpinner);

		yearSpinner = new JSpinner();
		yearSpinner.setModel(new SpinnerNumberModel(new Integer(2016), new Integer(2016), null, new Integer(1)));
		yearSpinner.setBounds(239, 175, 63, 20);
		JSpinner.NumberEditor editor = new JSpinner.NumberEditor(yearSpinner, "#");
		yearSpinner.setEditor(editor);
		frame.getContentPane().add(yearSpinner);

		JLabel label = new JLabel("Year");
		label.setBounds(239, 149, 34, 14);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("Month");
		label_1.setBounds(180, 149, 39, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Day");
		label_2.setBounds(116, 149, 39, 14);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Date");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label_3.setBounds(46, 171, 46, 28);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("To");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label_4.setBounds(46, 82, 26, 28);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("From");
		label_5.setToolTipText("");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label_5.setBounds(46, 29, 51, 28);
		frame.getContentPane().add(label_5);

		fromTextField = new JTextField();
		fromTextField.setBounds(138, 29, 157, 28);
		frame.getContentPane().add(fromTextField);
		fromTextField.setColumns(10);

		toTextxField = new JTextField();
		toTextxField.setBounds(138, 82, 157, 28);
		frame.getContentPane().add(toTextxField);
		toTextxField.setColumns(10);

		JLabel lblNumberOfSeats_1 = new JLabel("Number of seats");
		lblNumberOfSeats_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNumberOfSeats_1.setBounds(38, 235, 157, 28);
		frame.getContentPane().add(lblNumberOfSeats_1);

		JLabel lblListOfSeats = new JLabel("List of seats");
		lblListOfSeats.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblListOfSeats.setBounds(46, 293, 116, 28);
		frame.getContentPane().add(lblListOfSeats);

		JLabel lblPrice = new JLabel("Adult price");
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblPrice.setBounds(46, 352, 116, 28);
		frame.getContentPane().add(lblPrice);

		numberOfSeatsSpinner = new JSpinner();
		numberOfSeatsSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		numberOfSeatsSpinner.setBounds(263, 243, 39, 20);
		frame.getContentPane().add(numberOfSeatsSpinner);

		JButton addTicketButton = new JButton("Add tickets");
		addTicketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				singleFlightcontroller.getTicket((Integer) numberOfSeatsSpinner.getValue());
			}
		});
		addTicketButton.setBounds(216, 300, 105, 23);
		frame.getContentPane().add(addTicketButton);

		adultPriceTextField = new JTextField();
		adultPriceTextField.setBounds(216, 360, 86, 20);
		frame.getContentPane().add(adultPriceTextField);
		adultPriceTextField.setColumns(10);

		JLabel lblChildrenPrice = new JLabel("Children price");
		lblChildrenPrice.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblChildrenPrice.setBounds(46, 402, 149, 28);
		frame.getContentPane().add(lblChildrenPrice);

		childrenPriceTextField = new JTextField();
		childrenPriceTextField.setColumns(10);
		childrenPriceTextField.setBounds(216, 410, 86, 20);
		frame.getContentPane().add(childrenPriceTextField);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				singleFlightcontroller.makeFlight();
				frame.setVisible(false);
				singleFlightcontroller.refreshFlightView();
			}
		});
		btnFinish.setBounds(184, 465, 89, 23);
		frame.getContentPane().add(btnFinish);
	}

	@Override
	public void setViseble(boolean b) {
		frame.setVisible(b);
	}

	@Override
	public void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller) {
		this.singleFlightcontroller = singleFlightcontroller;

	}

	@Override
	public String getTo() {
		return toTextxField.getText();
	}

	@Override
	public String getFrom() {
		return fromTextField.getText();
	}

	@Override
	public Double getAdultPrice() {
		return Double.valueOf(adultPriceTextField.getText());
	}

	@Override
	public Double getChildrenPrice() {
		return Double.valueOf(childrenPriceTextField.getText());
	}

	@Override
	public Integer getDay() {
		return (Integer) daySpinner.getValue();
	}

	@Override
	public Integer getMonth() {
		return (Integer) monthSpinner.getValue();
	}

	@Override
	public Integer getYear() {
		return (Integer) yearSpinner.getValue();
	}
}
