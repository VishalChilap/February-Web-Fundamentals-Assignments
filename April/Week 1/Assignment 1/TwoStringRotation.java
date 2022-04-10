package AssignementApril04;

public class TwoStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "deabc";
		
		int n1 = s1.length();
		int n2 = s1.length();
		
		if(n1==n2) {
			s1 = s1.concat(s1);
			if(s1.indexOf(s2)!=-1) {
				System.out.println("Two string are rotation of each other");
			}
			else {
				System.out.println("Two string are not a rotation of each other");
			}
			
		}
		else {
			System.out.println("Two string are not a rotation of each other");
		}

	}

}
