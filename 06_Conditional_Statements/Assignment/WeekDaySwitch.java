/*Question 3

Write a Java program to input a week number (1–7) and print the corresponding day of the week using a switch statement. */

import java.util.* ;

public class WeekDaySwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter input number from 1 to 7 : ");
        int n = sc.nextInt();

        switch(n){
            case 1 : 
                System.out.print("Monday");
                break;
            
            case 2 : 
                System.out.print("Tuesday");
                break;

            case 3 : 
                System.out.print("Wednesday");
                break;

            case 4 : 
                System.out.print("Thurday");
                break;

            case 5 : 
                System.out.print("Friday");
                break;

            case 6 : 
                System.out.print("saturday");
                break;

            case 7 : 
                System.out.print("Sunday");
                break;

            default : 
                System.out.print("enter right input");
                break;
                    
        }
    }
}
