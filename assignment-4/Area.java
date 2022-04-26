/*      Write a program to print the area of a rectangle
        by creating a class named 'Area' having one
        method. Method named as 'getArea' returns the
        area of the rectangle. Length and breadth of
        rectangle are entered through keyboard.     */

package com.mycompany;
import java.util.Scanner;
public class Area {
    static double getArea(double len, double wid){
        double area = wid*len;
        return (double) area;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length of rectangle: ");
        double len = sc.nextDouble();
        System.out.println("Please enter the width of rectangle: ");
        double wid = sc.nextDouble();
        System.out.println("The area of rectangle is "+getArea(len,wid));

    }

}
