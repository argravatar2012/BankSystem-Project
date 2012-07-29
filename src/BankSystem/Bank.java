package BankSystem;
	
public class Bank {
	
	private Client clients [] = new Client [100];
	private Logger logService = new Logger(null);
	private Logger logger = new Logger (null);
	private int updater;
	
	
	public Bank(BankSystem.Logger logService) {
		this.logService = logService;
	}
	
	public Bank(Client[] clients) {
		this.clients = clients;
	}
	
	public void setBalance(){
		
	}
	
	public float getBalance(){
		return updater;
		
	}
	
	public void addClient(Client client){
		for (int i=0; i<clients.length; i++){ // this find value inside the Arrays 
			if (this.clients[i] == null){ // until his find the null
		 	   this.clients[i] = client;
		 	   break; // & then break
			}
		}
	}
	
	public void removeClient (int id){
		for (int i=0; i<clients.length; i++){ // this find Client inside the clients,
			if (this.clients[i] != null && this.clients[i].getId() == id){ 
		 	   this.clients[i] = null; // then remove the Client and place null
		 	   break; 
			}
		}
	}
	
	public Client[] getClients() {
		return clients;
	}
	
	public void startAccountUpdater(){
		
	}
	
}
