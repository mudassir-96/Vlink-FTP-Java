/*  Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object.
    The Matrix class has the following information:
    1 - number of rows of matrix
    2 - number of columns of matrix
    3 - elements of matrix in the form of 2D array
 */
import java.util.Scanner;
class Matrix{
    public int rows;
    public int columns;
    int [] [] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values in matrix:");
        for (int i=0; i<this.rows; i++){
            for (int j=0; j<this.columns; j++){
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void printMatrix(){
        for (int i=0; i<this.rows; i++){
            for (int j=0; j<this.columns; j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }

    }
}
public class pr_9_matrix_class {
    public static void main(String[] args) {
        Matrix mat = new Matrix(2,2);
        mat.insert();
        mat.printMatrix();
        System.out.println("number of rows "+mat.getRows());
        System.out.println("number of columns "+mat.getColumns());

    }
}
