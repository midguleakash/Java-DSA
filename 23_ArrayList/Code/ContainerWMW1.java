//solve q of conatiner with most water with optimize solution using two pointer approach
// in ArrayList

import java.util.ArrayList ;

public class ContainerWMW1 {

    public static int storedWater(ArrayList<Integer> height){
        int maxWater = 0 ;
        int L_Pointer = 0 , R_Pointer = height.size() - 1;

        while(L_Pointer < R_Pointer){
            int ht = Math.min(height.get(L_Pointer) , height.get(R_Pointer));
            int width = R_Pointer - L_Pointer ;
            int currentWater = ht * width ;
            maxWater = Math.max(maxWater, currentWater);

            if(height.get(L_Pointer) < height.get(R_Pointer)){
                L_Pointer ++ ;
            }

            else {
                R_Pointer-- ;
            }
        }

        return maxWater ;
    }
    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>() ;

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storedWater(height));
    }

}
