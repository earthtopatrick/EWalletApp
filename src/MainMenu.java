import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainMenu implements ActionListener{
	public int expenses;
	private int income;

 JFrame frame = new JFrame();
 JButton addExpense = new JButton("Add an Expense");
 JButton addMonthlyIncome = new JButton ("Add Monthly Income");
 JButton printExpenseReport = new JButton ("Print Expense Report");
 JButton printIncomeReport = new JButton ("Print Income Report");
 JButton updateMonthlySaving = new JButton("Print Monthly Savings");
 JButton Dollar = new JButton ("Dollars (USD)");
 JButton Euro = new JButton("Euros (EUR)");
 JButton Yen = new JButton ("Yen (JPY)");
 JButton PoundSterling = new JButton ("Pound Sterling (GBP)");
 JButton CanadianDollar = new JButton ("Canadian Dollars (CAD)");
 JButton AustralianDollar  = new JButton ("Australian Dollars (AUD)");
 JTextField currentBalance = new JTextField();
 JTextField newBalance = new JTextField();
 MainMenu(){
	 
  frame.setTitle("Main Menu");
  frame.setSize(400,400);
  
  JLabel label;
  label = new JLabel("Current Balance");
  label.setBounds(30, 15, 100, 30);
  
  JLabel label2;
  label2 = new JLabel("New Balance");
  label2.setBounds(30, 15, 100, 30);
  
  
  currentBalance.setBounds(135, 15, 200, 30);
  
  CanadianDollar.setBounds(340,15,180,30);
  CanadianDollar.setFocusable(false);
  CanadianDollar.addActionListener(this);
  
  AustralianDollar.setBounds(510,15,180,30);
  AustralianDollar.setFocusable(false);
  AustralianDollar.addActionListener(this);
  
  PoundSterling.setBounds(680,15,160,30);
  PoundSterling.setFocusable(false);
  PoundSterling.addActionListener(this);
  
  Dollar.setBounds(370,40,120,30);
  Dollar.setFocusable(false);
  Dollar.addActionListener(this);
  
  Euro.setBounds(540,40,120,30);
  Euro.setFocusable(false);
  Euro.addActionListener(this);
  
  Yen.setBounds(700,40,120,30);
  Yen.setFocusable(false);
  Yen.addActionListener(this);
  
  addExpense.setBounds(260,180,200,40);
  addExpense.setFocusable(false);
  addExpense.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent h) {
	  int expense = 5; //USER INPUT HERE;
	  					//currently when addExpense Button clicked
						//will add 5 to user expense by calling setExpenses
	  setExpenses(expense); 
	  }
});

  addMonthlyIncome.setBounds(480,180,200,40);
  addMonthlyIncome.setFocusable(false);
  addMonthlyIncome.addActionListener(new ActionListener(){
	  public void actionPerformed(ActionEvent g) {
		  int incomeAmount = 10; //USER INPUT HERE;
		  						//currently when addMonthlyIncome Button clicked
		  						//will add 10 to user income by calling setIncome
		  setIncome(incomeAmount);
	  }
  });
  
  printExpenseReport.setBounds(260,240,200,40);
  printExpenseReport.setFocusable(false);
  printExpenseReport.addActionListener(this);
  
  printIncomeReport.setBounds(480,240,200,40);
  printIncomeReport.setFocusable(false);
  printIncomeReport.addActionListener(this);
  
  updateMonthlySaving.setBounds(370, 300, 200, 40);
  updateMonthlySaving.setFocusable(false);
  updateMonthlySaving.addActionListener(new ActionListener(){
	  public void actionPerformed(ActionEvent f) {
		  
		  System.out.println(updateSaving());//calls updateSaving method in MainMenu class
		  										//int of total savings is returned and printed to console
	  }
  });
 
 
 
  frame.setLayout(null);
  frame.add(label);
  frame.add(currentBalance);
  frame.add(CanadianDollar);
  frame.add(AustralianDollar);
  frame.add(PoundSterling);
  frame.add(Dollar);
  frame.add(Euro);
  frame.add(Yen);
  frame.add(addExpense);
  frame.add(addMonthlyIncome);
  frame.add(printExpenseReport);
  frame.add(printIncomeReport);
  frame.add(updateMonthlySaving);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setPreferredSize(new Dimension(1000, 600));
  frame.pack();
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);

 }
 
 
 
 //@Override
 public void actionPerformed(ActionEvent e) { //consider renaming to "CanadianDollarButton or CanadianDollarBtn"
	 if(e.getSource() == CanadianDollar) { //To convert USD to CAD, multiply given value in USD by 1.29
		String amount = currentBalance.getText();
		Integer.parseInt(amount);
		int dollar = Integer.parseInt(amount);
		double canadianDollar = dollar * 1.29;
		
	 }
	 
 }
 
 public void setExpenses(int expense) {//sets user expenses; call every time new expense added
	 expenses += expense;
 }
 
 public void setIncome(int incomeAmount) {//sets user income; call every time new income added
	 income += incomeAmount;
 }
 
 public int getExpenses() {//returns user expenses
	 return expenses;
 }

 
 public int getIncome() {//returns user income
	 return income;
 }
 
 public int updateSaving() {//updates and returns user savings
	 
	 updateMonthlySavings bloop = new updateMonthlySavings();//funny ref name lol
	 
	 int totSavings = bloop.updateSavings(getExpenses(), getIncome());//calls updateSavings method in updateMonthlySavings class
	 																	//uses getExpenses,Income methods in Main Menu
	 																	//to update user savings and returns value
	 
	 return totSavings;
	 
 }
 
 
}

//Add commment for trial

