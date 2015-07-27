package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chengma on 7/26/15.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows <= 0) return res;
        res.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            List<Integer> newItem = new ArrayList<>();
            newItem.add(1);
            for(int j=0;j<res.get(i-1).size()-1;j++){
                newItem.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
            }
            newItem.add(1);
            res.add(newItem);
        }
        return res;

    }
}
