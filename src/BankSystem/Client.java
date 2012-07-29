package BankSystem;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account accounts[] = new Account[5];
	private float commisionRate = 0F;
	private float interestRate = 0F;
	private Logger logger = new Logger(null);

	public Client(int id, float balance, String name) { // <<< Constructor
		//super(id, balance); <<<< because his not extended
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return this.balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return this.id;
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	public void addAccount(Account account){
		for (int i=0; i<accounts.length; i++){ // this find value inside the Arrays 
			if (this.accounts[i] == null){ // until his find the null
		 	   this.accounts[i] = account;
		 	   break; // & then break
			}
		}
	}
	
	public Account getAccount(int index){
		if (index < 0 || index >=accounts.length){ // return the account of null
			return null;
		}else{
			return this.accounts[index]; // return the account of index
		}
	}
	
	public void removeAccount (int id){
		for (int i=0; i<accounts.length; i++){ // this find Account inside the accounts,
			if (this.accounts[i] != null && this.accounts[i].getId() == id){ 
		 	   this.balance += this.accounts[i].getBalance(); // add to +=
		 	   this.accounts[i] = null; // then remove the Account and place null
		 	   break; 
			}
		}
	}
	
}

