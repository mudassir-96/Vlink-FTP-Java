/*
Write a Java program to print after removing duplicates from a given string.

        Sample Output:
        The given string is: smooth
        After removing duplicates characters the new string is: smoth
*/
public class pr6_june9 {
    public static void main(String[] args) {
        String str = "smooth";

        // firstly i will convert this string into array
        char[] arr = str.toCharArray();
        String targetStr = "";

        for (char element: arr){
            if (targetStr.indexOf(element)==-1){
                targetStr = targetStr+element;
            }
        }
        System.out.println("given string is: "+str);
        System.out.println("after removing duplicate character from given string is: "+targetStr);

    }
}
