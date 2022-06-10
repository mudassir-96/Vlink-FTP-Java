/*      An abstract class has a constructor which prints "This is constructor of abstract class",
        an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
        A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
        Now create an object of 'SubClass' and call the abstract method and the non-abstract method.
 */
abstract class ParentClass{
    public ParentClass() {
        System.out.println("This is constructor of abstract class.");
    }
    abstract public void a_method();
    public void nonAbs(){
        System.out.println("This is a normal method of abstract class.");
    }
}
class SubClass extends ParentClass{
    @Override
    public void a_method() {
        System.out.println("This is abstract method.");
    }
}
public class pr13_june9 {
    public static void main(String[] args) {
        SubClass sub = new SubClass();

        sub.a_method();
        sub.nonAbs();

    }
}
