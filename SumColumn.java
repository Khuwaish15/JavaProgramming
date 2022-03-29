import java.util.Scanner;
public class SumColumn {
	public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the dimensions of an nxm matrix:" );
        int n = stdin.nextInt();
        int m = stdin.nextInt();
        double[][] arr = new double[n][m];
        System.out.println("Enter the matrix of " +n+"x"+m);
        for(int i =0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j]= stdin.nextDouble();
            
        }
        

    }
        for(int j=0; j<m; j++) {
            System.out.print(sumColumn(arr,j) + "");
            
        }
    }
    public static double sumColumn(double[][] m, int c){
            double sum = 0;
            for(int i=0; i<m.length; i++) {
                sum += m[i][c];
            }
            return sum;
    }
         

}
