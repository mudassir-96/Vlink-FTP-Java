/*      Write a Java program to calculate the average
        value of array elements.
        numbers = {20, 30, 25, 35, -16, 60, 100} */

package com.mycompany;

public class average_of_array {
    public static void main(String[] args) {

        int[] num = {20, 30, 25, 35, -16, 60, 100};
        int sum=0;
        int i=0;


        for (i=0; i<num.length; i++){
            sum = sum + num[i];
        }
        int avg=sum/num.length;

        System.out.println(avg);

    }
}
