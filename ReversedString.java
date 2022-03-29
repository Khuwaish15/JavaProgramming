
import java.util.Scanner;
	public class ReversedString {

	    public static void main(String[] args) {
	        String str;
	    
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter string: ");
	        
	        str = input.nextLine();
	    
	        for(int i = str.length()-1; i>= 0; i--) {
	            
	            System.out.print(str.charAt(i));
	        }
	    
	        input.close();
	        
	    }

	}


