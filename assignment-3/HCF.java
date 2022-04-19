// Find HCF of two number(use Euclid formula)

package com.mycompany;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("please enter the num2: ");
        int num2 = sc.nextInt();
        int min, hcf = 0;

        if (num1<num2){
            min=num1;
        }
        else {
            min=num2;
        }

        for (int i=1; i<=min; i++){
            if (num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF of " +num1+ " & " +num2+ " is " + hcf);

    }
}
