package p4_BasicArrayManipulation;
import java.util.Arrays;
import java.util.Scanner;
public class F4_2d_array {
    public static void main(String[] args) {
        /*
             1 2 3   - - -   index 0
             4 5 6   - - -   index 1
             7 8 9   - - -   index 3 of row
        */

        //int[][] arr = new int[2][3];
        //declare and initialize 2d array
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // print 2d array
        for(int[] r: arr){
            for(int c: r){
                System.out.print(c+" ");
            }
            System.out.println();
        }

        //another way to declare and create 2d array
        Scanner s = new Scanner(System.in);
        int[][] ar = new int[3][3];
        System.out.println(ar.length); //count no of rows

        // Initialize (store values) 2d array, Input
        for(int row = 0; row < ar.length; row++){
            //for each col in every row
            for(int col = 0; col < (ar[row].length); col++){ // length/size of row(array) at i index, length of ar[0], ar[1], ar[2]
               ar[row][col] = s.nextInt();
            }
        }

        // output - method 1
        for(int row =0; row< ar.length; row++){
            for(int col = 0; col < (ar[row].length); col++){
                System.out.print(ar[row][col]+" ");
            }
            System.out.println();
        }

        // output - method 2
        for(int row =0; row < ar.length; row++){
            System.out.println(Arrays.toString(ar[row]));
        }

        // output - method 3
        for(int[] a : ar){
            System.out.println(Arrays.toString(a));
        }











    }
}
