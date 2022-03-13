package AssignementMar08;

public class D2MatrriSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int b [][] = {{17,18,19,20},{21,22,23,24},{25,26,27,28},{29,30,31,32}};
		int n = a.length;
		int sum [][]= new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();

		}


	}

}
