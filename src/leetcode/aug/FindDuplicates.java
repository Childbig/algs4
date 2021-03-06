package leetcode.aug;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-08-06 19:04
 * @modified By：
 * @Description：
 *
 *
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 *
 * Find all the elements that appear twice in this array.
 *
 * Could you do it without extra space and in O(n) runtime?
 *
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [2,3]
 *
 *
 */
public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                res.add(index + 1);
            nums[index] = -nums[index];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = {4,3,2,7,8,2,3,7};

        findDuplicates(test).forEach(System.out::println);
    }
}
