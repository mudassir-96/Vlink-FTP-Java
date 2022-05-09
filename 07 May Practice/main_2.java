//Write a program in java to find the sum of the even and odd digits of the number which is given as input.

import java.util.Scanner;
public class main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int num = sc.nextInt();

        int evensum=0;
        int oddsum=0;

        for (int i=0; i<=num; i++){
            if (i%2==0){
                evensum = evensum + i;
            }
            else{
                oddsum = oddsum + i;
            }
        }

        System.out.println("The sum of even digits is "+ evensum+ " and sum of odd digits is " +oddsum);
    }
}
