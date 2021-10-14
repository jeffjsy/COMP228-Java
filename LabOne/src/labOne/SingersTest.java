package labOne;

public class SingersTest {

	public static void main(String[] args) 
	{
		//singer object with no arguments
		Singers singer1 = new Singers();
		System.out.println("Singer ID: " + singer1.getSingerID());
		System.out.println("Singer Name: " + singer1.getSingerName());
		System.out.println("Singer Address " + singer1.getSingerAddr());
		System.out.println("Singer Birthday: " + singer1.getSingerDOB());
		System.out.println("Albums Published: " + singer1.getAlbumsPublished() + "\n");
				
		//singer object with all arguments
		Singers singer2 = new Singers();
		singer2.setAllVariables(777, "Jerry Seinfeld", "177a Bleecker Stret, NY", "Sept 10, 1969", 3);
		System.out.println("Singer ID: " + singer2.getSingerID());
		System.out.println("Singer Name: " + singer2.getSingerName());
		System.out.println("Singer Address " + singer2.getSingerAddr());
		System.out.println("Singer Birthday: " + singer2.getSingerDOB());
		System.out.println("Albums Published: " + singer2.getAlbumsPublished() + "\n");
				
		//singer object with individual setters
		Singers singer3 = new Singers();
		singer3.setSingerID(2837);
		singer3.setSingerName("Lebron James");
		singer3.setSingerAddr("123 Fake Street, ON");
		singer3.setSingerDOB("December 30, 1984");
		singer3.setAlbumsPublished(2);
		System.out.println("Singer ID: " + singer3.getSingerID());
		System.out.println("Singer Name: " + singer3.getSingerName());
		System.out.println("Singer Address " + singer3.getSingerAddr());
		System.out.println("Singer Birthday: " + singer3.getSingerDOB());
		System.out.println("Albums Published: " + singer3.getAlbumsPublished());

	}

}
