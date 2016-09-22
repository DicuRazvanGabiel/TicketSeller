package itisx.TicketSeller.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BuyerView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyerView window = new BuyerView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BuyerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 457, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("First Name");
		textField.setColumns(10);
		textField.setBounds(92, 33, 256, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Last Name");
		textField_1.setColumns(10);
		textField_1.setBounds(92, 64, 256, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Social security number");
		textField_2.setColumns(10);
		textField_2.setBounds(92, 95, 256, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Identity Card");
		textField_3.setColumns(10);
		textField_3.setBounds(92, 126, 256, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Nationality");
		textField_4.setColumns(10);
		textField_4.setBounds(92, 157, 256, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("Country");
		textField_5.setColumns(10);
		textField_5.setBounds(92, 188, 256, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Address");
		textField_6.setColumns(10);
		textField_6.setBounds(92, 219, 256, 20);
		frame.getContentPane().add(textField_6);
		
		JButton button = new JButton("Next");
		button.setBounds(176, 264, 89, 23);
		frame.getContentPane().add(button);
	}
}
