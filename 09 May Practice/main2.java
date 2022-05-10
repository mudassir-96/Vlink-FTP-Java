//Write a Java program to divide a string in n equal parts.
import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int temp = 0, chars = str.length()/n;

        String[] newStr = new String [n];

        if(str.length() % n != 0)
        {
            System.out.println("Invalid Input");
            System.out.println("String size is not divisible by "+n);
            System.out.println("Try Again");
        }
        else
        {
            for(int i = 0; i < str.length() ; i = i+chars)
            {
                String part = str.substring(i, i+chars);
                newStr[temp] = part;
                temp++;
            }
            System.out.println("On dividing the entered string into "+ n +" equal parts, we have ");
            for(int i = 0; i < newStr.length; i++)
            {
                System.out.println(newStr[i]);
            }
        }
    }

}
