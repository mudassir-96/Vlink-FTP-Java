import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int cube;
        for (int i=1; i<=n; i++){
            cube = i*i*i;
            System.out.println(cube);
        }

    }
}
