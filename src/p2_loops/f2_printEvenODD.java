package p2_loops;
import java.util.Scanner;

public class f2_printEvenODD {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        boolean continuePrgrm = true;

        while(continuePrgrm){


            System.out.println("Enter n : ");
            int n = s.nextInt();
            System.out.println("Print even number till "+n);

            for(int i = 0; i<=n; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
            System.out.println("Print odd number till "+n);

            for(int i = 1; i<=n; i++){
                if(i % 2 != 0 ){
                    System.out.println(i);
                }
            }

            System.out.println("Do you want to cotinue ? (y/n)");
            String ch = s.next();
            if(ch.equals("n")){
                continuePrgrm = false;
            }

        }



    }
}
