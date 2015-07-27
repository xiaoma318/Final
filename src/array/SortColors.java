package array;

import java.util.Arrays;

/**
 * Created by chengma on 7/26/15.
 */
public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 0, 0, 1, 1, 2, 2, 2, 0};
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int red = 0, white = 0, blue = 0;
        for (int x : nums) {
            switch (x) {
                case 0:
                    red++;
                    break;
                case 1:
                    white++;
                    break;
                case 2:
                    blue++;
                    break;
            }
        }
        int index = 0;
        for (; red > 0; red--) nums[index++] = 0;
        for (; white > 0; white--) nums[index++] = 1;
        for (; blue > 0; blue--) nums[index++] = 2;
    }

    public static void sortColors2(int[] nums) {
        int red = 0, white = 0;
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            nums[i] = 2;
            if (v == 0) {
                nums[white++] = 1;
                nums[red++] = 0;
            } else if (v == 1) {
                nums[white++] = 1;
            }
        }

    }
}
