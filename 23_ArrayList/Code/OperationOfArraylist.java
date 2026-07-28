// perform different operation on ArrayList

import java.util.ArrayList ;
import java.util.Iterator;

public class OperationOfArraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        // add

        list.add(5);
        list.add(8);

        System.out.println(list);

        // add at index
        list.add(1,20);
        System.out.println(list);
        list.add(0,89);
        System.out.println(list);

        //get element
        System.out.println(list.get(3));
        

        // set elemnt

        list.set(3,99);
        System.out.println(list);

        // remove element
        list.remove(0);
        System.out.println(list);


        // contain
        System.out.println(list.contains(20));
        System.out.println(list.contains(50));


        // size
        System.out.println(list.size());

        //isEmpty()
        System.out.println(list.isEmpty());

        //clear
        list.clear();
        System.out.println(list);

        // add

        list.add(5);
        list.add(8);
        list.add(25);
        list.add(88);

        System.out.println(list);

        // indexOf()
        System.out.println(list.indexOf(8));
        System.out.println(list.indexOf(888));

        // print list

        for(int i=0 ; i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }

        // Print using Enhanced for Loop
        System.out.println();
        for(Integer i : list){
            
            System.out.print(i + " ");
        }

        // Print using Iterator
        System.out.println();
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }



}