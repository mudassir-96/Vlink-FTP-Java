/*      Array1= [12,45,67,23,54] arrange array in to descending order and find
        second max no using indexing */

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int [] arr = {12, 45, 67, 23, 54};
        int temp =0;
        for (int i=0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }   }
        }
        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
            System.out.println(arr[arr.length-2]);
        }


    }
}
