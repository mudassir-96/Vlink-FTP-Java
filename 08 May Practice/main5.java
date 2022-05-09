/*      Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
        Sample data (Monthly compounded) and Output:
        Input the investment amount: 1000
        Input the rate of interest: 10
        Input number of years: 5        */


import java.util.Scanner;
public class main5 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        double investment = sc.nextDouble();
        System.out.print("Input the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Input number of years: ");
        int year = sc.nextInt();

        rate *= 0.01;

        System.out.println("Years    FutureValue");
        for (int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i >= 10) formatter = 18;
            System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate / 12, i));
        }
    }
}