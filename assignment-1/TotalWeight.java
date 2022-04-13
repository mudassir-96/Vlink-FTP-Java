/* An online retailer sells two products: widgets and gizmos. Each widget weighs 75 grams.
Each gizmo weighs 112 grams. Write a program that reads the number of widgets and the number of
gizmos in an order from the user.
Then your program should compute and display the total weight of the order. */

package com.mycompany;
import java.util.Scanner;
public class TotalWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the quantity of widgets:");
        int widgets = sc.nextInt();
        System.out.println("Please enter the quantity of gizmos:");
        int gizmos = sc.nextInt();
        System.out.println("The quantity of widgets are: "+ widgets);
        System.out.println("The quantity of gizmos are: "+ gizmos);
        int widgets_weight = widgets*75;
        int gizmos_weight = gizmos*112;
        int total_weight = widgets_weight + gizmos_weight;
        System.out.println("The total weight of the order is " + total_weight + " grams.");


    }
}
