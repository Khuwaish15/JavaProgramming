import java.util.Scanner;
public class MultiplyMatrices {
	public static double[][] MultiplyMatrices(double[][] a, double[][] b) {
		int row1 = a.length;
		int row2 = b.length;
		int col1 = a[0].length;
		int col2 = b[0].length;
		if(col1 != row2) {
			return null;
		}
		double result[][] = new double[row1][col2];
		for(int i=0; i<row1; i++) {
		for(int j=0; j<col2; j++) {
		for(int k=0; k<col1;k++) {
			result[i][j] += (a[i][k]*b[k][j]);
			
		}
		}
		}
		

	return result;
	}
		static void readMatrix(double matrix[][]) {
			Scanner scan = new Scanner(System.in);
			for(int i=0; i<matrix.length; i++) {
				for ( int j=0; j<matrix.length;j++) {
					matrix[i][j]= scan.nextDouble();
					
				}
			}
			
		}
		static void printMatrix (double matrix[][]) {
			for(int i=0; i<matrix.length; i++) {
				for(int j=0; j<matrix[0].length; j++) {
					System.out.print(matrix[i][j] + "");
					
					
				}
				System.out.println();
				
			}
		}
		public static void main( String[] args) {
			double a[][] = new double [3][3];
			double b[][] = new double[3][3];
			System.out.println("Enter first matrix(3X3): ");
			readMatrix(a);
			System.out.println("Enter second matrix(3X3): ");
			readMatrix(b);
			double c[][] = MultiplyMatrices(a,b);
			System.out.println("Product of two matrices: ");
			printMatrix(c);
			
		}

}
