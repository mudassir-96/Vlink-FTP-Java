/*      Write program.
        Given an integer, perform the following conditional actions:
        If it is odd, print Weird
        If it is even and in the inclusive range of 2 to 5, print Not Weird
        If it is even and in the inclusive range of 6 to 20 , print Weird
        If it is even and greater than 20 , print Not Weird */

package com.mycompany;
import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number: ");
        int num = sc.nextInt();

        if (num%2!=0){
            System.out.println("Weird");
        }
        else if (num%2==0 && num>= 2 && num<=5){
            System.out.println("Not Weird");
        }
        else if (num%2==0 && num>=6 && num<=20){
            System.out.println("Weird");
        }
        else if (num%2==0 && num>20){
            System.out.println("Not Weird");
        }

    }
}
