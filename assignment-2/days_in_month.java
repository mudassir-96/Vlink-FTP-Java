/*Enter the number of months and decide how many days are there?*/
package com.mycompany;
import java.util.Scanner;

public class days_in_month {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("please enter the number of months:");
        int num_of_month = Sc.nextInt();

        if (num_of_month==2){
            System.out.println("No. of days: 28/29 days");
        }
        else if (num_of_month==4 || num_of_month==6 || num_of_month==9 || num_of_month==11){
            System.out.println("No. of days: 30 days");
        }
        else if (num_of_month==1 || num_of_month==3 || num_of_month==5 || num_of_month==7 || num_of_month==8 || num_of_month==10 || num_of_month==12){
            System.out.println("No. of days: 31 days");
        }
        else {
            System.out.println("Invalid input! please enter valid input");
        }
    }
}
