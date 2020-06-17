package thirtyday.june;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-06-12 10:31
 * @modified By：
 * @Description：
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 *
 *
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 *
 * Input: 218
 * Output: false
 *
 */
public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {

//        if (n == 0) return true;
//
//        String binyN = Integer.toBinaryString(n);
//        int count = 0;
//        for (char c : binyN.toCharArray()) {
//            if (c == '0') {
//                count++;
//            }
//        }
//
//        if (count == binyN.length() -1) {
//            return true;
//        } else {
//            return false;
//        }

        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(64));
        System.out.println(isPowerOfTwo(18));
    }
}
