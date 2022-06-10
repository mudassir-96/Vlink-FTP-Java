//Write a Java program to replace the second element of a ArrayList with the specified element.
import java.util.ArrayList;
public class pr2_array_list {
    public static void main(String[] args) {
        ArrayList<String> phone = new ArrayList<String>();
        phone.add("Asus");
        phone.add("Realme");
        phone.add("Redmi");
        phone.add("google pixel");

        phone.set(1,"apple"); // replacing the second element of a array list

        for (String i: phone){
            System.out.println(i);
        }
    }
}
