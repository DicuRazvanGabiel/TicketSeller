package itisx.TicketSeller.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import itisx.TicketSeller.View.Interface.ITicketRegistView;
import itsix.TicketSeller.Controller.ISingleFlightController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketRegistView implements ITicketRegistView {

	private JFrame frame;
	private JTextField textField;
	private JLabel seatsRemainingLabel;
	private ISingleFlightController singleFlightcontroller;

	public TicketRegistView(ISingleFlightController singleFlightcontroller) {
		this.singleFlightcontroller = singleFlightcontroller;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 299, 224);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		JLabel lblSeatmark = new JLabel("Seat ID");
		lblSeatmark.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblSeatmark.setBounds(10, 50, 96, 28);
		frame.getContentPane().add(lblSeatmark);

		textField = new JTextField();
		textField.setBounds(174, 58, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblSeatsRemainning = new JLabel("Seats remaining");
		lblSeatsRemainning.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblSeatsRemainning.setBounds(10, 11, 151, 28);
		frame.getContentPane().add(lblSeatsRemainning);

		seatsRemainingLabel = new JLabel("");
		seatsRemainingLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		seatsRemainingLabel.setBounds(174, 11, 151, 28);
		frame.getContentPane().add(seatsRemainingLabel);

		JButton btnPk = new JButton("OK");
		btnPk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				singleFlightcontroller.makeTicket();
			}
		});
		btnPk.setBounds(88, 136, 89, 23);
		frame.getContentPane().add(btnPk);
	}

	@Override
	public void setVisible(boolean b) {
		frame.setVisible(b);

	}

	@Override
	public String getSeat() {
		return textField.getText();
	}

	@Override
	public void clear() {
		textField.setText(null);
	}

	@Override
	public void setLabelSeats(Integer seatsNumber) {
		seatsRemainingLabel.setText(String.valueOf(seatsNumber));
	}
}
