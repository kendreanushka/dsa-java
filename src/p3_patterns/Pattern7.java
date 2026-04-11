package p3_patterns;

public class Pattern7 {
    public static void main(String[] args){
        for(int r=1; r<=3; r++){
            for(int c = 1; c <= (3-r+1); c++){
                System.out.print(4-c+" ");

            }
            System.out.println();
        }
    }
}
