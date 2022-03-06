package AssignementFeb28;
import java.util.*;
public class AddTwoNumberReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		int result = computesum(num1,num2);
		System.out.println("Sum of two number = "+result);

	}
	static int computesum(int a, int b) {
		int sum = a+b;
		return sum;
	}

}
