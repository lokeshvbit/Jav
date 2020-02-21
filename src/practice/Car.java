package practice;

public class Car extends Vehical 
{
	
	int MaxSpeed = 180;
	
	void display() 
	{
		System.out.println(MaxSpeed);
	}

	public static void main(String[] args)
	{
		
		
		Car c = new Car();
		c.display();
		
	}
}


