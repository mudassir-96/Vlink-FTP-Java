// Write a program to find prime numbers.
package com.mycompany;
import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = sc.nextInt();
        byte flag = 0;

        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                System.out.println("number is not prime.");
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println("number is prime.");
        }
    }
}
