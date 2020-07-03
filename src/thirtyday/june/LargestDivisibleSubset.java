package thirtyday.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-06-28 19:30
 * @modified By：
 * @Description：Given a set of distinct positive integers,
 * find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies:
 *
 * Si % Sj = 0 or Sj % Si = 0.
 *
 * If there are multiple solutions, return any subset is fine.
 *
 *
 * 一组不同的正整数,找到最大子集,使得该子集中的每个元素(Si, Sj) 都满足
 * Si % Sj = 0 or Sj % Si = 0.
 * 如果包含多个结果可以返回任意一个
 *
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2] (of course, [1,3] will also be ok)
 *
 *
 * Example 2:
 * Input: [1,2,4,8]
 * Output: [1,2,4,8]
 *
 */
public class LargestDivisibleSubset {

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums.length == 0) return result;

        int[] dp = new int[nums.length];
        int[] parent = new int[nums.length];
        int maxNum = 0;
        int maxIndex = -1;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            parent[i] = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % nums[i] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;

                    if (dp[i] > maxNum) {
                        maxNum = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }
        while (maxNum-- > 0) {
            result.add(nums[maxIndex]);
            maxIndex = parent[maxIndex];
        }

        return result;
    }


    public static void main(String[] args) {
        int[] test = {3, 2, 1};
        largestDivisibleSubset(test).stream().forEach(v -> System.out.println(v));
    }

}
