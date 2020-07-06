package week1.day1;

public class ArmstrongNumber {
	int original = 153;
	int temp=original;
	int calculated=0, reminder;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber obj = new ArmstrongNumber();
		obj.armstrongnumber();
	}
	void armstrongnumber() {
		while (original>0) {
			reminder = original%10;
			original=original/10;
			calculated=calculated+(reminder*reminder*reminder);
		}
		if (calculated == temp) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
