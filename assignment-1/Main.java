// Write a program of exchange of two variables value.
package com.mycompany;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 20;
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

    }
}
