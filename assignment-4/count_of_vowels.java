// Write a Java method to count all vowels in a string.
package com.mycompany;
import java.util.Scanner;

public class count_of_vowels {
    static int vowels_count(String str){
        int count=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the sentence:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println("The count of vowels in given sentence are "+vowels_count(str));
    }
}
