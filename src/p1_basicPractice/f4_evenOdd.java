package p1_basicPractice;
import java.util.Scanner;
public class f4_evenOdd {
    public static void main(String args[]){

        boolean continuePrgrm = true;
        Scanner s = new Scanner(System.in);

        while (continuePrgrm) {

            System.out.println("Check if number is even or odd -> ");
            System.out.println("Enter no: ");
            int n = s.nextInt();

            if (n % 2 == 0) {
                System.out.println(n + " is even number.");

            } else {
                System.out.println(n + " is odd number.");
            }

            System.out.println("Do you want to continue (y/n)?");
            String ch = s.next();

            if(ch.equals("n")){
                continuePrgrm = false;
            }
        }
    }
}
