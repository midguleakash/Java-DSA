//sort element in asending order in ArrayList using inbuilt method

import java.util.ArrayList;
import java.util.Collections ;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(88);
        list.add(52);
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(28);

        // ascending order
        System.out.println("ascending order");
        System.out.println("before sort");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("after swap");
        System.out.println(list);


         // descending order
        System.out.println("\n\ndescending order");
        System.out.println("before sort");
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("after swap");
        System.out.println(list);
    }
}
