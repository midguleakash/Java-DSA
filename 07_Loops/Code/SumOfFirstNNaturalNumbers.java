// calculate sum of n natural number using while loop 

import java.util.* ;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int i=1 , sum = 0 ;

        while(i <= n){
            sum = sum + i ;
            i++ ;
        }

        System.out.print("sum : " + sum);
    }
    

}