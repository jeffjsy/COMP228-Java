package Week6Example1;


public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("bob", "lewis", "333-333-3333", 5000, .04, 300);
		
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("%n%s %s", "First name is", employee.getFirstName());		
		System.out.printf("%n%s %s", "Last name is", employee.getLastName());
		System.out.printf("%n%s %s", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%n%s %s", "Gross sales is", employee.getGrossSales());
		System.out.printf("%n%s %s", "Commission rate is", employee.getCommissionRate());
		System.out.printf("%n%s %s%n", "Base salary is", employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		System.out.printf("%n%s:%n%n%s%n", "Updated Employee information obtained by toString", employee.toString());
	}
}
