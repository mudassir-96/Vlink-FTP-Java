/*      Write a Java program to test if an array contains
        a specific value.
        a.my_array1 = { 1789, 2035, 1899, 1456,
        2013, 1458, 2458, 1254, 1472, 2365} */

package com.mycompany;
import java.util.Scanner;
public class find_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();

        int [] my_array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1472, 2365};

        for (int i : my_array1){
            if (i==num){
                System.out.println("value is present");
            }
            else {
                System.out.println("value is not present");
            }
        }

        // other method:
//
//        for (int i = 0; i<my_array1.length; i++){
//
////            System.out.println(my_array1[i]);
//                if (num==my_array1[i]){
//                    System.out.println("number is present");
//                }
//                else {
//                    System.out.println("number is not present");
//                }
//
//        }

    }
}
