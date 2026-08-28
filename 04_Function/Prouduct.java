
import java.util.Scanner ;

public class Prouduct {

    public static int multi(int a, int b){
        return a*b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("proudct of a and b : " + multi(a,b));
    }
}
