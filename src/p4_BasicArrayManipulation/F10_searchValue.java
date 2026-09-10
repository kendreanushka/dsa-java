package p4_BasicArrayManipulation;

public class F10_searchValue {
    public static void main(String[] args) {
//        Find whether a particular value exists.
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        int t = 7;
        boolean found = false;

        for(int i = 0; i<arr.length; i++ ){
            if(arr[i] == t){
                found = true;
                System.out.println("Found at index "+i);
                break;
            }

        }
        if(!found){
            System.out.println("Not found at any index");
        }
    }

}
