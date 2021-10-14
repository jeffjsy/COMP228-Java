
public class Singers 
{
	
	private int singerID;	
	private String singerName;
	private String singerAddr;
	private String singerDOB;
	private int albumsPublished;
	
	public Singers()
	{ //No Argument class constructor
		
	}
	
	public Singers(int singerID) 
	{ //One argument constructor
		this.singerID = singerID;
	}
	
	public Singers(int singerID, String singerName) 
	{ //Two argument constructor
		this.singerID = singerID;
		this.singerName = singerName;
	}
	
	public Singers(int singerID, String singerName, String singerAddr) 
	{ //Three argument constructor
		this.singerID = singerID;
		this.singerName = singerName;
		this.singerAddr = singerAddr;
	}
	
	public Singers(int singerID, String singerName, String singerAddr, String singerDOB) 
	{ //Four argument constructor
		this.singerID = singerID;
		this.singerName = singerName;
		this.singerAddr = singerAddr;
		this.singerDOB = singerDOB;		
	}
	
	public Singers(int singerID, String singerName, String singerAddr, String singerDOB, int albumsPublished) 
	{ //Five argument constructor
		this.singerID = singerID;
		this.singerName = singerName;
		this.singerAddr = singerAddr;
		this.singerDOB = singerDOB;
		this.albumsPublished = albumsPublished;		
	}
	
	
	//get and set for singerID
	public int getSingerID() {
		return singerID;
	}
	
	public void setSingerID(int newSingerID) {
		this.singerID = newSingerID;
	}
	
	//get and set for singerName
	public String getSingerName() {
		return singerName;		
	}
	
	public void setSingerName(String newSingerName) {
		this.singerName = newSingerName;
	}
	
	//get and set for singerAddr
	public String getSingerAddr() {
		return singerAddr;
	}
	
	public void setSingerAddr(String newSingerAddr) {
		this.singerAddr = newSingerAddr;
	}
	
	//get and set for singerDOB
	public String getSingerDOB() {
		return singerDOB;
	}
	
	public void setSingerDOB(String newSingerDOB) {
		this.singerDOB = newSingerDOB;
	} 
	
	//get and set for albumsPublished
	public int getAlbumsPublished() {
		return albumsPublished;
	}
	
	public void setAlbumsPublished(int newAlbumsPublished) {
		this.albumsPublished =  newAlbumsPublished; 
	}
	
	//setter for all instance variables
	public void setAllVariables(int newSingerID, String newSingerName, String newSingerAddr, String newSingerDOB, int newAlbumsPublished) {
		this.singerID = newSingerID;
		this.singerName = newSingerName;
		this.singerAddr = newSingerAddr;
		this.singerDOB = newSingerDOB;
		this.albumsPublished = newAlbumsPublished;
	}
	
	

	public static void main(String[] args) 
	{
		//singer object with no arguments
		Singers singer1 = new Singers();
		System.out.println("Singer ID: " + singer1.singerID);
		System.out.println("Singer Name: " + singer1.singerName);
		System.out.println("Singer Address " + singer1.singerAddr);
		System.out.println("Singer Birthday: " + singer1.singerDOB);
		System.out.println("Albums Published: " + singer1.albumsPublished + "\n");
		
		//singer object with all arguments
		Singers singer2 = new Singers();
		singer2.setAllVariables(777, "Jerry Seinfeld", "177a Bleecker Stret, NY", "Sept 10, 1969", 3);
		System.out.println("Singer ID: " + singer2.singerID);
		System.out.println("Singer Name: " + singer2.singerName);
		System.out.println("Singer Address " + singer2.singerAddr);
		System.out.println("Singer Birthday: " + singer2.singerDOB);
		System.out.println("Albums Published: " + singer2.albumsPublished + "\n");
		
		//singer object with individual setters
		Singers singer3 = new Singers();
		singer3.setSingerID(2837);
		singer3.setSingerName("Lebron James");
		singer3.setSingerAddr("123 Fake Street, ON");
		singer3.setSingerDOB("December 30, 1984");
		singer3.setAlbumsPublished(2);
		System.out.println("Singer ID: " + singer3.singerID);
		System.out.println("Singer Name: " + singer3.singerName);
		System.out.println("Singer Address " + singer3.singerAddr);
		System.out.println("Singer Birthday: " + singer3.singerDOB);
		System.out.println("Albums Published: " + singer3.albumsPublished);
		
	}

}



