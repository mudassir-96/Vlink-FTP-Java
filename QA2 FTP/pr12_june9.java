/*
        We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B.
        Create an abstract class 'Marks' with an abstract method 'getPercentage'.
        It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage
        of the students. The constructor of student A takes the marks in three subjects as its parameters and
        the marks in four subjects as its parameters for student B.
        Create an object for each of the two classes and print the percentage of marks for both the students.
 */
abstract class Marks{

    abstract public double getPercentage();
}
class A extends Marks{
    public float physics;
    public float math;
    public float chem;

    public A(float physics, float math, float chem) {
        this.physics = physics;
        this.math = math;
        this.chem = chem;
    }

    @Override
    public double getPercentage() {
        return (physics+math+chem)/300*100;
    }
}
class B extends Marks{
    public float physics;
    public float math;
    public float chem;
    public float comp;

    public B(float physics, float math, float chem, float comp) {
        this.physics = physics;
        this.math = math;
        this.chem = chem;
        this.comp = comp;
    }

    @Override
    public double getPercentage() {
        return (physics+math+chem+comp)/400*100;
    }
}
public class pr12_june9 {
    public static void main(String[] args) {
        A harry = new A(55,69, 58);
        B maddy = new B(67, 87, 50, 88);

        System.out.println(harry.getPercentage());
        System.out.println(maddy.getPercentage());

    }
}
