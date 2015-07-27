package array;

import java.util.Arrays;

/**
 * Created by chengma on 7/26/15.
 */
public class NextPermutation {
    public static void main(String[] args) {
        int nums[] = {3,2,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                int j = nums.length - 1;
                for(;j>=i+1;j--){
                    if(nums[j] > nums[i]) break;
                }
                swap(nums, i, j);
                reverse(nums, i+1);
                return;
            }
        }
        reverse(nums, 0);
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static void reverse(int[] nums, int start){
        int end = nums.length - 1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}
