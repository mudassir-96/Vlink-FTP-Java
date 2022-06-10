/*   Write a Java program that reads a floating-point number.
     If the number is zero it prints "zero", otherwise, print "positive" or "negative".
     Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.  */

import java.util.Scanner;
public class pr4_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number: ");
        double num = sc.nextDouble();

        if (num>0){
            if (num<1){
                System.out.println(num+ " is positive small number.");
            }
            else if (num>1000000){
                System.out.println(num+ " is positive large number.");
            }
            else {
                System.out.println(num+ " is positive number.");
            }
        }
        else if (num<0){
            if (Math.abs(num)<1){
                System.out.println(num+ " is negative small number.");
            }
            else if (Math.abs(num)>1000000){
                System.out.println(num+" is negative large number.");
            }
            else {
                System.out.println(num+ " is negative number.");
            }
        }
        else {
            System.out.println(num+ " is zero");
        }

    }
}
