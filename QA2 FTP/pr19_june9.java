/*
Write a Java program to check whether the character immediately before and after a specified character is the same in a given string.
        The given string is: moon#night
        The before and after character are same: true
*/
public class pr19_june9 {
    public static boolean leftAndRightSame(String str){
        boolean found = true;
        for (int i=0; i<str.length(); i++){
            String tempStr = str.substring(i,i+1);
            if (tempStr.equals("#") && i>0 && i<str.length()-1){
                if (str.charAt(i-1)==str.charAt(i+1)){
                    found=true;
                }
                else {
                    found=false;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        String str = "moon#night";
        System.out.println("given string is: "+str);
        System.out.println("is character same before and after: "+leftAndRightSame(str));


    }
}
