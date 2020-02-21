package intrefc;

public class Deskphone implements ITelephone {

	private int MyNumber;
	private boolean isRinging;

	public Deskphone(int i) {
		
	}

	

	@Override
	public void powerOn() {
		System.out.println("Switch on the mobile");

	}

	@Override
	public void dail(int PhoneNumber) {

		System.out.println(" Enter the Mobile Number now " + PhoneNumber);
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println(" Answer DeskPhone");
			isRinging = false;
		}

	}

	@Override
	public boolean callPhone(int phoneNumber) {

		if (phoneNumber == MyNumber) {
			isRinging = true;
			System.out.println("Ring Ring");
		} else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRining() {

		return isRinging;
	}

}
