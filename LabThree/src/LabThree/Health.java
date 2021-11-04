package LabThree;

public class Health extends Insurance {
	
	public Health(String insuranceType, double monthlyCost) {
		super(insuranceType, monthlyCost);
	}
	
	@Override
	public double setInsuranceCost() {
		return this.monthlyCost = 20;
	}

	@Override
	public void displayInfo() {		
		System.out.println("Cost for health insurance: $" + monthlyCost);		
	}

}
