//Write a Java program to increase the size of an array list.
import java.util.ArrayList;
public class pr1_array_list {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>(4);
        num.add(100);
        num.add(59);
        num.add(67);
        num.add(87);

        System.out.println(num);
        num.ensureCapacity(7); // increases the size of array list
        num.add(200);
        num.add(700);
        num.add(567);
        num.add(900);

        System.out.println(num);

    }
}
