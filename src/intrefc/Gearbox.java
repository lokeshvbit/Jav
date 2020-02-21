package intrefc;

public class Gearbox {
	
	
	private boolean cluthIsIn;
	
	public void operateClutch(String inOrOut) 
	{
		this.cluthIsIn =inOrOut.contentEquals("In");
	}

	
	public void operateClutch(boolean inOrOut) 
	{
		this.cluthIsIn =inOrOut;
	}
	
}
