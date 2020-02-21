package practice;

public class prac {
	
	
	
	static void cc(int j) 
	{
		if(j<9) {
			
			System.out.println(j);
			//return;
		}
		
		++j;
		System.out.println(j);
	}
	 
	public static void main(String[] args) {
		
		prac.cc(5);
		
		System.out.println("Hi Loki");
	}

}
