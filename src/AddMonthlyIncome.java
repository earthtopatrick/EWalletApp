import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;
	import java.awt.FlowLayout;

public class AddMonthlyIncome implements ActionListener {
		
		JFrame frame = new JFrame();
		

		AddMonthlyIncome(){
			 
			  frame.setTitle("Add Income");
			  frame.setSize(400,400);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  frame.setSize(400,400);
			  frame.setLayout(null);
			  frame.setVisible(true);
			  frame.pack();
			 }