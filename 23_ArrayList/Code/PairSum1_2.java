// Find if any pair in a sorted ArrayList has a target sum using brute Force

import java.util.ArrayList ;

public class PairSum1_2 {

    public static boolean pairSum(ArrayList<Integer> list , int target){
        int  L_Pointer = 0 , R_Pointer = list.size() - 1;

        while(L_Pointer < R_Pointer){
            int currentSum = list.get(L_Pointer) + list.get(R_Pointer);
            if(currentSum == target){
                return true ;
            }

            else if(currentSum < target){
                L_Pointer ++ ;
            }

            else {
                R_Pointer -- ;
            }

            
        }

        return false ;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairSum(list, 5));
        
    }

    
}