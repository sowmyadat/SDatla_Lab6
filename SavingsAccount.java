
public class SavingsAccount extends BankAccount{
	private double rate = 2.5;
	private static int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber());
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
	
	public SavingsAccount(SavingsAccount pAccount, double amount) {
		super(pAccount.getOwner(), amount);
		this.rate = pAccount.getInterestRate();
		super.setAccountNumber(super.getAccountNumber());
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
	
	public double getInterestRate() {
		return rate;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void postInterest() {
		deposit(getBalance() * getInterestRate()/100);
		System.out.printf("After monthly interest has been posted, balance = $%.2f\n", getBalance());
	}
	
	
	
	
}
