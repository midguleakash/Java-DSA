// print reverse number without store in variable

public class ReverseANumber {
    public static void main(String[] args){
        int n = 123654;
        int digit ;

        while(n > 0) {
            digit = n % 10 ;
            System.out.print(digit);
            n = n / 10 ;
        }
    }
}