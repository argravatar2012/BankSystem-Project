package BankSystem;

public class Logger {

	private String driverName;

	public Logger(String driverName) { // <<< Constructor
		this.setDriverName(driverName);
	}

	public void log (Log Log){
		System.out.println(Log);
	}
	
	public Log[] getLogs(){
		return null;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
