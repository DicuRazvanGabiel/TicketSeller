package itisx.TicketSeller.View;

import java.awt.EventQueue;

import javax.swing.JFrame;

import itisx.TicketSeller.View.Interface.ITypeOfFlightView;
import itsix.TicketSeller.Controller.ISingleFlightController;
import itsix.TicketSeller.Controller.ITypeOfFlightController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TypeOfFlightView implements ITypeOfFlightView{

	private JFrame frame;
	
	private ITypeOfFlightController typeOfFlightController;
	
	ISingleFlightController singleFlightController;

	public TypeOfFlightView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JButton singleFlightButton = new JButton("Single Flight");
		singleFlightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				singleFlightController.setViseble(true);
				setViseble(false);
			}
		});
		singleFlightButton.setBounds(108, 45, 218, 64);
		frame.getContentPane().add(singleFlightButton);
		
		JButton repetitiveFlightButton = new JButton("Repetitive flight");
		repetitiveFlightButton.setBounds(108, 149, 218, 65);
		frame.getContentPane().add(repetitiveFlightButton);
		
	}

	@Override
	public void setViseble(boolean b) {
		frame.setVisible(b);
		
	}

	@Override
	public void setTypeOfFlightController(ITypeOfFlightController typeOfFlightController) {
		this.typeOfFlightController = typeOfFlightController;
		
	}

	@Override
	public void setSingleFlightcontroller(ISingleFlightController singleFlightcontroller) {
		this.singleFlightController = singleFlightcontroller;
		
	}

}
