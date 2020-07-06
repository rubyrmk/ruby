package week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {
	int [] arr = {1,2,3,4,7,8,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingElementsInArray obj = new MissingElementsInArray();
		obj.missingelements();
	}
	void missingelements() {
		Arrays.sort(arr);
		int temp = arr[0];
		for (int i=0; i<=arr.length-1; i++) {
			if((i+temp) != arr[i]) {
				System.out.println(i+temp);
				break;
			}
		}
	}
}
