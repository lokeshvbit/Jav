package Inher;

public class Car extends Vehicle {
	
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;
	
	
	public Car(String name, String size) 
	{
		super(name, size);
	}

}
