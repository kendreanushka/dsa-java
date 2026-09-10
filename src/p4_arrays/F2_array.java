package p4_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class F2_array {
    public static void main(String[] args) {

        /*
        1. array declare - int[] arr; ->
        creating var. named arr which refers to integer array.
        2. array creation - creating array obj in memory.
        arr = new[5]; - created array of index size 5 i.e from 0,1,2,3,4
        */
        // array declaration & creation,
        int[] arr = new int[3];
        // array initialization
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;

        System.out.println(arr[1]); // 2
        System.out.println(arr[2]); //5
        //modify
        System.out.println(arr[2] = 4); //4


        /* like this if we want to print 1000s of values in array,
        so we have to do arr[i]  1000 times .
         so to save time we can use for loop , for each loop*/

        int[] a1 = new int[6];
        Scanner s = new Scanner(System.in);
        for(int i =0; i< a1.length; i ++){
            a1[i]  = s.nextInt();
        }


        //3 ways to print array
        // Way 1 :
        for(int i =0; i< a1.length; i ++){
            System.out.print(a1[i]+" ");
        }

        /* this prints same output
        int[] a1 = new int[6];
        Scanner s = new Scanner(System.in);
        for(int i =0; i< a1.length; i ++){
            a1[i]  = s.nextInt();
            System.out.print(a1[i]+" ");
        }
         */

        // Way 2: by foreach loop
        for(int n : a1){ // for every element(n) in array, print element n
            System.out.println(n+" "); // n is elements in array
        }

        // Way 3 : most efficient
        System.out.println(Arrays.toString(a1));

        //array of String/objects
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = s.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "ana";
        System.out.println(Arrays.toString(str));







    }
}
