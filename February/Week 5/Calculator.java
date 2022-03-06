package AssignementFeb28;
import java.util.*;

public class Calculator {
	public static int addition(int a,int b) {
		int sum = a+b;
		return sum;
	}
	public static int subtraction(int a,int b) {
		int diff = a-b;
		return diff;
	}
	public static int multiply(int a,int b) {
		int product = a*b;
		return product;
	}
	public static int divide(int a,int b) {
		int quo = a/b;
		return quo;
	}
	public static int average(int a,int b) {
		int sum = addition(a,b);
		int avg = sum/2;
		return avg;
	}
	public static int modulo(int a, int b) {
		int rem = a%b;
		return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		do {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the choice : 1:Addition, 2:Subraction, 3:Multiply, 4:Divide, 5:Average, 6:Modulo");
		int choice = sc.nextInt();
		int result;
			if(choice>=1 && choice<=6) {
				System.out.println("Enter the first number");
				int num1 = sc.nextInt();
				System.out.println("Enter the second number");
				int num2 = sc.nextInt();
				switch(choice) {
				case 1 :
					result = addition(num1,num2);
					System.out.println(result);
					break;
				case 2 :
					result = subtraction(num1,num2);
					System.out.println(result);
					break;
				case 3 :
					result = multiply(num1,num2);
					System.out.println(result);
					break;
				case 4 :
					result = divide(num1,num2);
					System.out.println(result);
					break;
				case 5 :
					result = average(num1,num2);
					System.out.println(result);
				case 6 :
					result = modulo(num1,num2);
					System.out.println(result);
				}		
			}
			else {
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to coninue Y/N");
			ch = sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');

	}

}
