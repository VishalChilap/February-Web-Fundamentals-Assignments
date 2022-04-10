package AssignementApril04;

import java.util.Scanner;

public class ArraySumEqualToGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,5,3,8,4,6,9,2,7};
		System.out.println("Enter the sum");
		int sum = sc.nextInt();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			//int a = arr[i];
			for(int j=0;j<n;j++) {
				//int b = arr[j];
				if(i!=j) {
					if(sum == arr[i]+arr[j]) {
						System.out.println(arr[i]+" "+arr[j]);
					}
				}
			}
		}


	}

}
