import java.util.Scanner;

/*
Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
        Sample data (Monthly compounded) and Output:
        Input the investment amount: 1000
        Input the rate of interest: 10
        Input number of years: 5

        Expected Output:

        Years    FutureValue
        1            1104.71
        2            1220.39
        3            1348.18
        4            1489.35
        5            1645.31
*/
public class pr8_june9 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyRateOfInterest, int years){
        return investmentAmount * Math.pow((1+monthlyRateOfInterest/100),years);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double monthlyRateOfInterest = sc.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();

        System.out.println("Years     FutureValue");
        for (int  i=1; i<=years; i++){
            int formatter = 19;
            if (i>=10) formatter = 18;
            System.out.printf(i+"%"+formatter+".2f\n", futureInvestmentValue(investmentAmount,monthlyRateOfInterest/12,i));
        }

    }
}
