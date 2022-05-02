package com.mycompany;

public class RepeatString2 {
    public static void main(String[] args) {
        String str = "welcome";
        String newString="";

        for (int i=0; i<str.length(); i++){
            newString = newString + str.substring(i, i+1) + str.substring(i, i+1);
        }

        System.out.println(newString);

    }
}
