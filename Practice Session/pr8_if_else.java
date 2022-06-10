// Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.
import java.util.Scanner;
public class pr8_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the floating point number 1:");
        double num1 = sc.nextDouble();
        System.out.println("please enter the floating point number 2");
        double num2 = sc.nextDouble();

        if (Math.abs(num1-num2)<=0.01){
            System.out.println("numbers are same.");
        }
        else {
            System.out.println("numbers are not same.");
        }
    }
}
