package itisx.TicketSeller.View;

import java.awt.Component;
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
import javax.swing.JScrollPane;

public class ListRemoveFlightView implements IListRemoveFlightView{

	private JFrame frame;
	private IListRemoveFlightController listRemoveFlightController;
	private JList list;
	List<IFlight> flights = new ArrayList();
	DefaultListModel<IFlight> listModel;


	public ListRemoveFlightView(IListRemoveFlightController listRemoveFlightController) {
		this.listRemoveFlightController = listRemoveFlightController;
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		flights = listRemoveFlightController.getFlights();
		
		listModel = setListModel(flights);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 414, 204);
		frame.getContentPane().add(scrollPane_1);
		
		list = new JList(listModel);
		scrollPane_1.setViewportView(list);
		list.setSelectedIndex(0);
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


	private DefaultListModel<IFlight> setListModel(List<IFlight> flights) {
		listModel = new DefaultListModel(); 
		for (IFlight flight : flights) {
			listModel.addElement(flight);
		}
		return listModel;
	}

	
	

	@Override
	public void makeVisible(boolean b) {
		initialize();
		frame.setVisible(true);
		
	}


	@Override
	public void refresh() {
		
	}


	@Override
	public void removeFlight(IFlight selectedValue) {
		listModel.removeElement(selectedValue);
		
	}
}
