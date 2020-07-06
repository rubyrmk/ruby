package week1.day2;

public class ReverseString {
	String test = "feeling good";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString obj = new ReverseString();
		obj.reversestring();
	}
	void reversestring() {
		char [] ch = test.toCharArray();
		for (int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
