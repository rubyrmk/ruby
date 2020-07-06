package week1.day2;

public class DuplicatesInArray {
	int [] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicatesInArray obj = new DuplicatesInArray();
		obj.duplicates();
	}
	void duplicates() {
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(arr[i]  +" : "+ "Duplicated"+ " : " +count +" "+"times");
				count = 0;
			}
		}
	}
}
