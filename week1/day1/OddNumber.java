package week1.day1;

public class OddNumber {
	int input = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNumber obj = new OddNumber();
		obj.oddnumber();
	}
	void oddnumber() {
		for (int i=1; i<=input; i++) {
			int output = i%2;
			if (output == 1)
				System.out.println(i);
		}
	}
}
