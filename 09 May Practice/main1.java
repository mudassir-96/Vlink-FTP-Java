/*      Write a Java application that allows the user to enter up to 20 integer grades into an array.
        Stop the loop by typing in ‐1. Your main method should call an Average method that returns the average of the grades.
        Use the DecimalFormat class to format the average to 2 decimal places. */
import java.util.Scanner;
public class main1 {
    static int Average(int[] grade){
        int sum =0;
        int avg =0;
        for (int i=0; i< grade.length; i++){
            sum = sum + i;
            avg = sum/grade.length;
        }
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] grade = new int[20];

        for (int i=0; i<20; i++){
            System.out.println("enter the value of grades");
            grade[i] = sc.nextInt();
            if (grade[i]==-1){
                break;
            }

        }
        System.out.println(Average(grade));
    }
}
