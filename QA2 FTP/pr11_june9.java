/*      Create an abstract class 'Bank' with an abstract method 'getBalance'.
        $100, $150 and $200 are deposited in banks A, B and C respectively.
        'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
        Call this method by creating an object of each of the three classes.
 */
abstract class Bank{
    public int a;
    public int b;
    public int c;
    abstract public void getBalance();
}
class BankA extends Bank{
    @Override
    public void getBalance() {
        System.out.println("available balance of BankA is "+a);
    }
    public void setBalance(int a){
        this.a=a;
    }
}
class BankB extends Bank{
    @Override
    public void getBalance() {
        System.out.println("available balance of BankB is "+b);
    }
    public void setBalance(int b){
        this.b=b;
    }
}
class BankC extends Bank{
    @Override
    public void getBalance() {
        System.out.println("available balance of BankC is "+c);
    }
    public void setBalance(int c){
        this.c=c;
    }
}
public class pr11_june9 {
    public static void main(String[] args) {
        BankA myBankA = new BankA();
        BankB myBankB = new BankB();
        BankC myBankC = new BankC();

        myBankA.setBalance(100);
        myBankB.setBalance(150);
        myBankC.setBalance(200);

        myBankA.getBalance();
        myBankB.getBalance();
        myBankC.getBalance();

    }
}
