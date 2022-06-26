
public class SortedMatrix {
	public void search(int[][] matrix,int n,int x) {
		int i=0;
		int j=n-1;
		while(i<n && j>=0) {
			if(matrix[i][j]==x) {
				System.out.println("element found at "+i+","+j);
				return;
			}
			if(matrix[i][j]>x) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println("value not found");
	}
	public static void main(String[] args) {
		int[][] matrix= {
						 {11,13,15,16},
						 {21,23,25,26},
						 {31,33,35,36},
						 {41,43,45,46}
						};
		SortedMatrix sm=new SortedMatrix();
		sm.search(matrix,matrix.length,45);
		sm.search(matrix, matrix.length,32);
}
}