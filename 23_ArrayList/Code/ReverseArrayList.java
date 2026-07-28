// Print revrse ArrayList

import java.util.ArrayList ;

public class ReverseArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(24);
        list.add(13);
        list.add(140);
        list.add(5);
        list.add(66);
        
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
