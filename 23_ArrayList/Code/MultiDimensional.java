// create and print multi-dimensional ArrayList

import java.util.ArrayList ;

public class MultiDimensional {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(7);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(15);
        list2.add(17);
        list2.add(12);

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(52);
        list3.add(72);
        list3.add(22);



        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //using for loop print Arraylist
        System.out.println("\n\n print arraylist using for loop");

        for(int i=0 ; i < mainList.size() ; i++){
            ArrayList<Integer> currentList = mainList.get(i);
            
            for(int j=0 ; j < currentList.size() ; j++){
                System.out.print(currentList.get(j) + " ");
            }

            System.out.println();
        }
    }
    
}
