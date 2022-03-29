
public class MatrixScalarMultiplication {
	public static void main(String[] args){
        

        //TODO Auto-generated method stub
        double x = 2;
            double[][] y = {{1, 2}, {3, 4}};
    double[][] product = scalar_multiplication(x, y);
    for (double[] row : product) {
        for (double item : row) {
            System.out.print (item + " ");
        }
        System.out.println();
    }
}
// [ 1 2]            [2 4]
// [ 3 4] * 2         [6 8]
    public static double[][] scalar_multiplication (double x, double[][] y){
        double[][] product = new double[y.length][y[0].length];
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                product[i][j] = y[i][j] * x;
            }
}
        return product;
    }

}
