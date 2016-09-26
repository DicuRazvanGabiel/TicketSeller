package itisx.TicketSeller.View;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import itisx.TicketSeller.Model.IFlight;
import itisx.TicketSeller.Model.IFlightWithEscale;
import itisx.TicketSeller.View.Interface.IListRemoveFlightView;
import itsix.TicketSeller.Controller.IListRemoveFlightController;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListRemoveFlightView implements IListRemoveFlightView{

	private JFrame frame;
	private IListRemoveFlightController listRemoveFlightController;


	public ListRemoveFlightView(IListRemoveFlightController listRemoveFlightController) {
		this.listRemoveFlightController = listRemoveFlightController;
		initialize();
		
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		List<IFlight> flights = new ArrayList();
		flights = listRemoveFlightController.getFlights();
		
		DefaultListModel<IFlight> listModel = new DefaultListModel(); 
		for (IFlight flight : flights) {
			listModel.addElement(flight);
		}
		final JList list = new JList(listModel);
		list.setBounds(10, 11, 414, 204);
		list.setSelectedIndex(0);
		frame.getContentPane().add(list);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listRemoveFlightController.removeFlight((IFlight)list.getSelectedValue());
				listRemoveFlightController.updateView();
			}
		});
		btnRemove.setBounds(169, 226, 89, 23);
		frame.getContentPane().add(btnRemove);
	}


	@Override
	public void makeVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
