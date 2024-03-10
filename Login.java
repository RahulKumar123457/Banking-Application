package bank.management.system;
import java.awt.Color;


import java.awt.Font;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	//For accesing out the constructor that why declare globally..
	JButton login, clear, signup;
	JTextField cardTextField ;
	//For not showing the password
	JPasswordField pinTextField;
//==============================================================	
      Login() {
    	  //TITLE
    	 setTitle("AUTOMATED TELLER MACHINE");
    	 //CHANGING THE DEFAULT FOR DISPLAYING ICON 
    	 setLayout(null);
    	 // SETTING THE LOGO 
    	 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
    	 //CHANGING THE SIZE OF IMAGE
    	 Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    	 //PLACING THE LOGO IN THE FRAME
    	 ImageIcon i3 = new ImageIcon(i2);
    	 JLabel label = new JLabel(i3);
    	// JLabel label = new JLabel(i1);
    	// SETTING THE IMAGE
    	 label.setBounds(70,10,100,100);
    	 getContentPane().setBackground(Color.WHITE);
    	 add(label);
    	 //=========================================For Heading
    	 //HEADING 
    	 JLabel text = new JLabel("WELCOME TO ATM");
    	 // CHANDING THE FONT AND SIZE
    	 text.setFont(new Font("Osward", Font.BOLD,38));
    	 //SHOWING AND SETTING THE HEADING
    	 text.setBounds(200,40,400,40);
    	 add(text);
//================================================For Card.no
    	 JLabel cardno = new JLabel("Card No:");
    	 // CHANDING THE FONT AND SIZE
    	cardno.setFont(new Font("Raleway", Font.BOLD,28));
    	 //SHOWING AND SETTING THE HEADING
    	 cardno.setBounds(120,150,150,30);
    	 add(cardno);
//=========================================================    	 
    	 //FOR ENTERING THE CARD NUMBER IN THENRECTANGLE BOX
    	  cardTextField = new JTextField();
    	 cardTextField.setBounds(300,150,230,30);
    	 //For changing the Fonts for entering the cardno.
    	 cardTextField.setFont(new Font("Arial",Font.BOLD,14));
    	 add(cardTextField);
//================================================For Pin.no
    	 JLabel pin = new JLabel("PIN:");
    	 // CHANDING THE FONT AND SIZE
    	 pin.setFont(new Font("Raleway", Font.BOLD,28));
    	 //SHOWING AND SETTING THE HEADING
    	 pin.setBounds(120,220,230,40);
    	 add(pin);
//=================================================    	 
    	 //FOR ENTERING THE PIN NUMBER RECTANGLE BOX
    	 pinTextField = new JPasswordField();
    	 pinTextField.setBounds(300,220,230,30);
//For changing the Fonts for entering the cardno.
    	 pinTextField.setFont(new Font("Arial",Font.BOLD,14));
    	 add(pinTextField);
//================================================ For  sign in Buttons
    	 login = new JButton("SIGN IN");
    	 login.setBounds(300,300,100,30);
    	 //For Changing the color of button background
    	 login.setBackground(Color.BLACK);
    	 login.setForeground(Color.WHITE);
    	 //For perform action with login button
    	 login.addActionListener(this);
    	 add(login);
//=========================================================   	 
    	 clear = new JButton("CLEAR");
         clear.setBounds(430,300,100,30);
    	 //For Changing the color of button background
    	 clear.setBackground(Color.BLACK);
    	 clear.setForeground(Color.WHITE);
    	//For perform action with clear button
    	 clear.addActionListener(this);
    	 add(clear);
//=========================================================     	 
    	 signup = new JButton("SIGN UP");
    	 signup.setBounds(300,350,230,30);
    	 //For Changing the color of button background
    	 signup.setBackground(Color.BLACK);
    	 signup.setForeground(Color.WHITE);
    	//For perform action with signup button
    	 signup.addActionListener(this);
    	 add(signup);
//========================================For Displaying the Frame   
		setSize(800,500);
		//SHOWING THE PAGE
		setVisible(true);
		setLocation(350,120);
	}
//=======================================For Performing Action in Buttons
      public void actionPerformed (ActionEvent ae) {
		if(ae.getSource()==login) {
			
	}else if (ae.getSource()==clear) {
		//For clear the entered data
		cardTextField.setText("");
		pinTextField.setText("");
	
	}else if (ae.getSource()==signup) {
		
	}
      }
	public static void main(String[] args) {
	new Login();
		
	}
}
