package p4_BasicArrayManipulation;
import java.util.ArrayList;
import java.util.Scanner;
public class F8_arrayListPractice {
    public static void main(String[] args){
        // Create an ArrayList
        ArrayList<Integer> al = new ArrayList<>();// Integer is wrapper class
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(8);

        System.out.println(al);

        ArrayList<Integer> a = new ArrayList<>(6);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integers in ArrayList a: ");
        for(int i = 0; i < 6; i++){
            a.add(s.nextInt());
        }
        System.out.println("ArrayList a :"+a);

        int n;
        // acces elements at index i
        System.out.println("Elements at index 3: "+a.get(3));
        System.out.println("Elements at index 2: "+a.get(2));
        System.out.println("Elements at index 5: "+a.get(5));

        // check if arrayLIst contains specific element
        System.out.println("There is element 55 in arrayList a, ture/false? "+a.contains(55));

        //modify
        a.set(3, 300);
        System.out.println("modified arraylist a: "+a);

        //remove element
        a.remove(2);
        System.out.print("removed element at index 2: ");
        System.out.println(a);

        //length of arrayList
        System.out.println("length of arraylist a: "+a.size());

        //traverse arraylist
        System.out.println("Traversing arraylist a: ");
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }







    }
}
