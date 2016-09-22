package itisx.TicketSeller.View;

import java.awt.EventQueue;

import javax.swing.JFrame;

import itisx.TicketSeller.View.Interface.IRepetitiveFlightView;
import itsix.TicketSeller.Controller.IRepetitiveFlightController;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RepetitiveFlightView implements IRepetitiveFlightView{

	private JFrame frame;
	
	private JTextField fromTextField;
	
	private JTextField toTextField;
	
	private JTextField adultPriceTextField;
	
	private JTextField childrenPriceTextField;
	
	private JSpinner numberOfSeatsSpinner;
	
	private IRepetitiveFlightController repetitivFlightController;

	private IRepetitiveFlightController repetitiveFlightController;
	
	private JComboBox comboBox;

	public RepetitiveFlightView(String[] dayOfWeek, IRepetitiveFlightController repetitiveFlightController) {
		initialize(dayOfWeek);
		this.repetitiveFlightController = repetitiveFlightController;
	}

	private void initialize(String[] dayOfWeek) {
		frame = new JFrame();
		frame.setBounds(100, 100, 423, 550);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		fromTextField = new JTextField();
		fromTextField.setColumns(10);
		fromTextField.setBounds(144, 11, 157, 28);
		frame.getContentPane().add(fromTextField);
		
		JLabel label = new JLabel("From");
		label.setToolTipText("");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label.setBounds(44, 11, 51, 28);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("To");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label_1.setBounds(44, 64, 26, 28);
		frame.getContentPane().add(label_1);
		
		toTextField = new JTextField();
		toTextField.setColumns(10);
		toTextField.setBounds(144, 64, 157, 28);
		frame.getContentPane().add(toTextField);
		
		JLabel label_2 = new JLabel("Number of seats");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label_2.setBounds(44, 217, 157, 28);
		frame.getContentPane().add(label_2);
		
		numberOfSeatsSpinner = new JSpinner();
		numberOfSeatsSpinner.setBounds(269, 225, 39, 20);
		frame.getContentPane().add(numberOfSeatsSpinner);
		
		JLabel label_3 = new JLabel("List of seats");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label_3.setBounds(52, 275, 116, 28);
		frame.getContentPane().add(label_3);
		
		JButton addTicketButton = new JButton("Add tickets");
		addTicketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repetitivFlightController.getTicket((Integer) numberOfSeatsSpinner.getValue());
			}
		});
		addTicketButton.setBounds(222, 282, 105, 23);
		frame.getContentPane().add(addTicketButton);
		
		JLabel label_4 = new JLabel("Adult price");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label_4.setBounds(52, 334, 116, 28);
		frame.getContentPane().add(label_4);
		
		adultPriceTextField = new JTextField();
		adultPriceTextField.setColumns(10);
		adultPriceTextField.setBounds(222, 342, 86, 20);
		frame.getContentPane().add(adultPriceTextField);
		
		JLabel label_5 = new JLabel("Children price");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		label_5.setBounds(52, 384, 149, 28);
		frame.getContentPane().add(label_5);
		
		childrenPriceTextField = new JTextField();
		childrenPriceTextField.setColumns(10);
		childrenPriceTextField.setBounds(222, 392, 86, 20);
		frame.getContentPane().add(childrenPriceTextField);
		
		JButton finishButton = new JButton("Finish");
		finishButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				repetitivFlightController.registFlight();
			}
		});
		finishButton.setBounds(151, 454, 89, 23);
		frame.getContentPane().add(finishButton);
		
		JLabel lblAddDay = new JLabel("Select day");
		lblAddDay.setToolTipText("");
		lblAddDay.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblAddDay.setBounds(43, 147, 105, 28);
		frame.getContentPane().add(lblAddDay);
		
		comboBox = new JComboBox();
		comboBox.setBounds(151, 147, 150, 28);
		comboBox.setModel(new DefaultComboBoxModel(dayOfWeek));
		frame.getContentPane().add(comboBox);
	}
	
	@Override
	public void setVisible(boolean b){
		frame.setVisible(b);
	}

	@Override
	public Integer getNumberOfSeats() {
		return (Integer)numberOfSeatsSpinner.getValue();
	}

	@Override
	public String getTo() {
		return toTextField.getText();
	}

	@Override
	public String getFrom() {
		return fromTextField.getText();
	}

	@Override
	public String getDayOfWeek() {
		return comboBox.getSelectedItem().toString();
	}

	@Override
	public Double getChildrenPrice() {
		return Double.valueOf(childrenPriceTextField.getText());
	}

	@Override
	public Double getAdultPrice() {
		return Double.valueOf(adultPriceTextField.getText());
	}
}
