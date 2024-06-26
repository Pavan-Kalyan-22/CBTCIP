package bankproject;
import java.awt.*;
import java.awt.Font;
import java.awt.Image; //used when fix the  get scaled default line no:12
import java.awt.event.*;

import javax.swing.*;

public class BankLogin extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JButton login,signup,clear;
	JTextField cardTextField,pinTextField;
	

	BankLogin(){
		setLayout(null);
		
		setTitle("Transaction Managment");
		ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); //icon
		Image i2 = il.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT); // size of image
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(60,10,100,100); // icon position
		add(label);
		
		
		// Title
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward",Font.BOLD, 38));
		text.setBounds(200,40,400,40); // left right width height for the text
		add(text);
		
		//card num
		
		JLabel cardnum = new JLabel("Card No:");
		cardnum.setFont(new Font("Raleway",Font.BOLD, 28));
		cardnum.setBounds(120,150,400,30); // x axis y axis width height for the text
		add(cardnum);
		
		// textfield for cardnum
		
	    cardTextField = new JTextField();
		cardTextField.setBounds(300,150,230,30);
		cardTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(cardTextField);
		
		//pin
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway",Font.BOLD, 28));
		pin.setBounds(120,220,250,30); // left right width height for the text
		add(pin);
		
	// textfield for PIN
		
	    pinTextField = new JPasswordField();
		pinTextField.setBounds(300,220,230,30);
		pinTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(pinTextField);
		
		//login button
		
		login = new JButton("LOGIN");
		login.setBounds(300,300,100,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		//clear button
		
				 clear = new JButton("CLEAR");
				clear.setBounds(430,300,100,30);
				clear.setBackground(Color.BLACK);
				clear.setForeground(Color.WHITE);
				clear.addActionListener(this);
				add(clear);
				
				//signup button
				
				 signup = new JButton("SIGN UP");
				signup.setBounds(300,350,230,30);
				signup.setBackground(Color.BLACK);
				signup.setForeground(Color.WHITE);
				signup.addActionListener(this);
				add(signup);
		
		
		getContentPane().setBackground(Color.gray); // background color
		
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
		
	}
	//functions for buttons 
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		}else if(ae.getSource()== login) {
			
		}else if(ae.getSource()== signup) {
			
		}
		
		
	}
	
	public static void main(String args[]) {
		new BankLogin();
	}
}
