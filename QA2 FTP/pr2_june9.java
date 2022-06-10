/*  A 4-digit number is entered through keyboard. Write a program to print a new number with digits reversed as of the original one.
        E.g.-
        INPUT : 1234        OUTPUT : 4321
        INPUT : 5982        OUTPUT : 2895       */

import java.util.Scanner;

public class pr2_june9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        int rev_num=0;
        while (num>0){
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse of entered number is: "+rev_num);
    }
}
