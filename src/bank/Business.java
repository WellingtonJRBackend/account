package bank;

public class Business implements AccountService{

	protected Integer number;
	protected String holder;
	protected double balance;

	public Business() {
	}

	public Business(  Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Business(Integer number, String holder, Double initialDeposit) {
		
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

	public String toString() {
		return "Number " + number + "," + " Holder: " + holder + ", Balance $ " + String.format("%.2f", balance);
	}

}
