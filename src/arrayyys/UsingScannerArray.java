package arrayyys;

import java.util.Scanner;

public class UsingScannerArray {
	
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] myIntegers = myIntegers(5);
		
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println(myIntegers[i]);
		}
		
		System.out.println("All the enter Values Sum is "+getAverage(myIntegers));
	}

	private static int[] myIntegers(int number) {
		
		System.out.println("Enter"+number+"integere value");
	
	int [] values = new int[number];
	
	for(int i=0;i<values.length;i++) 
	{
		values[i]= sc.nextInt();
	}
	return values;
	}

	
	
	
	
	
	public static double getAverage(int[] array) 
	{
		int sum =0;
		for (int i = 0; i < array.length; i++) {
			
			sum +=array[i];
			
		}
		return (double)sum/(double)array.length;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
