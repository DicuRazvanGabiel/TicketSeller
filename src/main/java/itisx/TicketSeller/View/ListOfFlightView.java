package itisx.TicketSeller.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.View.Interface.IListOfFlightsView;
import itsix.TicketSeller.Controller.IFlightController;
import itsix.TicketSeller.Controller.INumberOfSeatsController;
import itsix.TicketSeller.Controller.NumberOfSeatsController;

import javax.swing.JScrollBar;

public class ListOfFlightView extends JFrame implements IListOfFlightsView{
	public ListOfFlightView() {
	}

	JFrame frame;
	private IFlightController flightController;
	
	private INumberOfSeatsController numberOfSeatsController;
	
	public void makeVisible(List<IFlightWithEscale> flights) {
		initialize(flights);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(List<IFlightWithEscale> flights) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 300);
		frame.getContentPane().setLayout(null);
		
		
		
		
		DefaultListModel<IFlightWithEscale> listModel = new DefaultListModel(); 
		for (IFlightWithEscale flight : flights) {
			listModel.addElement(flight);
		}
		
		
		final JList<IFlight> list = new JList(listModel);
		list.setBounds(10, 11, 575, 201);
		list.setSelectedIndex(0);
		frame.getContentPane().add(list);
		
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberOfSeatsController.makeVisible((IFlightWithEscale) list.getSelectedValue());
				frame.setVisible(false);
				
			}
		});
		nextButton.setBounds(216, 223, 89, 23);
		frame.getContentPane().add(nextButton);
		frame.setLocationRelativeTo(null);
		
	}

	@Override
	public void setFlightController(IFlightController flightController) {
		this.flightController = flightController;
		
	}

	@Override
	public void setNumberOfSeatsController(INumberOfSeatsController numberOfSeatsController) {
		this.numberOfSeatsController = numberOfSeatsController;
		
	}

}

