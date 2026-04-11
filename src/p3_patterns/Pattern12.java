package p3_patterns;
//diamond pattern
public class Pattern12 {
    public static void main(String[] args){
        int n = 5;
        for(int r =1; r<=2*n-1; r++){

            int spaces = r<=n? n-r : r-n; // dec/inc spaces
            for(int s=1; s<=spaces; s++){
                System.out.print("  ");
            }

            int stars = r<=n? 2*r-1 : (4*n - 2*r - 1); // (2*(2*n - r) - 1)= 9-2*9r-n)
            for(int c=1; c<=stars; c++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
