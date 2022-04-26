/*      Print the average of three numbers entered by
        user by creating a class named 'Average'
        having a method to calculate and print the
        average.    */

package com.mycompany;
import java.util.Scanner;
public class Average {
    static int avg(int num1, int num2, int num3){
        int avg = num1+num2+num3/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.println("please enter the value of num2: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter the value of num3: ");
        int num3 = sc.nextInt();

        System.out.println("The average of entered three number is "+ avg(num1, num2, num3));

    }
}
