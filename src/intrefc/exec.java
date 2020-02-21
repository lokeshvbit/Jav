package intrefc;

public class exec {
	
	public static void main(String[] args) {
		
		
		ITelephone timsphone;
		 timsphone = new Deskphone(123456);
		 timsphone.powerOn();
		 timsphone.callPhone(123456);
		 timsphone.answer();
		
		
		
		 timsphone = new MobilePhone(23652);
		 timsphone.powerOn();
		 timsphone.callPhone(23652);
		 timsphone.answer();
		
	}

}
