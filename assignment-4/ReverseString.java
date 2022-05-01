/*      Write a program to reverse individual words in a string,
        where each word may be delimited by a dot, comma, space or tab,
        like www.google.com should become www.elgoog.moc  */
package com.mycompany;

public class ReverseString {
    public static void main(String[] args) {
        String str = "www.google.com";
        String words[] = str.split("\\.");

        String reversString = "";

        for (String element:words){
            String reverseWord="";
            for (int i=element.length()-1; i>=0; i--){
                reverseWord=reverseWord+element.charAt(i);
            }
            reversString=reversString+reverseWord+".";
        }
        System.out.println(reversString);
    }
}
