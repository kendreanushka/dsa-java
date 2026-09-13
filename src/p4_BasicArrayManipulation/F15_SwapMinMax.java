package p4_BasicArrayManipulation;

import java.util.Arrays;
public class F15_SwapMinMax {
    //n array, find mix and max ele,swap them,print swapped ele array
    public static void main(String[] args) {
        int[] arr = {2,6,3,1,4};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        int imax =0;
        int imin =0;

        for(int i = 1; i<5; i++){
            if(arr[i] > max){
                max = arr[i];
                imax = i;
            }

            if(arr[i] < min){
                min = arr[i];
                imin = i;
            }

        }

        System.out.println("before swapping");
        System.out.println("Max no : "+max);
        System.out.println("min no : "+min);

//        for(int i=0; i<arr.length; i++){
//            if(i == imax){
//                arr[i] = min;
//
//            }
//            if(i == imin){
//                arr[i] = max;
//            }
//            System.out.print(arr[i]+" ");
//        }
        int t = arr[imin];
        arr[imin] = arr[imax];
        arr[imax] =t;

        System.out.println(Arrays.toString(arr));

    }
}
