import java.util.Scanner;
public class J08_ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double inputNumber; 
		String inputText;
		
		try {
			System.out.print("nextInt() Demo\nPlease enter an number: ");
			inputNumber = in.nextDouble();
			System.out.println("You entered " + inputNumber);
			
			System.out.print("\nnext() Demo\nPleaseenter another number: ");
			inputText = in.next();
			inputNumber = Double.parseDouble(inputText);
			System.out.println("You entered " + inputNumber + " this time. ");
		} catch(Exception ex) {
			System.out.println(ex.getClass());
		}
	}

}
