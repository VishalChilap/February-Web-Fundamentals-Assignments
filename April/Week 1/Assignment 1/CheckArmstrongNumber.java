package AssignementApril04;

import java.util.Scanner;

public class CheckArmstrongNumber {
	static boolean checkNumber(int num) {
		boolean result = false;
		int sum = 0;
		int rem;
		int a = num;
		while(num>0) {
			rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
		if(sum==a) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		boolean ans = checkNumber(num);
		System.out.println("Given number is armstrong number ? "+ans);


	}

}
