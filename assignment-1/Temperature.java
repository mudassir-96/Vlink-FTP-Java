// Convert input temperature from Celsius to Fahrenheit(F=T*1.8+32)
package com.mycompany;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in celsius: ");
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        float fahrenheit =((temp*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is "+fahrenheit);

    }
}
