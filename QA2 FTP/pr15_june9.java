/*
        We have to calculate the area of a rectangle, a square and a circle.
        Create an abstract class 'Shape' with three abstract methods namely
        'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
        The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
        Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for
        printing the area of rectangle, square and circle respectively.
        Create an object of class 'Area' and call all the three methods
 */
abstract class Shape{
    public double length;
    public double breadth;
    public double side;
    public double radius;

   abstract public double RectangleArea(double length, double breadth);
   abstract public double SquareArea(double side);
   abstract public double CircleArea(double radius);
}
class Area extends Shape{
    @Override
    public double RectangleArea(double length, double breadth) {
        return length*breadth;
    }

    @Override
    public double SquareArea(double side) {
        return side*side;
    }

    @Override
    public double CircleArea(double radius) {
        return Math.PI*radius*radius;
    }
}
public class pr15_june9 {
    public static void main(String[] args) {
        Area myArea = new Area();

        myArea.length=4;
        myArea.breadth=6;
        myArea.side=4;
        myArea.radius=3.2;

        System.out.println("Area of Rectangle is "+myArea.RectangleArea(myArea.length, myArea.breadth));
        System.out.println("Area of Square is "+ myArea.SquareArea(myArea.side));
        System.out.println("Area of Circle is "+ myArea.CircleArea(myArea.radius));

    }
}
