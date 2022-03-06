package AssignementMar04;
import java.util.Scanner;

public class StringRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the word which you wan't to remove from string");
		String s2 = sc.nextLine();
		
		int i = s1.indexOf(s2);
		if(i>-1) {
			int n = s2.length();
			StringBuffer sb = new StringBuffer(s1);
			sb.delete(i, i+n);
			System.out.println("The string after removing word is : "+sb);
		}
		else {
			System .out.println("Enter word is not present in string");
		}
		
	}

}
