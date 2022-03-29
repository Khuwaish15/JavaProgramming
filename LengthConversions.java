import java.util.Scanner;
public class LengthConversions {
	 public static void main(String [] args) {
	        //TODO Auto-generated method stub
	        Scanner input = new Scanner(System.in);
	        System.out.print("A - convert inches to centimeters \n"
	              + "B - convert centimeters to inches \n" +
	                "C - convert kilometers to miles \n"+
	                "D - convert miles to kilometers \n"+
	                "E-Exit \n");
	        
	        char option='A';
	        double value;
	        while(option !='E') {
	            //take input
	            System.out.println("Option: ");
	            option = input.next().charAt(0);
	            switch (option) {
	            case 'A':
	                System.out.println("Enter inches: ");
	                value = input.nextDouble();
	                System.out.println("Ans: "+ inToCm(value));
	                break;

	            case 'B':
	                System.out.println("Enter centimeters: ");
	                value = input.nextDouble();
	                System.out.println("Ans: "+ cmToin(value));
	                break;
	                
	            case 'C':
	                System.out.println("Enter kilometers: ");
	                value = input.nextDouble();
	                System.out.println("Ans: "+ kmToMi(value));
	                break;
	                
	            case 'D':
	                System.out.println("Enter mi: ");
	                value = input.nextDouble();
	                System.out.println("Ans: "+ miToKm(value));
	                break;
	                
	            case 'E':
	                System.out.println("Bye!");
	                break;
	            }
	        }
	    }
	    
	public static double inToCm(double in) {
	        double conversionRate= 2.54;
	        return in*conversionRate;
	    }
	    
	    public static double cmToin(double cm) {
	        double conversionRate= 0.393701;
	        return cm*conversionRate;    
	    }
	    
	    public static double kmToMi(double km) {
	        double conversionRate=0.621371;
	        return km*conversionRate;
	    }
	    
	    public static double miToKm(double mi) {
	        double conversionRate=1.60934;
	        return mi*conversionRate;
	    }

}
