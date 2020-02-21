package practice;

public class switcht {
	
	
	
	public static void SwithStatement() {

		String day = "tue";
		
		String days="Today is "+day.toUpperCase();

		switch (day) {
		case "mon":
			System.out.println(days);
			break;

		case "tue":
			System.out.println(days);
			break;

		case "wen":
			System.out.println(days);
			break;
		case "thu":
			System.out.println(days);
			break;
		case "fri":
			System.out.println(days);
			break;

		default:
			System.out.println("not matched anything above");
		}
	}
		
		
	
	
	
	public static void swithWithNumbers() 
	{
		int i=5;
		String lol ="it's numbres us"+i;
		switch(i) 
		{
		case 1: System.out.println(lol);break;
		case 2: System.out.println(lol);break;
		case 3: System.out.println(lol);break;
		case 4: System.out.println(lol);break;
		case 5: System.out.println(lol);break;
		case 6: System.out.println(lol);break;
		
		}
	}
	
	
	
		public static void main(String[] args) {
			SwithStatement();
			
			switcht.swithWithNumbers();

	}
}
