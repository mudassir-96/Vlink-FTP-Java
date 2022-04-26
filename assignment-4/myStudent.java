/*      Assign and print the roll number, phone number and address of two students having names
        "Sam" and "John" respectively by creating two objects of class 'Student'.  */

package com.mycompany;

public class myStudent {
    int roll_num;
    long phone_num;
    String address;

    void insertRecord(int r, long p, String a){
        roll_num=r;
        phone_num=p;
        address=a;
    }
    void display(){
        System.out.println("The roll number is " +roll_num+ " phone number " +phone_num+" & address " +address);
    }

    public static void main(String[] args) {
        myStudent John = new myStudent();
        myStudent Sam = new myStudent();

        Sam.insertRecord(102, 814961250,"parli");
        John.insertRecord(103, 705837701, "Beed");
        Sam.display();
        John.display();

    }
}


