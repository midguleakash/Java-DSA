// print butterfly pattern

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();

        for(int i=1 ; i <= n ; i++){
            for(int j=1 ; j <= i ; j++ ){
                System.out.print("* ");            
            }

            int space =2 * (n - i) ;

            while(space > 0){
                System.out.print("  "); 
                space -- ; 
            }

             for(int j=1 ; j <= i ; j++ ){
                System.out.print("* ");            
            }

            System.out.println();
        }

        // below base line

        for(int i=1 ; i <= n ; i++){
            for(int j=1 ; j <= n-i+1 ; j++ ){
                System.out.print("* ");            
            }

            int space =2 * (i-1) ;

            while(space > 0){
                System.out.print("  "); 
                space -- ; 
            }

             for(int j=1 ; j <= n-i+1 ; j++ ){
                System.out.print("* ");            
            }

            System.out.println();
        }
    }
}