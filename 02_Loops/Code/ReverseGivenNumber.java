// reverse and store number in variable and then print

import java.util.* ;


public class ReverseGivenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");

        int n = sc.nextInt();

        int reverse = 0 , digit ;

        while (n>0) {
            digit = n % 10 ;
            reverse = reverse * 10  + digit;
          
            n = n / 10 ;
        }

        System.out.print(reverse);
    }
}