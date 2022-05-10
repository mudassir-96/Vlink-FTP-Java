// Write an application that reads two integers, determines whether the first is a multiple of the second
// and prints the result.
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of first number: ");
        int num1 = sc.nextInt();
        System.out.println("enter the value of second number: ");
        int num2 = sc.nextInt();

        int a = num1%num2;

        if (a==0){
            System.out.println("first number is the multiple of second number");
        }
        else {
            System.out.println("the first number is not multiple of second number");
        }
    }
}
