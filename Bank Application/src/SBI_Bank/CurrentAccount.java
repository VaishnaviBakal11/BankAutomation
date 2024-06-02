package SBI_Bank;

public class CurrentAccount extends Account
{
	static double overdraftAmount;



	public static double getOverdraftAmount() {
		return overdraftAmount;
	}

	public static void setOverdraftAmount(double overdraftAmount) {
		CurrentAccount.overdraftAmount = overdraftAmount;
	}

	static
	{
		overdraftAmount = -30000;
	}

	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}



	public CurrentAccount(int accountNumber,String pass, String accountHolderName, double balance) {
		super(accountNumber, pass , accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean withdraw(double amount)
	{
		if(this.balance - amount >= overdraftAmount)
		{
			this.balance -= amount;
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public double calculateIntrest()
	{
		return 0;
	}



}

