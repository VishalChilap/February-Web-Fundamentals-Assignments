package AssignementMar01;
import java.util.*;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		computeReverseNumber(num);

	}
	static void computeReverseNumber(int a){
		int rem; 
		while(a>0) {
			rem = a%10;
			System.out.print(rem);
			a = a/10;
		}
	}

}
