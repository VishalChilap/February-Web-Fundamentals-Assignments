package AssignementMar03;
import java.util.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number");
		int  num = sc.nextInt();
		int rem;
		int sum = 0;
		int i = 0;
		while(num>0) {
			rem = num%10;
			num = num/10;
			sum = sum+rem*(int) Math.pow(2,i);
			i++;
		}
		System.out.println("Decimal number of given binary number is "+sum);

	}

}
