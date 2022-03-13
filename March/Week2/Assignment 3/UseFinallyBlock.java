package AssignementMar10;

import java.util.Scanner;

public class UseFinallyBlock {
	public static void divideInArray( int [] ar,int indx1,int indx2) {
		try {
		System.out.println(ar[indx1]/ar[indx2]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Exception occured");
		}
		finally{
			System.out.println("Hii");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] ar = {1,2,0,4,5};
		System.out.println("Enter the index number");
		int indx1 = sc.nextInt();
		int indx2 = sc.nextInt();
		divideInArray(ar,indx1,indx2);
		
		System.out.println("Hello world");

	}

}
