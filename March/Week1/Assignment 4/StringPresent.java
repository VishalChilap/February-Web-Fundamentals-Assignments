package AssignementMar04;
import java.util.*;
public class StringPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word");
		String s1 = sc.nextLine();
		System.out.println("Enter the word which you find");
		String s2 = sc.nextLine();
		boolean isfound = false;
		for (int i=0;i<s1.length();i++) {
			int k = i;
			int count = 0;
			for (int j=0;j<s2.length();j++) {
				if(s1.charAt(k)!= s2.charAt(j)) {
					break;
				}
				else {
					count++;
					k++;
				}
			}
			if(count == s2.length()) {
				isfound = true;
				break;
			}
		}
		if(isfound) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not found");
		}

	}

}
