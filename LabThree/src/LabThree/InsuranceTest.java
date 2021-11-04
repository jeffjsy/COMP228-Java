package LabThree;
import java.util.*;

public class InsuranceTest {

	public static void main(String[] args) {
		
		int menuChoice;
		Insurance[] insurances = new Insurance[2];
		boolean runLoop = true;
		
		Scanner input = new Scanner(System.in);
		
		while (runLoop == true) {
			System.out.println("Please enter '1' for health insurance, or '2' for life insurance. "
					+ "Enter '0' to reset and display default values");		
			menuChoice = input.nextInt();
			if (menuChoice == 1) {				
				System.out.printf("Enter a monthly cost for the health insurance: ");
				double cost1 = input.nextDouble();
				Health health = new Health("Health", cost1);
				health.displayInfo(); 
				insurances[0] = health;	
			} else if (menuChoice == 2) {
				System.out.printf("Enter a monthly cost for the life insurance: ");
				double cost2 = input.nextDouble();
				Life life = new Life("Life", cost2);
				life.displayInfo();
				insurances[1] = life;
			} else if (menuChoice == 0) {
				runLoop = false;
				for (Insurance currentInsurance : insurances) {   //running through array polymorphically 
					if (currentInsurance instanceof Health) {
						currentInsurance.setInsuranceCost();
						currentInsurance.displayInfo();
					}else if (currentInsurance instanceof Life) {
						currentInsurance.setInsuranceCost();
						currentInsurance.displayInfo();								
					}
				}
			}	
		}
		input.close();
	}
}