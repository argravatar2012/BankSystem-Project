package BankSystem;

public class Log {

	private long timestamp;
	private int clientId;
	private String description;
	private float amount;

	public Log(long timestamp, String description, float amount, int clientId) { // <<< Constructor
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	public String getData() {
		return ("timestamp= " + timestamp + "description= " + description
				+ "amount= " + amount + "clientId= " + clientId);
	}

}
