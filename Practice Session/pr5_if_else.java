// Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
import java.util.Scanner;
public class pr5_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number: ");
        long num = sc.nextLong();

        if (num>=10000000000l){
            System.out.println("number is greater than or equal to 10 Billion");
        }
        else if (num<10000000000l){
            int digitCount=0;
            if (num>=1 && num<10){
                digitCount=1;
            }
            else if (num>=10 && num<100){
                digitCount=2;
            }
            else if (num>=100 && num<1000){
                digitCount=3;
            }
            else if (num>=1000 && num<10000){
                digitCount=4;
            }
            else if (num>=10000 && num<100000){
                digitCount=5;
            }
            else if (num>=100000 && num<1000000){
                digitCount=6;
            }
            else if (num>=1000000 && num<10000000){
                digitCount=7;
            }
            else if (num<10000000 && num<100000000){
                digitCount=8;
            }
            else if (num>=100000000 && num<1000000000){
                digitCount=9;
            }
            else if (num>=1000000000 && num<10000000000l){
                digitCount=10;
            }
            else {
                System.out.println("please enter the positive integer.");
            }
            System.out.println("number of digits: "+digitCount);

        }
    }
}
