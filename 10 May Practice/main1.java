import java.util.Scanner;
interface in1{
    void display(int p);
}
class testClass implements in1{
    boolean isPrime(int n){
        if (n==1 || n==0){
            return false;
        }
        for (int i=2; i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public void display(int k){
        int count = 0;
        for (int i=2;i<=k;i++){
            if (isPrime(i)){
                count++;
            }
        }
        System.out.println(count);

    }
}
public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int t = sc.nextInt();
        while (t-->0){
            int k = sc.nextInt();
            testClass myTestClass = new testClass();
            myTestClass.display(k);
        }

    }
}
