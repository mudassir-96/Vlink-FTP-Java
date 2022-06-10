/* Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different"
    if all three numbers are different and "Neither all are equal or different" otherwise. */
import java.util.Scanner;
public class pr6_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("please enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("please enter num3: ");
        int num3 = sc.nextInt();

        if (num1==num2 && num1==num3){
            System.out.println("All numbers are equal.");
        }
        else if (num1!=num2 && num1!=num3){
            System.out.println("All numbers are different.");
        }
        else {
            System.out.println("Neither all are equal or different.");
        }
    }
}
