package AssignementMar09;

public class FrequencyOfOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,15}};
		int n1 = a.length;
		int n2 = a[0].length;
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if((a[i][j]%2)==0) {
					count1++;
				}
				else {
					count2++;
				}
			}
		}
		System.out.println("The frequency of even number is "+count1);
		System.out.println("The frequency of odd number is "+count2);

	}

}
