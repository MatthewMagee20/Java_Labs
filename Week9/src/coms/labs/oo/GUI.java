package coms.labs.oo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolTip;
import javax.swing.SwingUtilities;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextArea;

public class GUI  extends JFrame implements ActionListener,MouseListener {
	  private JButton Save;
	  private JButton ShowAll;
	  private JTextField firstName;
	  private JTextField surName;
	  private JTextField jCity;
	  private JLabel label1;
	  private ArrayList<Person> personList = new ArrayList<>();
	  private JTextArea showField = new JTextArea();
	  private String displayString;
	  private JButton Delete;
	  
	  JPanel PanelN = new JPanel();
	  JPanel PanelS = new JPanel();
	  JPanel PanelC = new JPanel();

	  public GUI(String title)
	  {
		  //set the title
		  super(title);
		
		  //sets the screen layout  - in this case, border layout
		  setLayout(new BorderLayout());
		   		   
		   //add the panel to the screen ,set background colour and panel dimensions
		   add(PanelC, BorderLayout.CENTER);
		   PanelC.setBackground(Color.lightGray);

		   firstName = new JTextField();
		   firstName.setPreferredSize(new Dimension(100, 30));
		   PanelC.add(firstName,BorderLayout.CENTER);
		   firstName.addActionListener(this);
		   firstName.setToolTipText("Enter Name");
		   
		   surName = new JTextField();
		   surName.setPreferredSize(new Dimension(100, 30));
		   PanelC.add(surName,BorderLayout.CENTER);
		   surName.addActionListener(this);
		   surName.setToolTipText("Enter Surname");
		   
		   jCity = new JTextField();
		   jCity.setPreferredSize(new Dimension(60, 30));
		   PanelC.add(jCity,BorderLayout.CENTER);
		   jCity.addActionListener(this);
		   jCity.setToolTipText("Enter City");
		   
		   Save = new JButton("Save");
		   Save.setPreferredSize(new Dimension(100, 40));
		   Save.addActionListener(this);
		   
		   ShowAll = new JButton("Show All");
		   ShowAll.setPreferredSize(new Dimension(100, 40));
		   ShowAll.addActionListener(this);
		   
		   Delete = new JButton("Delete");
		   Delete.setPreferredSize(new Dimension(100, 40));
		   Delete.addActionListener(this);
		   
		   PanelC.add(Save);
		   PanelC.add(ShowAll);
		   PanelC.add(Delete);
		   PanelC.add(showField);
		   
			// set the location of the screen  
		   setLocation(500,100);

		   // Define the size of the frame  
		   setSize(300,300);
		
		   setVisible(true);
	  }

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == Save)
		{
		personList.add(new Person(firstName.getText(), surName.getText(), jCity.getText()));
		JOptionPane.showMessageDialog(null, personList.get(personList.size() - 1));
	}
	else if(e.getSource() == ShowAll)
	{
		displayString = "Saved People:\n";
		for(int i = 0; i < personList.size(); i++)
		{
			displayString = displayString + personList.get(i).toString() + "\n";
		}
		showField.setVisible(true);
		showField.setText(displayString);
	}
	else if(e.getSource() == Delete)
	{
		for(int i = personList.size() - 1; i >= 0; i--)
		{
			personList.remove(i);
		}
	}
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		



	}
	
}
