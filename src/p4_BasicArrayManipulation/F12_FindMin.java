package p4_BasicArrayManipulation;

public class F12_FindMin {
    public static void main(String[] args) {
        int[] arr = {3,4,6,2,8,3,9,1};
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum no is: "+min);

    }
}
