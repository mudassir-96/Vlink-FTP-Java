/*      Define bank class, its Childs are ICICI,SBI, AXIS and define rateofinterest
        method and return the interest.
        o Principal amount 10000 and tenure 3 years, calculate Simple
        interest for all three banks.   */



class bank{
    float principle;
    float rate;
    float time;
    void insertRecord(float p, float r, float t){
        principle = p;
        rate = r;
        time = t;
    }
    int rateofinterest(float p, float r, float t){
        float si;
        si = p*r*t/100;
        return (int) si;
    }

}
class ICICI extends bank{

    }

class AXIS extends bank{

}
public class main2 {
    public static void main(String[] args) {

        ICICI myicici = new ICICI();
        myicici.insertRecord(1000,8,3);
        System.out.println(myicici.rateofinterest(10000,8,3));

        AXIS myaxix = new AXIS();
        System.out.println(myaxix.rateofinterest(10000, 6, 2));

    }
}
