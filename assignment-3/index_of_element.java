/*      Write a Java program to find the index of an array element 100.
        a.Original Array: [75, 4, 56, 5, 36, 100, 77, 18,
        29, 94] */


package com.mycompany;

public class index_of_element {
    public static void main(String[] args) {

        int [] array = {75, 4, 56, 5, 36, 100, 77, 18, 29, 94};
        for (int i=0; i<array.length; i++){
            if (array[i]==100){
                System.out.println("index of 100: " + i);
            }
        }

    }
}
