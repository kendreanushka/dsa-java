package p4_BasicArrayManipulation;
import java.util.Arrays;

public class F14_SwapValues {
    public static void main(String[] args){
//        Current index i ↔ next/upcoming index i + 1
//        swapping only one element with upcoming other elements


        int[] arr = {10,20,30,40,50};
        System.out.println("Array before swapping: "+Arrays.toString(arr));
        int temp;
        for(int i = 0; i < arr.length -1; i++){ // (arr.length -1 cuz if not kep -1 ,then there would be no next i+1 value to exchange with 50 for swap
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println("Swapped array : "+Arrays.toString(arr));
    }
}
