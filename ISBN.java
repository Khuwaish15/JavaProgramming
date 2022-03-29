import java.util.Scanner;
public class ISBN {

    public static void main(String[] args) {
        System.out.print("Enter first 9 digits of ISBN number: ");
        Scanner input = new Scanner(System.in);
        int ISBN = input.nextInt();
        int sum=0;
        int n1 = ISBN/100000000;
        sum += (n1 * 1);
        ISBN = ISBN % 100000000;

        int n2 = ISBN/10000000;
        sum += (n2 * 2);
        ISBN = ISBN % 10000000;

        int n3 = ISBN/1000000;
        sum += (n3 * 3);
        ISBN = ISBN % 1000000;


        int n4 = ISBN/100000;
        sum += (n4 * 4);
        ISBN = ISBN % 100000;


        int n5 = ISBN/10000;
        sum += (n5 * 5);
        ISBN = ISBN % 10000;


        int n6 = ISBN/1000;
        sum += (n6 * 6);
        ISBN = ISBN % 1000;


        int n7 = ISBN/100;
        sum += (n7 * 7);
        ISBN = ISBN % 100;


        int n8 = ISBN/10;
        sum += (n8 * 8);
        ISBN = ISBN % 10;


        int n9 = ISBN/1;
        sum += (n9 * 9);
        ISBN = ISBN % 1;

        int finalNumber = sum % 11;
        if (finalNumber == 10){
            System.out.print("Final ISBN number: " + n1 + "" + n2 + "" + n3 + "" + n4 + "" + n5 + "" + n6 + "" + n7 + "" + n8 + "" + n9 + "X");
        }
        else{
            System.out.print("Final ISBN number: " + n1 + "" + n2 + "" + n3 + "" + n4 + "" + n5 + "" + n6 + "" + n7 + "" + n8 + "" + n9 + "" + n9 + "" + finalNumber);
                
        }
        input.close();



    }

}


