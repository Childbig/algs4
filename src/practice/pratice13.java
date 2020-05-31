package practice;

import edu.princeton.cs.algs4.StdOut;
import structures.Stack;

/**
 * @author ：zhangxuan
 * @date ：Created in 2019-06-17 10:02
 * @modified By：
 * @Description：
 */
public class pratice13 {


    public static void main(String[] args) {
        int N = 50;
        Stack<Integer> stack = new Stack<>();
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        for (int n : stack) StdOut.print(n);
        StdOut.println();
    }
}
