package AssignementMar10;

import java.util.Scanner;

public class NestedTryImplemented {
	public static void divideInArray( int [] ar,int indx1,int indx2) {
		try {
			try {
				System.out.println("Element at index "+indx1+" is "+ar[indx1]);
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("My array out of bond");
			}		
			try{
				System.out.println("Division result is "+ar[indx1]/ar[indx2]);
			}
			catch(ArithmeticException ex) {
				System.out.println("My arithmetic exception");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Hello");
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
