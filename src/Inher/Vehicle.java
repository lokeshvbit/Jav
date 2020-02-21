package Inher;

public class Vehicle {
	
	private String Name;
	private String Size;

	private int CurrentVelocity;
	private int CurrentDirection;
	
	
	public Vehicle(String Name, String Size) {
		this.Name = Name;
		this.Size = Size;   

		this.CurrentVelocity = 0;
		this.CurrentDirection = 0;

	}
	
	public void street(int direction) 
	{
		this.CurrentDirection+= direction;
		System.out.println("Vechical.steer()");
	}
	public void move(int velocity,int direction) 
	{		
			CurrentVelocity = velocity;
			CurrentDirection = direction;

		System.out.println("Vechical.steer()");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public int getCurrentVelocity() {
		return CurrentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		CurrentVelocity = currentVelocity;
	}

	public int getCurrentDirection() {
		return CurrentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		CurrentDirection = currentDirection;
	}
	
	
	
	
	

}
