/*      o 54322345
        o 543345
        o 5445
        o 55
        o Make this pattern  */

public class pattern {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=5; j>=i; j--){
                System.out.print(j+"");
            }
            System.out.println();
        }


    }
}
