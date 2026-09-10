package p4_arrays;

import java.util.Arrays;

public class F3_passArrayToMethods {

    /* here two reference variable num and arr
       pointing to same object of array in heap  */

    static void change(int[] arr){
        arr[1] = 8;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};

        change(num);
    }
}
