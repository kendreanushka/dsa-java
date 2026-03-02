package p1_basicPractice;
import java.util.Scanner;

public class F2_swapNo {
    public static void main(String args []){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b: ");
        int b = s.nextInt();

        System.out.println("before swapping a: "+a+" and b: "+b);


        int c = b;
        b=a;
        a=c;

        System.out.println("after swapping a: "+a+" and b: "+b);







    }
}
