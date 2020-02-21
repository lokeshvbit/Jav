package practice;

public class bool {

	 static boolean aIsBigger(int a,int b)
		{
			if(a>b && (a-b)>=2)
			{
				return true;
			}
			return false;
		}
		
		public static void main(String[] args)
		{
			System.out.println(aIsBigger(2,1));
		}
		
}





