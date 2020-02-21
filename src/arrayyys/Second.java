package arrayyys;

import java.util.Scanner;

public class Second {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 int[] myIntegers = getIntegres(3);
		 
		 int[] sorted =sortInteger(myIntegers);
		 printArray(sorted);
		
		  
		
	}
	
	
	public static int[] getIntegres(int capacity) 
	{
		int[] array = new int[capacity];
		
		System.out.println("Enter"+capacity+" Integer value:\r");
		for (int i = 0; i < array.length; i++) {
			array[i] =sc.nextInt();
			
		}
		return array;
	} 
	
	
	public static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Element"+i+"Content"+array[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	 
	public static int[] sortInteger(int[] array) 
	{
		int[] sortedArray = new int[array.length];
	
		for (int i = 0; i < array.length; i++) {
			
			sortedArray[i] = array[i];
		}
		boolean flag = true;
		int temp;
		while(flag) {
			flag =false;
			for (int i = 0; i < array.length; i++) {
				
 
				{
					temp =sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] =temp;
					flag =true;
				}
				
			}
		}
		return sortedArray;
	}
	
	
	
	
	
	
	
	
}
