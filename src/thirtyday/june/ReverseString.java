package thirtyday.june;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-06-05 11:02
 * @modified By：
 * @Description：
 *
 *
 * Write a function that reverses a string.
 * The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 */
public class ReverseString {

    /**
     * 反转字符串
     * @param s
     */
    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }


    private static void helper(char[]s, int left, int right) {
        if (left >= right) return;
        char temp = s[right];
        s[left++] = s[right];
        s[right--] = temp;
        helper(s, left, right);
    }

    public static void main(String[] args) {

        String s  = "hello";
        reverseString(s.toCharArray());

    }
}
