package AssignementMar10;
import java.util.*;

public class UsingTrowKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		try {
			if(n2==0) {
				throw new ArithmeticException("Second number is 0");
			}
			else {
				System.out.println("result is "+n1/n2);
			}
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		
	}

}
