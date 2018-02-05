package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by huali on 2018/2/4.
 */
public class GetLeastNumbers_OlogKTreeSet {
    public TreeSet<Integer> GetLeastNumbers(int[] input, int k) {

        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int j = 0; j < input.length; j++) {
            if (set.size() < k) {
                set.add(input[j]);
            } else {
                // TreeSet中的元素大于K个
                if (set.last() > input[j]) {// 最大的元素大于array[i]
                    set.pollLast();// 移除
                    set.add(input[j]);// 加入新的
                }

            }
        }

        return set;
    }

    //直接使用sort排序！！！
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || k <= 0 || k > input.length) {
            return res;
        }
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }


}