import java.util.Scanner;
public class wavelength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the wavelength of a color in range of 380 to 750:");
        int wavelength = sc.nextInt();

        if (wavelength>=380 && wavelength<450){
            System.out.println("color is Violet");
        }
        else if (wavelength>=450 && wavelength<495){
            System.out.println("color is Blue");
        }
        else if (wavelength>=495 && wavelength<570){
            System.out.println("color is Green");
        }
        else if (wavelength>=570 && wavelength<590){
            System.out.println("color is Yellow");
        }
        else if (wavelength>=590 && wavelength<620){
            System.out.println("color is Orange");
        }
        else if (wavelength>=620 && wavelength<=750){
            System.out.println("color is Red");
        }
        else {
            System.out.println("Please enter a valid wavelength.");
        }
    }
}
