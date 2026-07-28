// swap two element in ArrayList using Function

import java.util.ArrayList;

public class SwapNumber {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(24);
        list.add(13);
        list.add(140);
        list.add(5);
        list.add(66);

        System.out.println("before swap");
        System.out.println(list);



        swap(list,2,5);

        System.out.println("before swap");
        System.out.println(list);
    }

}
