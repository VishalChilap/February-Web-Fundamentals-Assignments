package AssignementMar02;

import java.util.Scanner;

public class ArrayWithMultiplayingFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 10;
		System.out.println("Enter the multiplaying factor");
		int d = sc.nextInt();
		int [] num = new int[n];
		
		System.out.println("Enter the number");
		for(int i=0;i<n;i++) {
			num [i] = sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			int prod = num[j]*d;
			System.out.print(prod+" ");
		}

	}

}
