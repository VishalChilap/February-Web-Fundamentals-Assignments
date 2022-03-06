package AssignementMar03;
import java.util.*;

public class ArraySwapTwoNumberMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {45,56,26,89,63,75};
		int n = a.length;
		NumberSwap(a,n);

	}
	public static void NumberSwap(int [] a,int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first index number");
		int i1 = sc.nextInt();
		System.out.println("Enter the second index number");
		int i2 = sc.nextInt();
		
		int num1 = a[i1];
		System.out.println("Number before swapping a = "+num1);

		int num2 = a[i2];
		System.out.println("Number before swapping b = "+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Number after swapping a = "+num1);
		System.out.println("Number after swapping b = "+num2);
		
	}

}
