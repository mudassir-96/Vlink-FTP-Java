// Write a program to find the prime factor of a number.If a factor of a number is prime number then it is its prime factor.
import java.util.Scanner;
public class main_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int num = sc.nextInt();
        boolean prime = false;

        for (int i=2; i<=num; i++){
            while(num%i == 0) {
                System.out.println(i+" ");
                num = num/i;
            }

        }
        if (num>2){
            System.out.println(num);
        }


    }
}
