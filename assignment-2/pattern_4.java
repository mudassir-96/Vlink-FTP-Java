/* Write program to print pattern. (not completed)
        1
        22
        333
        4444
        55555 */
package com.mycompany;

public class pattern_4 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
