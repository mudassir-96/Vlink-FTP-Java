// Write a Java program to print all the elements of a ArrayList using the position of the elements.
import java.util.ArrayList;
public class pr3_array_list {
    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<String>();

        lang.add("Python");
        lang.add("java");
        lang.add("C#");
        lang.add("Ruby");
        lang.add("C++");

        for (int i=0; i<lang.size(); i++){
            System.out.println(i+ " "+ lang.get(i));
        }
    }
}
