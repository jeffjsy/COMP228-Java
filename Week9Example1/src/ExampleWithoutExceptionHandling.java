import java.util.Scanner;

public class ExampleWithoutExceptionHandling {
	public static void main(String[] args) {
		double x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		x = input.nextDouble();
		
		System.out.print("Enter the second number: ");
		y = input.nextDouble();
		
		System.out.print(x + " / " + y + " = " + (x/y));
		
		input.close();
	}
}
