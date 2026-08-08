import java.util.* ;

public class Large3Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a , b , c ;
        System.out.print("enter a : ");
        a = sc.nextInt();
        
        System.out.print("enter b : ");
        b = sc.nextInt();
        
        System.out.print("enter c : ");
        c = sc.nextInt();
        

        if(a > b){
            if(a>c){
                System.out.print("a is greater");
            }

            else {
                System.out.print("c is greater");
            }
        }

        else {
            if(b > c){
                System.out.print("b is greater");
            }

            else {
                System.out.print("c is greater");
            }
        }
    }
}