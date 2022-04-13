/* Create a program that reads the length and width of a farmer’s field from the user in feet.
Display the area of the field in acres. Hint: There are 43,560 square feet in an acre. */
package com.mycompany;
import java.util.Scanner;

public class acre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of field in feet:");
        double len = sc.nextDouble();
        System.out.println("Please enter the width of field in feet");
        double wid = sc.nextDouble();
        double square_feet = len*wid;
//        System.out.println(square_feet);
        double acre = square_feet/43560;
        System.out.println(acre);

    }
}
