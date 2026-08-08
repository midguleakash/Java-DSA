/*Question 2

Write a Java program to print:

"You have a fever." if the temperature is above 100.
Otherwise, print "You don't have a fever."

Complete the following code:

public class Solution {
    public static void main(String[] args) {
        double temp = 103.5;

        // Write your code here

    }
} */

public class Fever {
    public static void main(String[] args) {
        double temp = 103.5;

        if(temp > 100){
            System.out.println("You have a fever");
        }

        else {
             System.out.println("You don't have a fever");
        }

    }
}
