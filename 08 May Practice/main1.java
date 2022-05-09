// Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        System.out.println("please enter the 5 num: ");


        int sum=0;
        int num=0;
        for (int i=0; i<5; i++){
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            sum+=num;





        }
        int avg = sum/5;
        System.out.println(sum);
        System.out.println(avg);

    }
}
