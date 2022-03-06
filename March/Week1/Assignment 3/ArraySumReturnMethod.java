package AssignementMar03;

public class ArraySumReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {40,52,69,15,18,25,36,45,89};
		int n = arr.length;
		int result = computeArrSum(arr,n);
		System.out.println("Sum of array is "+result);
	}
	static int computeArrSum(int [] a, int b) {
		int sum = 0;
		for(int i=0;i<b;i++) {
			sum = sum+a[i];
		}
		return sum;
	}

}
