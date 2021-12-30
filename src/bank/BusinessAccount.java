package bank;

public class BusinessAccount extends Business implements AccountService {

	public BusinessAccount( Integer number, String holder, Double initialDeposit) {
		super( number, holder, initialDeposit);
	}

	@Override
	public void deposit(double amount) {
		balance += amount;

	}

	@Override
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

}
