package LabThree;

public abstract class Insurance {
	// super class
	protected String insuranceType;
	protected double monthlyCost;	
	
	public Insurance(String insuranceType, double monthlyCost) {
		this.insuranceType = insuranceType;
		this.monthlyCost = monthlyCost;
	}
	
	public Insurance(double monthlyCost) {
		this.monthlyCost = monthlyCost;
	}
	
	public Insurance(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	public Insurance() {
		
	}
	
	
	public String getInsuranceType() {
		return insuranceType;
	}	
	
	public double getMonthlyCost() {
		return monthlyCost;		
	}
	
	public abstract double setInsuranceCost();
	
	public abstract void displayInfo();

	
	
	
	
}
