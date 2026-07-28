// create arrayList of 3 different number and save in  multi-dimensional ArrayList and then print

import java.util.ArrayList ;

public class MultiDimensionalQ {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> tableList = new ArrayList<>();

        ArrayList<Integer> table2 = new ArrayList<>();
        ArrayList<Integer> table3 = new ArrayList<>();
        ArrayList<Integer> table4 = new ArrayList<>();

        for(int i = 1 ; i <=5 ; i++){
            table2.add(2*i);
            table3.add(3*i);
            table4.add(4*i);
        }

        tableList.add(table2);
        tableList.add(table3);
        tableList.add(table4);

        System.out.println(tableList);

        //using for loop print Arraylist
        System.out.println("\nprint arraylist using for loop\n");

        for(int i=0 ; i < tableList.size() ; i++){
            ArrayList<Integer> currentList = tableList.get(i);
            
            for(int j=0 ; j < currentList.size() ; j++){
                System.out.print(currentList.get(j) + " ");
            }

            System.out.println();
        }

    }
    
}
