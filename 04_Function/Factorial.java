//find factorial using function

import java.util.Scanner ;

public class Factorial {

    public static int fact(int n){
        int fact = 1 ;
        for(int i=1 ; i <= n ; i++){
            fact = fact * i ;
        }

        return fact ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.print("factorial of " + n + " : " + fact(n));
    }
    
}
