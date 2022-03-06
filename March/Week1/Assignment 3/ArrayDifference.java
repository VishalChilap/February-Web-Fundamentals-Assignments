package AssignementMar03;

public class ArrayDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {4,5,9,6,8,47,6};
		int n1 = arr1.length;
		int [] arr2 = {5,8,1,6,2,4,3};
		int n2 = arr2.length;

		int c = n1>n2? n1 : n2;
		for (int i=0;i<c;i++) {
			int result = arr1[i]-arr2[i];
			System.out.print(result+" ");
		}
		
	}

}
