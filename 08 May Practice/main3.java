//Write a Java program that reads a positive integer and count the number of digits the number has.
import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int count=0;

        if (n<0){
            System.out.println("invalid input");
        }
        else if (n==0){
            System.out.println(1);
        }
        else {
            while (n>0){
                count++;
                n = n/10;
            }
        }
        System.out.println(count);
    }
}
