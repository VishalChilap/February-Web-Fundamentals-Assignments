package AssignementMar01;
import java.util.*;

public class FibonaciiSeriesreturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		computeFibonaciiSeries(n);

	}
	static void computeFibonaciiSeries(int n) {
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int count = 2;
		int sum;
		while(count<n) {
			sum = a+b;
			System.out.print(sum+" ");
			a = b;
			b = sum;
		}

	}

}
