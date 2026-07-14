package p3_patterns;

public class Pattern1 {
    public static void main(String[] args){

        for(int r =1; r<=3; r++){
            //for every row, runs col
            for(int c = 1; c<=3; c++){  //col will print from c =1 until c = 3
                System.out.print("* ");  //print--> print* in one line
            }

            System.out.println(); //goes to next line
        }
        
    }
}
