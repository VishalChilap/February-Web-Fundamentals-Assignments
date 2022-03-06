package AssignementMar02;

import java.util.Scanner;

public class ArrayCountOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int sum = 0;
		int count1 = 0;
		int count2 = 0;
		int [] num = new int[n];
		
		System.out.println("Enter the number");
		for(int i=0;i<n;i++) {
			num [i] = sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			if(num[j]%2==0) {
				count1++;
			}
			if(num[j]%2!=0) {
				count2++;
			}
		}
		System.out.println("All even number in arry is "+count1);
		System.out.println("All odd number in arry is "+count2);



	}

}
