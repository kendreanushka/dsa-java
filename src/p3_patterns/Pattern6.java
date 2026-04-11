package p3_patterns;

public class Pattern6 {
    public static void main(String[] args){
        for(int r=1; r<=3; r++){
            for(int c= 1; c<= r; c++){
                System.out.print(4-c+" ");
            }
            System.out.println();
        }
    }
}
