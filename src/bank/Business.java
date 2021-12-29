package bank;

public class Business extends Account {

	private Integer number;
	private String holder;
	private Double balance;

	public Business(Account account, Integer number, String holder, Double initialDeposit) {
		super(account);
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
