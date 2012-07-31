package BankSystem;

public class Tester {

	public static void main(String[] args) {
		Client c1 = new Client (1234, 100.5f, " String");
		Account a1 = new Account (11, 1000.70f);
		c1.addAccount(a1);
		c1.getAccount(1);
	}
}