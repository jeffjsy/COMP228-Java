package LabThree;

public class Life extends Insurance {

	public Life(String insuranceType, double monthlyCost) {
		super(insuranceType, monthlyCost);
	}
	

	@Override
	public double setInsuranceCost() {
		return monthlyCost = 30;		
	}

	@Override
	public void displayInfo() {		
		System.out.println("Cost for life insurance: $" + monthlyCost);		
	}

}
