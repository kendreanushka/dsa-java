package p3_patterns;

public class Pattern8 {
    public static void main(String[] args) {
        for (int r = 1; r <= 3; r++) {
            for (int s = 1; s <= (3 - r); s++) {
                System.out.print("  ");
            }

            for (int c = r; c >= 1; c--) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
