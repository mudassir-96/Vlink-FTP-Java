/* Write a program that reads a positive integer, n, from the user and then
displays the sum of all of the integers from 1 to n.
The sum of the first n positive integers can be computed using the formula: sum = (n)(n + 1)/2 */


package com.mycompany;
import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        System.out.println("sum of the first " + n + " positive integers are: " + sum);

    }
}
