package lesson2ex2;

public class Account {
	private double balance;
	
	private String name;
	
	public double getBalance() {		
		return balance;		
	}
	
	public void setBalance(double balance) {		
		this.balance = balance;
	}
	
	//constructor initializes the object
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
} // end of class
