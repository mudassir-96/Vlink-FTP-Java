// Write a program to print Fibonacci series of n terms.
package com.mycompany;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for (int i=1; i<=n; i++){
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
