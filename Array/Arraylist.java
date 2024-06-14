package Array;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> lists = new ArrayList<>();

        for(int i=0;i<5;i++){
            lists.add(in.nextInt());
        }

        for(int i=0;i<5;i++){
            lists.get(i);
        }
        System.out.println(lists);


        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(20);
        // list.add(72);
        // list.add(52);
        // list.add(2);
        // list.add(19);
        // list.add(28);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(20);
        // list2.add(72);
        // list2.add(52);
        // list2.add(2);
        // list2.add(19);
        // list2.add(28);
        
        // System.out.println(list.equals(list2));

        // System.out.println(list);

        // list.set(0,9);
        // list.remove(2);
        

        // System.out.println(list.contains(72));
        // System.out.println(list);
        
        // list.clear();
        // System.out.println(list);


    }
}
