package week1.day1;

public class FibonacciSeries {
	int x = 8;
	int y = 0;
	int z=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries obj = new FibonacciSeries();
		obj.fibonacci();
	}
	void fibonacci() {
		for (int i=1; i<=x; i++) {
			System.out.println(y);
			int sum = y+z;
			y=z;
			z=sum;
		}
	}
}
