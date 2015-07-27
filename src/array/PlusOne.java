package array;

/**
 * Created by chengma on 7/26/15.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
        }
        int res[] = new int[digits.length+1];
        res[0] =1;
        return res;
    }


}
