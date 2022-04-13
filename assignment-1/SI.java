// Calculate SI=P*R*T/100
package com.mycompany;
import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the principle amount: ");
        float p = sc.nextFloat();
        System.out.println("please enter the rate:");
        float r = sc.nextFloat();
        System.out.println("please enter the time in years:");
        float t = sc.nextFloat();
        float si = p*r*t/100;
        System.out.println("Your Simple Interest(SI) is: " + si);

    }
}
