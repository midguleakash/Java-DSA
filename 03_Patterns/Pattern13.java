// Daimond pattern

/*
      * 
    * * * 
  * * * * * 
* * * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
*/
import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();

        // for first half
        for (int i = 1; i <= n; i++) {
            
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // for second half

        for (int i = 1; i <= n; i++) {
            
            for (int s = 1; s <= i-1; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }

            for (int k = 1; k <= n-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
