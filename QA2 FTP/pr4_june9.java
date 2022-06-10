/*  Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.

        Example:
        Input :
        nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
        Output:
        Array with every second element is greater than its left and right elements:
        [1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]        */

import java.util.Arrays;

public class pr4_june9 {
    public static void swapNums(int[] nums, int i, int j){
        int temp_nums = nums[i];
        nums[i] = nums[j];
        nums[j] = temp_nums;
    }
    public static int[] rearrangeArrayNums(int[] nums){
        for (int i=1; i<nums.length; i = i+2){
            if (nums[i-1]>nums[i]){
                swapNums(nums,i-1,i);
            }
            else if (i+1<nums.length && nums[i+1]>nums[i]){
                swapNums(nums,i+1,i);
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
        System.out.println(Arrays.toString(nums));
        int[] result = rearrangeArrayNums(nums);
        System.out.println(Arrays.toString(result));

    }
}
