package LabTwo;
import java.util.*;

public class Lotto {
	public static int[] lottoNumbers = {0, 0, 0};
	public static int sum = 0;
		
	public Lotto() {
		
		Random random = new Random();		
		lottoNumbers[0] = (int)random.nextInt(10-1) + 1;
		lottoNumbers[1] = (int)random.nextInt(10-1) + 1;
		lottoNumbers[2] = (int)random.nextInt(10-1) + 1; //generate random numbers
		
		for (int i : lottoNumbers) { //sum the random numbers
			sum += i;
		}		
	}
	
	public static void DisplayArray(Lotto l) {
		System.out.printf("The numbers were: %s and the sum was [%s]%n", Arrays.toString(lottoNumbers), sum);		
	}
	
}

