/*  Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a
    class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth
    passed as parameters to its constructor.
 */
class Rectangle{
int length;
int breadth;
Rectangle(int l, int b){
    length = l;
    breadth = b;
}
int Area(){
    int area = length*breadth;
    return area;
}
void display(){
    System.out.println("The area of rectangle is: "+Area());
}
}
public class main_1 {
    public static void main(String[] args) {
        Rectangle myRectangle1 = new Rectangle(4,5);
        Rectangle myRectangle2 = new Rectangle(5,8);

        myRectangle1.display();
        myRectangle2.display();

    }
}
