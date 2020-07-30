package thirtyday.array;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-07-22 23:06
 * @modified By：
 * @Description：
 *
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *     The maximum number of consecutive 1s is 3.
 *
 *
 */
public class findMaxConsecutiveOnes {


    public static int findMaxConsecutiveOnes1(int[] nums) {
        int count = 1;
        int result = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length -1) {
               if (nums[i] == nums[i + 1]) {
                   count += 1;
               } else {
                   if (result < count) {
                       result = count;
                   }
                   count = 1;
               }
            }
        }

        return result == 1 ? 0 : result;
    }


    public static void main(String[] args) {

        int[] test = {1, 0, 1,1,0,1};

        System.out.println(findMaxConsecutiveOnes1(test));
    }
}
