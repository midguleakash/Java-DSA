// print max element from ArrayLust

import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(24);
        list.add(13);
        list.add(140);
        list.add(5);
        list.add(66);
        
        
        int max = Integer.MIN_VALUE ;
        
        //O(n)
        for(int i=0 ; i < list.size() ; i++){
            if(list.get(i) >= max){
                max = list.get(i);
            }
        }

        System.out.print("max : "+ max);

    }
}
