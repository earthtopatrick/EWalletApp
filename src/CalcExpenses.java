public class ExpenseCalculator implements Expenser{


	public ExpenseCalculator (User u) {
		userAtHand = u;

	}


	public User userAtHand;



	@Override
	public void addExpense(Expense Ex) {
	@@ -21,24 +27,32 @@ public void addExpense(Expense Ex) {

	@Override
	public void addMonthlyIncome(Wage W) {
		userAtHand.Income.add(W);
		// TODO Auto-generated method stub

	}

	@Override
	public void PrintFullreport() {

		PrintExpensereport();
		PrintIncomereport();


		// TODO Auto-generated method stub

	}

	@Override
	public void PrintExpensereport() {
		System.out.println(userAtHand.Spending);
		// TODO Auto-generated method stub

	}

	@Override
	public void PrintIncomereport() {
		System.out.println(userAtHand.Income);
		// TODO Auto-generated method stub

	}
