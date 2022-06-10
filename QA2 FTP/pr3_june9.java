// Write a Java program to compute the average value of an array of integers except the largest and smallest values.

public class pr3_june9 {
    public static void main(String[] args) {
        int[] array = {4, 7, 3, 5, 9};

        int max = array[0];
        int min = array[0];
        float sum = array[0];

        for (int i=1; i<array.length; i++){
            sum = sum + array[i];

            if (array[i]>max){
                max = array[i];
            }
            else if (array[i]<min){
                min = array[i];
            }
        }
        float avg = ((sum-max-min)/(array.length-2));
        System.out.println("Average value of an array is: "+avg);

    }
}
