package com.mycompany;

public class RepeatString {
    public static void main(String[] args) {
        String str1 = "try and best";
        String str2 = str1.substring(0,3);
        String str3 = str1.substring(8,12);
        String str4 = str2+str3;
        System.out.println(str4.repeat(3));
    }
}
