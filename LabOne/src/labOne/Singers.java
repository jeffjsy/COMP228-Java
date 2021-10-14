package labOne;

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
		
}
