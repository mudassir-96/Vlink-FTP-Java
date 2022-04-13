// Write a program to find area square , rectangle, triangle
package com.mycompany;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        // area of square
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Area of Square-----");
        System.out.println("Enter the Length of square:");
        int len = sc.nextInt();
        int area_of_square = len*len;
        System.out.println("The area of square is " + area_of_square);

        // area of triangle
        System.out.println("-----Area of Rectangle-----");
        System.out.println("Enter the width of rectangle:");
        double width = sc.nextDouble();
        System.out.println("Enter the length of rectangle:");
        double length = sc.nextDouble();
        double area_of_rectangle = width*length;
        System.out.println("The are of rectangle is " + area_of_rectangle);

        // area of rectangle
        System.out.println("-----Are of Triangle-----");
        System.out.println("Enter the base of triangle:");
        float base = sc.nextFloat();
        System.out.println("Enter the height of triangle:");
        float height = sc.nextFloat();
        float area_of_triangle = (base*height)/2;
        System.out.println("The area of triangle is: " + area_of_triangle);


    }
}
