package com.labs.oo;

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Dimension;
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
	import javax.swing.SwingUtilities;

	import java.util.Random;

	public class GUI extends JFrame implements ActionListener,MouseListener 
	{

		  //Attributes
		  private JLabel label1;
		  private JButton Generate;
		  private JButton Check;
		  private JTextField Guess;
		  private int guesses = 0;
		  private int random;
		  private String ftext;
		  private int fint;
		  private boolean gencheck = false;
		  
		  //create a section of screen (panel) that will hold some GUI components 
		  JPanel PanelN = new JPanel();
		  JPanel PanelS = new JPanel();
		  JPanel PanelC = new JPanel();
		  

		  		  	 
		  //Constructor
		  public GUI(String title)
		  {
			  //set the title
			  super(title);
			
			  //sets the screen layout  - in this case, border layout
			  setLayout(new BorderLayout());
			   
			  //create a label
			  label1  = new JLabel("Then make a guess.. ");
			   
			   //add the labels 
			   //Remember that once you add to the panel you cant resize
			   PanelC.add(label1); 
			   
			   //add the panel to the screen ,set background colour and panel dimensions
			   add(PanelN, BorderLayout.NORTH);
			   PanelN.setBackground(Color.gray);
			   PanelS.setPreferredSize(new Dimension(400,60));
			   add(PanelS, BorderLayout.SOUTH);
			   PanelS.setBackground(Color.gray);
			   add(PanelC, BorderLayout.CENTER);
			   PanelC.setBackground(Color.lightGray);

				// set the location of the screen  
			   setLocation(500,100);

			   // Define the size of the frame  
			   setSize(300,300);
			   
			   
			   
			   //Instantiate new buttons
			   Generate = new JButton("Generate a random number");
			   Generate.setPreferredSize(new Dimension(100, 40));
			   Generate.addActionListener(this);
			   
			   Check = new JButton("Check your guess");
			   Check.setPreferredSize(new Dimension(140, 30));
			   Check.addActionListener(this);
			   
				//Add Buttons to the panels and add listener  
			   PanelN.add(Generate);
			   PanelS.add(Check);
			   
			   //Instantiate the textfield, set layout and dimensions
			   Guess = new JTextField();
			   Guess.setPreferredSize(new Dimension(120, 30));
			   PanelC.add(Guess,BorderLayout.CENTER);
			   Guess.addActionListener(this);
			   Guess.setToolTipText("Enter your Guess");
			   
			// make the screen appear - without this, it doesn't!  
			   setVisible(true);
			   	   
		 }
		  
		 public void actionPerformed(ActionEvent event) {
			 
				if(event.getSource() == Generate){
					
					JOptionPane.showMessageDialog(this, "New Number Generated");
					Random rnd =  new Random();
					random = rnd.nextInt(100);
					System.out.println("Generated number is " + random);
					guesses = 0;
					gencheck = true;
				}
				
				//error checking
				else if((event.getSource()== Check||event.getSource()== Guess) && gencheck == true) {
					
					ftext = Guess.getText();
					System.out.println("Input is " + ftext);
					try {
						fint = Integer.parseInt(ftext.replace(" ",""));
					}
					catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(this, "Your input is invalid\nPlease enter a positive integer");
						return;
					}
					
					guesses++;
					System.out.println("Number of guesses is " + guesses);
					System.out.println("Input in integer is " + fint);
					
					
					
					if(fint == random) {
						
						JOptionPane.showMessageDialog(this, "You Guessed It!"+"\nYou took "+guesses+" guesses\nPress Generate to start again!");
						gencheck = false;
					}
					else if(fint > random) {
						JOptionPane.showMessageDialog(this, "Number: "+fint+" is bigger\nGuess Again");
					}
					else if(fint < random) {
						JOptionPane.showMessageDialog(this, "Number: "+fint+" is smaller\nGuess Again");
					}
					
				}
				else {
					JOptionPane.showMessageDialog(this, "Please Click Generate Before You Guess");
				}
			  	
				
			}
		 
		 

		


		public void mouseClicked(MouseEvent e) {
		
			 
			if(SwingUtilities.isLeftMouseButton(e)) {
				//JOptionPane.showMessageDialog(this, "Left Click");
				
			
			}
			else if(SwingUtilities.isRightMouseButton(e)) {
				//JOptionPane.showMessageDialog(this, "Right Click");
				
			}
		}

		@Override
		 public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
	   	 public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		 public void mouseEntered(MouseEvent e) {
			
			//JOptionPane.showMessageDialog(this, "Mouse Entered the left panel");
			
		}

		@Override
		 public void mouseExited(MouseEvent e) {
			//JOptionPane.showMessageDialog(this, "Mouse left the left panel");
			
			
		}

}
