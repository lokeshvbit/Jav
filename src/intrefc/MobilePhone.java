package intrefc;

public class MobilePhone implements ITelephone {

	private int MyNumber;
	private boolean isRinging;
	private boolean isOn=false;

	public  MobilePhone(int MyNumber) {
		
		this.MyNumber =MyNumber;
		
	}

	

	@Override
	public void powerOn() {
		isOn =true;
		System.out.println("Switch on the mobile");

	}

	@Override
	public void dail(int PhoneNumber) {
		if (isOn) {

			System.out.println(" Enter the Mobile Number now " + PhoneNumber);
		} else {
			System.out.println("Phone is Switch off");
		}
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println(" Answer DeskPhone");
			//isRinging = false;
		}

	}

	@Override
	public boolean callPhone(int phoneNumber) {

		if (phoneNumber == MyNumber && isOn) {
			isRinging = true;
			System.out.println("Medlody Ring");
		} else {
			isRinging = false;
			System.out.println("MobilePhoneGot Switch off");
		}
		return isRinging;
	}

	@Override
	public boolean isRining() {

		return isRinging;
	}

}
