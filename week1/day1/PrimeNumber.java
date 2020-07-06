package week1.day1;

public class PrimeNumber {
	int num = 16;
	boolean flag = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj = new PrimeNumber();
		obj.primenumber();
	}
	void primenumber() {
		for (int i=2; i<=num/2; i++) {
			if (num%i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}
}
