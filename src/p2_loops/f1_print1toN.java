package p2_loops;
import java.util.Scanner;
public class f1_print1toN {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Print 1 to n numbers -> ");
        System.out.println("Enter n : ");
        int n = s.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }

    }
}
