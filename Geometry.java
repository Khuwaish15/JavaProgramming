import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double[][] points = new double [3][2];
        /** 
         = x1 y1
         x2 y2
         x3 y3
         */
        System.out.print("Enter x1, y1, x1, y2, x3, y3:");
        for (int i =0; i <3; i++) {
            for(int j = 0; j<2; j++) {
                points[i][j]=stdin.nextDouble();
            }
            
        }
        double area = getTriangleArea(points);
        if(area == 0)
            System.out.println("The three points are on the same line");
        else
            area = ((double)Math.round((area*100)/100));
            System.out.println("The area of the triangle is: " + area);
    
    }
    public static double getTriangleArea(double[][]points) {
        
        double side1 = getSides(points[0][0], points [0][1],points[1][0], points[1][1]);
        double side2 = getSides(points[1][0], points [1][1],points[2][0], points[2][1]);
        double side3 = getSides(points[2][0], points [2][1],points[0][0], points[0][1]);
        double s = (side1+side2+side3)/2;
        double area = s*(s-side1)*(s-side2)*(side3);
        if(area <0.0001)
            return 0;
        else 
            return Math.sqrt(area);
        }
    public static double getSides(double x1, double y1,double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));

    }

	

}
