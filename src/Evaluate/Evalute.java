package Evaluate;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/20
 *  Last updated:  2018/5/20
 *  Compilation:   javac Evalute.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class Evalute {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if      (s.equals("("));
            else if (s.equals("+"))     ops.push(s);
            else if (s.equals("*"))     ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                if      (op.equals("+")) vals.push(vals.pop() + vals.pop());
                else if (op.equals("*")) vals.push(vals.pop() + vals.pop());
            }
            else vals.push(Double.parseDouble(s));

        }
        StdOut.println(vals.pop());
    }

}
