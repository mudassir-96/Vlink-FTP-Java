/*      Write a program to print the names of students by creating a Student class.
        If no name is passed while creating an object of Student class, then the name should be "Unknown",
        otherwise the name should be equal to the String value passed while creating object of Student class.
 */
class Student{
    String name;
    public Student() {
        name="Unknown";
    }

    public Student(String name) {
        this.name = name;
    }
}
public class pr16_june9 {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.name);

        Student st1 = new Student("Maddy");
        System.out.println(st1.name);

    }
}
