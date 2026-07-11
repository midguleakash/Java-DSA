// pass or fail student using ternary operator

import java.util.* ;

public class PassOrFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter marks : ");
        int marks = sc.nextInt();

        String result = (marks > 34) ? "Pass" : "Fail" ;

        System.out.println(result);
    }
}
