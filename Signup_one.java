package bank.management.system;

import java.awt.Color;


import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
//import com.toedter.calendar.JDateChooser;

public class Signup_one extends JFrame {
	Signup_one(){
		//For changing the default displaying of application form no.
		setLayout(null);
		
		//For creating thr Randon application number
		Random ran = new Random();
		//System.out.println(Math.abs((ran.nextLong()%9000L)+1000L));
		long random = Math.abs((ran.nextLong()%9000L)+1000L);
		JLabel formno =new JLabel("APPLICATION FORM NO.:"+ random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno);
//=====================================PAGE 1: PERSONAL DETAILS	
		JLabel personalDetails =new JLabel("Page 1:Personal Details");
		personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails);
//============================================For Name:		
		JLabel name =new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
	//For entering the name in box..	
		JTextField nameTextField= new JTextField();
   	nameTextField.setBounds(300,140,400,30);
   	nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
   	 add(nameTextField);
   	 
//==============================================For Fname:  	
		JLabel fname  =new JLabel("Father's Name:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
	    fname.setBounds(100,190,200,30);
		add(fname);
		
		JTextField fnameTextField  = new JTextField();
	   	fnameTextField.setBounds(300,190,400,30);
	   	fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
	   	 add(fnameTextField);
//============================================For Name:			
		JLabel dob =new JLabel("Date of birth:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);

//	   	JDateChooser dateChooser = new JDateChooser();
//	   	dateChooser.setBounds(300,240,200,30);
//	   	add(dateChooser);

//============================================For Gender:			
		JLabel gender =new JLabel("Gender:");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		//For female button
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(450,290,120,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		//To choose any one button
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
//============================================For Email:	
		JLabel email =new JLabel("Email:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		
		JTextField emailTextField = new JTextField();
	   	emailTextField.setBounds(300,340,400,30);
	   emailTextField	.setFont(new Font("Raleway",Font.BOLD,14));
	   	 add(emailTextField);
//============================================For Marital:	
		JLabel marital =new JLabel("Marital status:");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		JRadioButton married = new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		//For female button
		JRadioButton unmarrired= new JRadioButton("Unmarried");
	     unmarrired.setBounds(450,390,120,30);
		unmarrired.setBackground(Color.WHITE);
		add(unmarrired);
		
		JRadioButton other = new JRadioButton("Other");
		other.setBounds(630,390,120,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		//To choose any one button
		ButtonGroup maritalGroup = new ButtonGroup();
		maritalGroup.add(married);
		maritalGroup.add(unmarrired);
		maritalGroup.add(other);
//============================================For Address:	
		JLabel address =new JLabel("Address:");
		address.setFont(new Font("Raleway",Font.BOLD,20));
		address.setBounds(100,440,200,30);
		add(address);
		
	   	JTextField addressTextField = new JTextField();
	   	addressTextField.setBounds(300,440,400,30);
	   	addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
	   	 add(addressTextField);
//============================================For City:	
		JLabel city =new JLabel("City:");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
	   	JTextField cityTextField = new JTextField();
	   	cityTextField.setBounds(300,490,400,30);
	   	cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
	   	 add(cityTextField);
//============================================For Name:	
		JLabel state =new JLabel("state:");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
	   	JTextField stateTextField = new JTextField();
	   stateTextField	.setBounds(300,540,400,30);
	   	stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
	   	 add(stateTextField);
//============================================For Name:	
		JLabel pincode  =new JLabel("Pincode:");
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
	   	JTextField pincodeTextField = new JTextField();
	  pincodeTextField.setBounds(300,590,400,30);
	   pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
	   	 add(pincodeTextField);
//============================================================	 
	   	 JButton next = new JButton("Next");
	   	 next.setBackground(Color.BLACK);
	   	 next.setForeground(Color.WHITE);
	   	 next.setFont(new Font("Raleway" , Font.BOLD,14));
	   	 next.setBounds(620,640,80,30);
	   	 add(next);
	   	 
		//For Changing the color of Frame background
		getContentPane().setBackground(Color.WHITE);
//===============================================		
		//For creating Singnup Frame
		setSize(750,700);
		setLocation(350,10);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Signup_one();
	}

}
