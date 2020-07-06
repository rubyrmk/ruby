package week1.day1;

public class SumofDigits {
	int sum = 245;
	int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofDigits obj = new SumofDigits();
		obj.sumofdigits();
	}
	void sumofdigits() {
		while (sum !=0) {
			i=i+sum%10;
			sum=sum/10;
		}
		System.out.println(i);
	}
}
