// Write a program to enter two numbers x, y and find x^y.
package com.mycompany;
import java.util.Scanner;
public class bitwise_oprator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x = sc.nextInt();
        System.out.println("enter the value of y:");
        int y = sc.nextInt();

        System.out.println(x^y);
    }
}
