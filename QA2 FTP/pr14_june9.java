/*      Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
        Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs'
        which prints "Dogs bark", both inheriting the class 'Animals'.
        Now create an object for each of the subclasses and call their respective methods.
 */
abstract class Animals{
    abstract public void cats();
    abstract public void dogs();
}
class Cats extends Animals{
    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {

    }
}
class Dogs extends Animals{
    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }

    @Override
    public void cats() {

    }
}
public class pr14_june9 {
    public static void main(String[] args) {
        Cats myCat = new Cats();
        Dogs myDog = new Dogs();

        myCat.cats();
        myDog.dogs();

    }
}
