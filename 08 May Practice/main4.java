/*      Write a program that accepts three numbers from the user and prints "increasing"
        if the numbers are in increasing order, "decreasing" if the numbers
        are in decreasing order, and "Neither increasing or decreasing order" otherwise. */
import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("enter num3: ");
        int num3 = sc.nextInt();

        if (num1<num2 && num2<num3){
            System.out.println("increasing order");
        }
        else if (num1>num2 && num2>num3){
            System.out.println("decreasing order");
        }
        else {
            System.out.println("Neither increasing or decreasing  order");
        }

    }
}
