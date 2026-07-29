// Find if any pair in a sorted & Rotated ArrayList has a target sum using brute Force

import java.util.ArrayList ;

public class PairSum2_1 {

    public static boolean pairSum(ArrayList<Integer> list , int target){
        for(int i = 0 ; i < list.size() ; i++){
            for(int j=i+1 ; j < list.size() ; j++){
                if(list.get(i) + list.get(j) == target){
                    return true ;
                }
            }
        }

        return false ;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 16));
        ;
    }

    
}