package model.users;

public class GuestUser {
	
	private int generatedId;
	private static int counter =0;
	
	
	public int getGeneratedId() {
		
		return generatedId;
	}
	
	public void setGeneratedId() {
		counter++;
	}
	
	public GuestUser() {
		
	}
	
}
