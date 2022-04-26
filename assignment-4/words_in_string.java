// Write a Java method to count all words in a string.
package com.mycompany;
import java.util.Scanner;

public class words_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = sc.nextLine();
        count_words(str);
    }
    public static void count_words(String str){
        //System.out.println(str.split(" ").length);
        System.out.println(str.split("\\s+").length);
        }
    }
