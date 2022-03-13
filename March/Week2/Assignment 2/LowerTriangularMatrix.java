package AssignementMar09;

public class LowerTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int n = a.length;
		int ans [][] = new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<=i) {
					ans[i][j]=a[i][j];
					System.out.print(ans[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
