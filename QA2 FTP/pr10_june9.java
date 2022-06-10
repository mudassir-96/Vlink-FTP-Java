/*     Create an abstract class 'Parent' with a method 'message'.
        It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and
        "This is second subclass" respectively.
        Call the methods 'message' by creating an object for each subclass.
 */
abstract class Parent{
    abstract public void message();
}
class Child1 extends Parent{
    @Override
    public void message() {
        System.out.println("This is first subclass.");
    }
}
class Child2 extends Parent{
    @Override
    public void message() {
        System.out.println("This is second subclass.");
    }
}
public class pr10_june9 {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        ch1.message();
        ch2.message();
    }
}
