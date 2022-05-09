//Write a Java program to find the number of days in a month
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the month between 1 to 12: ");
        int month = sc.nextInt();

        if (month==2){
            System.out.println("days in this month are 28/29");
        }
        else if (month==4 || month==6 || month==9 || month==11){
            System.out.println("days in this month are 30");
        }
        else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==12){
            System.out.println("days in this month are 31");
        }
        else{
            System.out.println("please enter the valid input");
        }
    }
}
