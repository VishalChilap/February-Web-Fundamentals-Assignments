package AssignementApril04;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "dbac";
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		if(n1==n2) {
			int count = 0;
			for(int i=0;i<n1;i++) {
				for(int j=0;j<n1;j++) {
					if(arr1[i]==arr2[j]) {
						count++;
					}
				}
			}
			if(count==n1) {
				System.out.println("Two String are Anagram");
			}
			else {
				System.out.println("Two String are Not anagram");
			}
		}
		else {
			System.out.println("Two String are Not anagram");
		}

	}

}
