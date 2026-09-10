package p4_arrays;

import java.util.Arrays;
import java.util.Scanner;
public class F7_arrayPractice {
    public static void main(String[] args) {
        /* 1. Create array
           2. Store / Assign values
           3. Access / Modify values
           4. Traverse / Print
        */
        Scanner s = new Scanner(System.in);
        //declare and created index
        int[] arr = new int[5];

//        arr[0] = 35;
//        arr[1]= 45;
//        arr[2] = 78;
//        arr[3] = 17;
//        arr[4]= 63;

//        int a= s.nextInt();

        // assign/take values and stored in array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter marks of student "+(i+1)+": ");
            arr[i] = s.nextInt();

        }

        //print / traverse array
        System.out.println(Arrays.toString(arr));

        //access values at index
        System.out.println(arr[3]);

        //modify/ replace value in array
        System.out.println("Modify array at index 2: ");

        arr[2] = s.nextInt();
        // print / traverse modified array
        System.out.println(Arrays.toString(arr));



    }
}
