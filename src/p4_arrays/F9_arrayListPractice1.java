package p4_arrays;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class F9_arrayListPractice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1. Create an ArrayList
        ArrayList<Integer> al = new ArrayList<>(5);

        //2. Take 5 marks from the user.
        //3. Add each mark to the ArrayList.
        System.out.println("Add each mark to the ArrayList: ");
        for(int i = 0; i <5; i++){
            al.add(s.nextInt());
        }

        //4. Print the ArrayList.
        System.out.println("Print the Students marks: "+al);

        //5. Access and print the 3rd student's mark.
        System.out.println("Marks of 3rd student: "+al.get(2));

        //6.Modify the 3rd student's mark.
        System.out.println("Modify the 3rd student's mark: ");
        al.set(2,s.nextInt());
        System.out.println("Modified Students marks: "+al);

        //7. Remove the 5th student's mark.
        al.remove(4);
        System.out.println("Removed the 5th student's mark.");
        System.out.println("Modified Students marks: "+al);

        //8.Traverse and print all remaining marks.
        System.out.println("Traverse and print all remaining marks : ");
        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }

        //9.Print the final size.
        System.out.println("Final size of arraylist: "+al.size());



    }
}
