package week3.day1.assignment5;


public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("Axis Bank Deposit account");
	}
	public static void main(String[] args) {
		AxisBank axisBank = new AxisBank();
		axisBank.deposit();
		axisBank.saving();
		axisBank.fixed();

	}

}
