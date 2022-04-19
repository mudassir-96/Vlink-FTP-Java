/*      Find maximum and minimum number in array.
        Original Array: [25, 14, 56, 15, 36, 56, 77,18, 29, 49] */

        package com.mycompany;

public class min_max_array {
    public static void main(String[] args) {
        int [] array = {25, 14, 56, 5, 36, 65, 77, 18, 29, 94};
        int num = array[0], max, min;

        for (int i = 0; i<array.length; i++){
            if (array[i]>num){
                max= array[i];
                System.out.println("maximum number: " + max);
            }
            else if (array[i]<num){
                min = array[i];
                System.out.println("minimum number: " + min);

            }

        }

    }
}
