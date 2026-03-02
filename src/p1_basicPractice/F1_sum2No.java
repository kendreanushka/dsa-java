package p1_basicPractice;
import java.util.Scanner;
public class F1_sum2No {
    public static void main(String args[]){
         Scanner s = new Scanner(System.in);

         boolean continuePrgrm = true;

         while(continuePrgrm) {
             System.out.println("Enter number a:");
             int a = s.nextInt();

             System.out.println("Enter number b:");
             int b = s.nextInt();

             int sum = a + b;

             System.out.println("Addition of a and b is:" + sum);

             System.out.println("Do you want to continue ? (y/n)");
             String ch = s.next();

             if(ch.equals("n")){
                 continuePrgrm = false;
             }

         }





    }
}
