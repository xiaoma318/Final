package array;

/**
 * Created by chengma on 7/26/15.
 */
public class RemoveElement {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int x : nums){
            if(x != val){
                nums[idx++] = x;
            }
        }
        return idx;
    }
}
