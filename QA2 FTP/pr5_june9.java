import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
        Example:
        Input :
        int[] A = { 1, 5, 6, 7, 8, 10 }
        int[] B = { 2, 4, 9 }
        Output:
        Sorted Arrays:
        A: [1, 2, 4, 5, 6, 7]
        B: [8, 9, 10]
*/
public class pr5_june9 {
    public static void mergeSort(int[] A, int[] B, int p, int q){
        for (int i=0; i<p; i++){
            if (A[i]>B[0]){
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;

                int firstArray = B[0];
                int k;
                for (k=1; k<q && B[k] < firstArray; k++){
                    B[k-1]=B[k];
                }
                B[k-1]=firstArray;
            }
        }
    }
    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2,4,9};
        int p = A.length;
        int q = B.length;

        System.out.println("Sorted Array: ");
        System.out.println("A: "+ Arrays.toString(A));
        System.out.println("B: "+ Arrays.toString(B));

        mergeSort(A,B,p,q);

        System.out.println("Unsorted Array: ");
        System.out.println("A: "+Arrays.toString(A));
        System.out.println("B: "+Arrays.toString(B));

    }
}
