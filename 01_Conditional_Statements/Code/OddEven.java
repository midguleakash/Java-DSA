import java.util.* ;

public class OddEven {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");

        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Even");
        }

        else {
            System.out.println("Odd");
        }
    }
}