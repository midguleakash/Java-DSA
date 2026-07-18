// print number from 1 to N using while loop

import java.util.* ;

public class PrintNumbers1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int i = 1;

        while(i <= n){
            System.out.println(i);
            i++ ;
        }
    }
}