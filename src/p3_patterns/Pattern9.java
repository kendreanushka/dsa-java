package p3_patterns;

public class Pattern9 {
    public static void main(String[] args){
        int n = 5;

        for(int r =1; r<=2*n-1; r++){
            int s = r<=n ? r : 10 -r;

            for(int c= 1; c<=s; c++){
                    System.out.print("* ");

            }
            System.out.println();




        }




    }
}
