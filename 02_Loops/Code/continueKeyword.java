// Question of continue Keyword
// print number till user does not enter multiple of 10

import java.util.* ;

public class continueKeyword {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;

        do { 
            System.out.print("enter n : ");
            n = sc.nextInt();

            if(n % 10 == 0){
                System.out.println("number skip");
                continue;
            }

            System.out.println(n);

        } while (true);
    }
}
