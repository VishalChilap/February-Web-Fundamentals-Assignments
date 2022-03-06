package AssignementMar02;

import java.util.Scanner;

public class ArrayPritEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int [] num = new int[n];
		
		System.out.println("Enter the number");
		for(int i=0;i<n;i++) {
			num [i] = sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			if(num[j]%2==0) {
				System.out.print(num[j]+" ");
			}
		}

	}

}
