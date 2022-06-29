import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class EWalletApp {

	public static void main(String[] args) {

		login();
		
		//adding comment for trial pull request

	}

	public static void login() {

		JFrame frame = new JFrame("Login");
		frame.setSize(400, 400);
		frame.setResizable(true);
		JLabel labelOne, labelTwo;

		labelOne = new JLabel("Username");
		labelOne.setBounds(30, 15, 100, 30);

		labelTwo = new JLabel("Password");
		labelTwo.setBounds(30, 50, 100, 30);

		JTextField user = new JTextField();
		user.setBounds(110, 15, 200, 30);

		JTextField pass = new JPasswordField();
		pass.setBounds(110, 50, 200, 30);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(130, 90, 80, 25);
	
	   loginButton.addActionListener(new ActionListener() {
		 
		   public void actionPerformed(ActionEvent e){ 
			   
		        String username = user.getText(); 
		        String password = pass.getText(); 
		         
		        if(username.equals("")) //If username is null
		        {
		            JOptionPane.showMessageDialog(null,"Please enter username"); 
		        } 
		        else if(password.equals("")) //If password is null
		        {
		            JOptionPane.showMessageDialog(null,"Please enter password"); 
		        }
		        else 
		        {
		        	MainMenu launchPage = new MainMenu();
		        	frame.dispose();
		        }
		 
		        
		      }
		   
});

		frame.setVisible(true);
		frame.add(labelOne);
		frame.add(labelTwo);
		frame.add(user);
		frame.add(pass);
		frame.add(loginButton);
		frame.pack();
	}
}
