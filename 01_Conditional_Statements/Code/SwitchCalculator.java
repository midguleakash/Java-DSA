import java.util.* ;

public class SwitchCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a : ");
        int a = sc.nextInt();

        System.out.print("enter b : ");
        int b = sc.nextInt();

        System.out.print("enter operaotor : ");
        char op = sc.next().charAt(0);

        switch(op){

            case '+' : System.out.println(a+b);
            break ;

            case '-' : System.out.println(a-b);
            break ;

            case '/' : 
                if(b != 0) {
                    System.out.println(a/b);
                }
                else {
                    System.out.println("Division by zero is not allowed");
                }
            break ;

            case '*' : System.out.println(a*b);
            break ;

            default : System.out.println("enter right operator");
        }
    }
}