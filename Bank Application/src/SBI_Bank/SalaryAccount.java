package SBI_Bank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class SalaryAccount extends SavingsAccount
{
	LocalDate lastTransactionDate;
	static float roi;

	static
	{
		roi=5;
	}

	public SalaryAccount() {
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(int accountNumber,String pass, String accountHolderName, double balance) {
		super(accountNumber, pass ,accountHolderName, balance);
		this.lastTransactionDate = LocalDate.of(2021, 4, 1);
	}

	public LocalDate getLastTransactionDate() {
		return lastTransactionDate;
	}
}
