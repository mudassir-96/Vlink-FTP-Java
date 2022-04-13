/*      Write a program that determines the name of a shape from its number of sides.
        Read the number of sides from the user and then report the appropriate name as
        part of a meaningful message. Your program should support shapes with anywhere
        from 3 up to (and including) 10 sides.*/
package com.mycompany;
import java.util.Scanner;

public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of sides (3 up to 10)");
        int sides = sc.nextInt();

        if (sides==3){
            System.out.println("Triangle");
        }
        else if (sides==4){
            System.out.println("Quadrilateral");
        }
        else if (sides==5){
            System.out.println("Pentagon");
        }
        else if (sides==6){
            System.out.println("Hexagon");
        }
        else if (sides==7){
            System.out.println("Heptagon");
        }
        else if (sides==8){
            System.out.println("Octagon");
        }
        else if (sides==9){
            System.out.println("nonagon");
        }
        else if (sides==10){
            System.out.println("Decagon");
        }
        else {
            System.out.println("invalid input! please enter valid input between 3 to 10.");
        }
    }
}
