package leetcode.aug;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-08-04 19:23
 * @modified By：
 * @Description：
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * Input: 16
 * Output: true
 *
 * Input: 5
 * Output: false
 *
 *
 * Follow up: Could you solve it without loops/recursion?
 */
public class PowerOfFour {

    public static boolean isPowerOfFour(int num) {
        if (num < 4) {
            return false;
        }

        while (num > 1) {
            int mod = num % 4;
            if (mod != 0) {
                return  false;
            }
            num = num / 4;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfFour(9));
    }
}
