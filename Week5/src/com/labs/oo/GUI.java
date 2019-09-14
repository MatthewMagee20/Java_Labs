package com.labs.oo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
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

/************************************************
 * Class Description: Implementation of UI
 * Author: Matthew Magee 
 * Date: 28/02/2019
 ************************************************/


public class GUI extends JFrame implements ActionListener, MouseListener
{
	//UI Components
	
	private JButton button1;
	private JPanel panel1;
	
	private JPanel panel2;
	private JLabel label1;
	
	private JButton button2;
	private JTextField myTextField;
	
	//Constructor
	public GUI(String title)
	{
		//inherited constructor
		super(title);
		
		// sets screen layout
		setLayout(new BorderLayout());
		
		//Create 1st button 
		button1 = new JButton("Button 1");
		button1.setSize(50, 50);
		
		//add action listener to 1st button
		button1.addActionListener(this);
		
		//create panel on which button will rest
		panel1 = new JPanel();
		add(panel1);
		
		//add button to panel
		panel1.add(button1);
		
		//2nd button
		button2 = new JButton("Button 2");
		button2.setSize(50, 50);
		button2.addActionListener(this);
		
		panel1.add(button2);
		
		//set layout for panel
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//create text field and add to panel
		myTextField = new JTextField("Name");
		myTextField.addActionListener(this);
		myTextField.setSize(300,300);
		panel1.add(myTextField);
		
		
		//create 2nd panel with a label
		panel2 = new JPanel();
		label1 = new JLabel("Second panel");
		
		panel2.setBackground(Color.yellow);
		panel2.addMouseListener(this);
		
		panel2.add(label1);
		add(panel2);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setVisible(true);
		setSize(800,400);
		
	}
	
	//react to button presses
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == button1)//button1 was pressed
		{
			JOptionPane.showMessageDialog (this, "Button 1 pressed");
		}
		else if(event.getSource() == button2)//button2 was pressed
		{
			//read in from text field and display window with contents
			JOptionPane.showMessageDialog (this, "Hi " + myTextField.getText());
			
		}
	}
	
	//panel mouse over events
	public void mouseEntered(MouseEvent mice)
	{
		panel2.setToolTipText("Mouse entered the panel and is now yellow");
		panel2.setBackground(Color.yellow);
	}
	
	public void mouseExited(MouseEvent mice)
	{
		panel2.setBackground(Color.red);
	}
	
	public void mouseClicked(MouseEvent mice)
	{
		if(mice.getButton()== MouseEvent.BUTTON1)
		{
			panel2.setBackground(Color.blue);
		JOptionPane.showMessageDialog(this,"Panel was Left clicked and is now blue");
		}
		
		if(mice.getButton()== MouseEvent.BUTTON3)
		{
		panel2.setBackground(Color.green);
		JOptionPane.showMessageDialog(this,"Panel was right clicked and is now green");
		
		}
	}
	
	public void mouseReleased(MouseEvent e)
	{
		
	}
	
	public void mousePressed(MouseEvent e)
	{
		//
	}
}
