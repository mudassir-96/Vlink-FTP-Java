// Write a Java method to display the middle character of a string.
package com.mycompany;
import java.util.Scanner;
public class mid_char_in_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a word:");
        String str = sc.nextLine();
        mid_char(str);

    }
    static void mid_char(String str){
        int len = str.length();
        int mid = len/2;
        System.out.println(str.charAt(mid));
    }
}
