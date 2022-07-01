import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.FlowLayout;

public class AddExpense implements ActionListener {
	
	JFrame frame = new JFrame();
	

	AddExpense(){
		 
		  frame.setTitle("Add an Expense");
		  frame.setSize(400,400);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(400,400);
		  frame.setLayout(null);
		  frame.setVisible(true);
		  frame.pack();
		 }
	
	/*@Override
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == Euro) {
			 System.out.println("Hi!");
		 }
			
		 }*/
}
//test