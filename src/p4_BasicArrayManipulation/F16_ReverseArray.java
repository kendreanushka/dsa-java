package p4_BasicArrayManipulation;
import java.util.Arrays;
public class F16_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,8,5};


        for(int i = 0; i < arr.length-(i+1); i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;

        }
        System.out.print(Arrays.toString(arr));



    }
}
