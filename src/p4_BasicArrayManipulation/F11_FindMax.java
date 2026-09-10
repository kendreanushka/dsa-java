package p4_BasicArrayManipulation;

public class F11_FindMax {
    public static void main(String[] args){
        int[] arr = {1,3,6,2,7,5,9,4};
        int max = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum no is: "+max);

    }
}

