/*      Write a program to print the area of two circles
        having radius 4 and 20 respectively by creating
        a class named 'Circle' with a method named
        'Area' which returns the area and radius passed
        as parameter to its constructor.  */

package com.mycompany;

public class Circle {
    double radius;

    Circle(double r){
        radius=r;
    }

    void Area(double radius){
        double area = 3.14*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(20);

        circle1.Area(circle1.radius);
        circle2.Area(circle2.radius);

    }
}
