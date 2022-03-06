package AssignementFeb28;
import java.util.*;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		int result = computeMax(num1,num2,num3);
		System.out.println("Maximum number is "+result);

	}
	static int computeMax(int a, int b, int c) {
		int ans;
		if(a>b && a>c) {
			ans = a;
		}
		else if(b>a && b>c) {
			ans = b;
		}
		else {
			ans = c;
		}
		return ans;
	}

}
