package AssignementMar09;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][] = {{0,0,1,0},{5,0,8,0},{6,0,0,2}};
		int n1 = a.length;
		int n2 = a[0].length;
		int size = n1*n2;
		int count = 0;
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(a[i][j]==0) {
					count++;
				}
			}
		}
		if(count>size/2) {
			System.out.println("It is Sparse matrix");
		}
		else {
			System.out.println("It is not Sparse matrix");
		}

	}

}
