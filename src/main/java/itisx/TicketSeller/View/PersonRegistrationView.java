package itisx.TicketSeller.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.View.Interface.IPersonRegistrationView;
import itsix.TicketSeller.Controller.IPersonRegistrationController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PersonRegistrationView implements IPersonRegistrationView {

	JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtSocialSecurityNumber;
	private JTextField txtIdentityCard;
	private JTextField txtNationality;
	private JTextField txtCountry;
	private JTextField txtAddress;

	private IPersonRegistrationController personRegistrationController;

	public PersonRegistrationView(IPersonRegistrationController personRegistrationController) {
		this.personRegistrationController = personRegistrationController;
	}

	@Override
	public void makeVesible() {
		initialize();

	}

	private void initialize( ) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 319);
		frame.getContentPane().setLayout(null);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(178, 11, 256, 20);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		txtLastName = new JTextField();
		txtLastName.setBounds(178, 43, 256, 20);
		frame.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);

		txtSocialSecurityNumber = new JTextField();
		txtSocialSecurityNumber.setBounds(178, 74, 256, 20);
		frame.getContentPane().add(txtSocialSecurityNumber);
		txtSocialSecurityNumber.setColumns(10);

		txtIdentityCard = new JTextField();
		txtIdentityCard.setBounds(178, 105, 256, 20);
		frame.getContentPane().add(txtIdentityCard);
		txtIdentityCard.setColumns(10);

		txtNationality = new JTextField();
		txtNationality.setBounds(178, 136, 256, 20);
		frame.getContentPane().add(txtNationality);
		txtNationality.setColumns(10);

		txtCountry = new JTextField();
		txtCountry.setBounds(178, 167, 256, 20);
		frame.getContentPane().add(txtCountry);
		txtCountry.setColumns(10);

		txtAddress = new JTextField();
		txtAddress.setBounds(178, 198, 256, 20);
		frame.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);

		JButton btnNext = new JButton("Order");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personRegistrationController.setPerson();

			}
		});
		btnNext.setBounds(177, 242, 89, 23);
		frame.getContentPane().add(btnNext);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 17, 123, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 49, 123, 14);
		frame.getContentPane().add(lblLastName);

		JLabel lblSocialSecurityNumber = new JLabel("Social security number");
		lblSocialSecurityNumber.setBounds(10, 80, 158, 14);
		frame.getContentPane().add(lblSocialSecurityNumber);

		JLabel lblIdentityCard = new JLabel("Identity card");
		lblIdentityCard.setBounds(10, 111, 123, 14);
		frame.getContentPane().add(lblIdentityCard);

		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(10, 142, 123, 14);
		frame.getContentPane().add(lblNationality);

		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 173, 123, 14);
		frame.getContentPane().add(lblCountry);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 204, 123, 14);
		frame.getContentPane().add(lblAddress);

		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void setPersonRegistrationController(IPersonRegistrationController personRegistrationController) {
		this.personRegistrationController = personRegistrationController;

	}

	@Override
	public void setVesibleTo(boolean b) {
		frame.setVisible(b);
		
	}

	@Override
	public void clear() {
		txtFirstName.setText(null);
		txtLastName.setText(null);
		txtSocialSecurityNumber.setText(null);
		txtIdentityCard.setText(null);
		txtNationality.setText(null);
		txtCountry.setText(null);
		txtAddress.setText(null);
	}

	@Override
	public String getTxtFirstName() {
		return txtFirstName.getText();
	}

	@Override
	public String getTxtLastName() {
		return txtLastName.getText();
	}

	@Override
	public String getTxtSocialSecurityNumber() {
		return txtSocialSecurityNumber.getText();
	}

	@Override
	public String getTxtIdentityCard() {
		return txtIdentityCard.getText();
	}

	@Override
	public String getTxtNationality() {
		return txtNationality.getText();
	}

	@Override
	public String getTxtCountry() {
		return txtCountry.getText();
	}

	@Override
	public String getTxtAddress() {
		return txtAddress.getText();
	}



	
}
