
public class MatrixMultiplication {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		        double[][] x = {{1, 1}, {1, 1}};
		        double[][] y = {{1, 2}, {3, 4}};
		        double[][] product = matrix_multiplication(x, y);
		        for (double[] row : product) {
		            for (double item : row) {
		                System.out.print(item + " ");
		            }
		            System.out.println();
		        }
		    }

		    public static double[][] matrix_multiplication (double[][] a, double[][] b) {
		        double[][] product = new double[a.length][b[0].length];

		        for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < b[0].length; j++) {
		                for (int k = 0; k < a[i].length; k++) {
		                    product[i][j] += a[i][k] * b[k][j];
		                }
		            }
		        }

		        return product;
		}

}
