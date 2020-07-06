package week1.day1;

public class Factorial {
	int input = 5;
	int output = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Factorial obj = new Factorial();
	obj.factorial();
	}
	void factorial() {
		for (int i=1; i<=input; i++) {
			output = i*output;
		}
		System.out.println(output);
	}
}
