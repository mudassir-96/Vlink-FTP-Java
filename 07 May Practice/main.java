import java.util.Scanner;
class Average{
    static int avrg(int a, int b, int c){
        int avg = a+b+c/3;
        return avg;
    }

}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of num1:");
        int a = sc.nextInt();
        System.out.println("please enter the value of num2:");
        int b = sc.nextInt();
        System.out.println("please enter the value of num3:");
        int c = sc.nextInt();

        Average myavg = new Average();
        System.out.println(Average.avrg(a,b,c));

    }
}
