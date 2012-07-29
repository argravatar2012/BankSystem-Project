package BankSystem;

public class Account {

	private int id;
	private float balance;

	public Account(int id, float balance) {
		// super(); <<< because his not extended
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

}