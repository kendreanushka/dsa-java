package p4_BasicArrayManipulation;
import java.util.ArrayList;
import java.util.Scanner;
public class F5_arrayList {
    public static void main(String[] args){
        //syntax- create arrayList
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(5);
        list.add(10);
        list.add(24);
        list.add(534);
        list.add(255);
        list.add(65);
        list.add(90);
        list.add(5);
        list.add(10);
        list.add(24);
        list.add(534);
        list.add(255);
        list.add(65);
        list.add(90);
        list.add(5);
        list.add(65);
        list.add(255);
        list.add(65);
        list.add(90);

        //at start we set sixe 10 elements but arraylist automatically resize

        System.out.println(list); //print ArrayList

        //check ef ele. conatains or not
        System.out.println(list.contains(555));

        //update
        list.set(0, 99);//chnage 5 to 99 at 0th index
        System.out.println(list);

        //remove
        list.remove(2); //removed 24
        System.out.println(list);


        Scanner s = new Scanner(System.in);

        ArrayList<Integer> ls = new ArrayList<>();

        // to take input of many elements at once
        for(int i =0; i < 5; i++){
            ls.add(s.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(ls.get(i));  // pass index here, list[index] syntax will not work here
        }

        System.out.println(ls);









    }
}
