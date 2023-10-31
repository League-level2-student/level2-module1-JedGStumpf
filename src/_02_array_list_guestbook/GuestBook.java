package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	
	ArrayList<String> nameList = new ArrayList<String>();
	
	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		addName.setText("Add Name");
		panel.add(addName);
		viewNames.setText("View Names");
		panel.add(viewNames);
		
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		
		label.setText("");
		
		panel.add(label);
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		
		if (buttonClicked == addName) {
			String nameToAdd = JOptionPane.showInputDialog("Add a Name");
			nameList.add(nameToAdd);
//			label.setText("");
		}
		
		if (buttonClicked == viewNames) {
			label.setText(concatNames(nameList));
			frame.pack();
		}
		
		
	}
	
	public String concatNames(ArrayList<String>  names) {
		String allNames = "";
		for (String name: names) {
			allNames += name + "   ";
			System.out.println(name);
		}
		
		return allNames;
		
	}
	
	
	
	
	
}
