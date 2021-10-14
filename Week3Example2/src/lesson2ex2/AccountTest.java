package lesson2ex2;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 100.00);
		
		Account account2 = new Account("John Blue", 50.95);
		
		System.out.printf( "Account 1 name is '%s'%n", account1.getName());
		System.out.printf( "Account 1 balance is $%s%n%n", account1.getBalance());
		
		System.out.printf( "Account 2 name is '%s'%n", account2.getName());
		System.out.printf( "Account 2 balance is $%s%n%n", account2.getBalance());
		
	}

}
