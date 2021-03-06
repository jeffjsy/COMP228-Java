package LabTwo;
import java.util.*;

public class LottoTest {

	public static void main(String[] args) {
		
		int gameCount = 6; // Keeps track of number of rounds 
		
		while (gameCount > 1 ) { // Game loop
			
			int userGuess = 0;
			Lotto lotto = new Lotto();		 
			
			Scanner input = new Scanner(System.in);		
			System.out.printf("Please guess an integer between 3 and 27: ");		
			try {  					
				userGuess = input.nextInt();  
			} catch (Exception e) { // Validate input
				System.out.println("Please enter an integer");
				Lotto.sum = 0;
				continue; // Invalid inputs don't count as a valid guess 
			}
			
			gameCount--;
			if (Lotto.sum == userGuess) { // If user guesses correctly, end loop
				System.out.printf("%nCorrect!%n");				
				Lotto.DisplayArray(lotto);				
				input.close();
				gameCount = 1;
			} else if (gameCount == 1) { // Game ends after 5 rounds
				System.out.printf("%nComputer Wins%n");
				Lotto.DisplayArray(lotto);				
				input.close();
			} else {
				System.out.printf("Please try again. %n ");
				Lotto.DisplayArray(lotto);
				Lotto.sum = 0;				
			}			
			
			
		}
		
	}	
}
