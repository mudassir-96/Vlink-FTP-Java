/*
Write a Java program to check whether a string is pq-balanced or not.
A String is pq-balanced if for all the p's in the string at least one 'q' must exists right of the p's.
But 'q' before the 'p' makes the pq-balanced false. Go to the editor

        Sample Output:

        The given strings is: gfpmpnppqab
        The string is pq-balanced? true

        The given strings is: gfpmpnpqpab
        The string is pq-balanced? false
*/
public class pr7_june9 {
    public static boolean pqBalStr(String str){
        boolean p = false;
        boolean q = false;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='p' && q==true){
                p=true;
                q=false;
            } else if (str.charAt(i) == 'p') {
                p=true;
            }
            else if (str.charAt(i)=='q' && p==true){
                q=true;
            }
        }
        if (p==false){
            q=true;
        }
        return q;
    }
    public static void main(String[] args) {
        String str = "gfpmpnppqab";
        System.out.println("the given string is: "+str);
        System.out.println("is string pq-balanced? "+pqBalStr(str));

    }
}
