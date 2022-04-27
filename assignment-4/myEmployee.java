/*      Write a program that would print the information
        (name, year of joining, salary, address) of three
        employees by creating a class named
        'Employee'. The output should be as follows:
        Name Year of joining Address
        Robert 1994 64C- WallsStreat
        Sam 2000 68D- WallsStreat
        John 1999 26B- WallsStreat  */

package com.mycompany;

public class myEmployee {
    String name;
    int year_of_joining;
    int salary;
    String address;
    void insertRecord(String n, int yoj, int s, String a){
        name=n;
        year_of_joining=yoj;
        salary=s;
        address=a;
    }
    void printInformation(){
        System.out.println("Name|year of Joining|Salary|Address");
        System.out.println(name+"|"+year_of_joining+"|"+salary+"|"+address);
        System.out.println();
    }
    public static void main(String[] args) {
        myEmployee emp1 = new myEmployee();
        myEmployee emp2 = new myEmployee();
        myEmployee emp3 = new myEmployee();

        emp1.insertRecord("Robert", 1994, 10000, "64C-wallsStreat");
        emp2.insertRecord("Sam", 2000, 9000, "68D-WallsStreat");
        emp3.insertRecord("John", 1999, 11000, "26D-WallsStreat");

        emp1.printInformation();
        emp2.printInformation();
        emp3.printInformation();

    }
}
