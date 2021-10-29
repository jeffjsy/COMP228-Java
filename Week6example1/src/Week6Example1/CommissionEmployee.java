package Week6Example1;

public class CommissionEmployee {
	protected final String firstName; // protected variables can only be accessed by classes in this package and their extended members
	protected final String lastName;  // final is equivalent to 'constant'
	protected final String socialSecurityNumber;
	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		if (grossSales <0.0) {
			throw new IllegalArgumentException("Gross Sales must be greater than 0.0");
		}
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commision rate must be more than 0.0 and less than 1.0");		
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;	
	}
			
		
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be greater than 0.0");				
		}
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission Rate must be greater than 0.0 and less than 1.0");
		}
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public double earnings() {
		return commissionRate * grossSales;		
	}
	
	@Override public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate);				
	}
	
				
}
