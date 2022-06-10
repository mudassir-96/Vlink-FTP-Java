/* Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
        If the employee is female, then she will work only in urban areas.

        if employee is a male and age is in between 20 and 40 then he may work in  anywhere

        If the employee is male and age is between 40 t0 60 then he will work in urban areas only.

        And any other input of age should print "ERROR".  */

import java.util.Scanner;

public class pr1_june9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        System.out.println("Please enter your Sex: ");
        char sex = sc.next().charAt(0);

        System.out.println("Please enter your Martial status: ");
        char martial = sc.next().charAt(0);

        if (sex=='F'){
            System.out.println("Madam! You can work in only urban areas.");
        }
        else if (sex=='M' && age>=20 && age<=40){
            System.out.println("Sir! You can work anywhere.");
        }
        else if (sex=='M' && age>=40 && age<=60){
            System.out.println("Sir! You can work in urban areas only.");
        }
        else{
            System.out.println("ERROR");
        }



    }
}
