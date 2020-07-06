package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	int [] data = {3,2,11,4,6,7};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSecondLargest obj = new FindSecondLargest();
		obj.secondlargest();
	}
	void secondlargest() {
		Arrays.sort(data);
		System.out.println(data[data.length-2]);
	}
}