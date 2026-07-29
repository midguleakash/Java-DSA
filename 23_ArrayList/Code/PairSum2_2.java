// Find if any pair in a sorted ArrayList has a target sum using brute Force

import java.util.ArrayList ;

public class PairSum2_2 {

    public static boolean pairSum(ArrayList<Integer> list , int target){

        int pivotIndex = -1 ;

        for(int i=0 ; i < list.size() ; i++){
            if(list.get(i) > list.get(i+1)) {
                pivotIndex = i ;
                break ;
            }
           
        }


        int  L_Pointer = pivotIndex + 1 ; 
        int R_Pointer = pivotIndex ;
        int n = list.size() ;

        while(L_Pointer != R_Pointer){
            int currentSum = list.get(L_Pointer) + list.get(R_Pointer);

            if(currentSum == target){
                return true ;
            }

            else if(currentSum < target){
                L_Pointer = (L_Pointer + 1) % n  ;
            }

            else {
                R_Pointer = (n + R_Pointer - 1) % n ;
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
        
    }

    
}