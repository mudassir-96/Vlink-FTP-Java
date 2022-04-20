// Find second max no in given array.
package com.mycompany;

import java.util.Arrays;

public class second_max_array_element {
    public static void main(String[] args) {
        int [] array = {5, 20, 34, 12, 91};
        int a = array.length;
        Arrays.sort(array);
        System.out.print("Sorted Array:");
        for (int element: array){
            System.out.print(" " + element);
        }
        System.out.println();

        System.out.println("second max no: " + array[a-2]);

    }
}
