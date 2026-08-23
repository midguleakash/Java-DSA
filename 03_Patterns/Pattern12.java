// Hollow Rhoumbus pattern

/*
        * * * * * 
      *       * 
    *       * 
  *       * 
* * * * * 

*/

import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int space = n - i;

            while (space > 0) {
                System.out.print("  ");
                space--;
            }

            for (int j = 1; j <= n; j++) {
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }

            System.out.println();

        }
    }
    
}
