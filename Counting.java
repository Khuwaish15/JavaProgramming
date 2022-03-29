
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        int num;
        int count = 0, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        num = input.nextInt();
        
        while (num != 0) {
            total += num;
            count++;
            num = input.nextInt();
        }
        double avg = (double) total/count;
        System.out.println("Average:"+avg);
        input.close();
    }

}



