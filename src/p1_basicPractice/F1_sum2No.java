package p1_basicPractice;
import java.util.Scanner;
public class F1_sum2No {
    public static void main(String args[]){
         Scanner s = new Scanner(System.in);

         boolean continuePrgrm = true;

         while(continuePrgrm) {

             System.out.println("Enter no 1: ");
             int a = s.nextInt();
             System.out.println("Enter no 2: ");
             int b = s.nextInt();

             int sum = a + b;
             System.out.println("Sum of numbers = " + sum);

             System.out.println("Do you want to continue the program? (y/n)");
             String ch = s.next();

             if(ch.equals("n")){
                 continuePrgrm = false;
             }

         }

        }













    }

