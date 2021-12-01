import java.util.Scanner;
public class ExceptionHandlingInJava {

	public static void main(String[] args) {
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		try {			
			
			System.out.print("Enter the first number : ");
			x = input.nextInt();
			
			System.out.print("Enter the second number: ");
			y = input.nextInt();
			
			System.out.print(x + " / " + y + " = " + (x/y));
			
			input.close();
		} catch (ArithmeticException e) {
			System.out.println("Denominator Cannot be Zero while dividing");
		} catch (Exception ex) {
			//generic exception handler which can handle all exceptions.			
			System.out.println(ex.getClass());
		} finally {		
			System.out.println("I am in 'finally' block");
		}
	}

}
