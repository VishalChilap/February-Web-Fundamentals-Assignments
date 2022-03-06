package AssignementMar03;
import java.util.*;

public class IndexAtWhichElementPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int [] arr = {10,20,60,5,50,78,64,89};
		int n = arr.length;
		boolean found = false;
		int index = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				found = true;
				index = i;
				break;
			}
		}
		if(found==true) {
			System.out.println("Present at index "+index);
		}
		else {
			System.out.println("Not present");
		}
				

	}

}
