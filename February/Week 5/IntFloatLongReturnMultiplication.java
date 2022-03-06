package AssignementFeb28;
import java.util.*;
public class IntFloatLongReturnMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer type number");

		int a = sc.nextInt();
		System.out.println("Enter the float type number");

		float b = sc.nextFloat();
		System.out.println("Enter the long type number");

		long c = sc.nextLong();
		double result = computeMultiply(a,b,c);
		System.out.println(result);

	}
	public static double computeMultiply(int a, float b, long c) {
		double pro = a*b*c;
		return pro;
	}

}
