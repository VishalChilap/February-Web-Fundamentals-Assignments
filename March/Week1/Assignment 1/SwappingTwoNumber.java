package AssignementMar01;
import java.util.*;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		computSwapping(a,b);

	}
	static void computSwapping(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping a = "+a);
		System.out.println("After swapping b = "+b);

	}

}
