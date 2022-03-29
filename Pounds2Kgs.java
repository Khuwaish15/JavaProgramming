import java.util.Scanner;
public class Pounds2Kgs {
	public static void main(String [] args) {
        //TODO Auto-generated method stub
        double conversionRate= .453592;
        
        //taking input
        System.out.println("Enter a quantity in pounds: ");
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();
        
        //print answer
        System.out.println(pounds + " is " + pounds*conversionRate + "kgs.");
        
    }

}
