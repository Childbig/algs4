package practice.practice12;

import edu.princeton.cs.algs4.StdOut;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/6/19
 *  Last updated:  2018/6/19
 *  Compilation:   javac EX04.java
 *  Description: 
 *
 ******************************************************************************/


public class EX04 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}
