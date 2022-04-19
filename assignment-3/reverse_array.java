/*      Write a Java program to reverse an array of integer values.
        a.Original Array: [75, 4, 56, 5, 36, 65, 77, 18, 29, 94] */

        package com.mycompany;

public class reverse_array {
    public static void main(String[] args) {
        int[] array = {75, 4, 56, 5, 36, 65, 77, 18, 29, 94};
        System.out.println("The original array:");

        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("The reverse array:");

        for (int i=array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }

    }
}
