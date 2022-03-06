package AssignementMar03;
import java.util.*;

public class PresentAtLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int [] arr = {40,520,45,56,55,48,45,699,520};
		int n = arr.length;
		boolean found = false;
		int index = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				found = true;
				index = i;
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
