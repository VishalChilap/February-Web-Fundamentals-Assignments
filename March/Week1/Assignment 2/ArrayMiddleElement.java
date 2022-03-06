package AssignementMar02;
import java.util.*;

public class ArrayMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int [] arr = new int [n];
		System.out.println("Enter the number");
		for (int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int a = (n/2);
		int result = arr[a];		
		System.out.println("The middle term in array is "+result);

	}

}
