package practice.practice12;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/6/19
 *  Last updated:  2018/6/19
 *  Compilation:   javac EX02.java
 *  Description:    编写一个Interval1D的用例，从命令行接受一个整数N。 从标准输入中读取N个                   间隔（每个间隔由一对double值定义）并打印出所有相交的间隔对。
 *
 ******************************************************************************/


public class EX02 {
    public static void main(String[] args) {
        if (!StdIn.isEmpty()) {
            int N = StdIn.readInt();
            Interval1D[] interval1D = new Interval1D[N];

            for (int i = 0; i < N; i++) {
                interval1D[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
            }

            for (int i = 0; i < N - 1; i++) {
                for (int j = 1; j < N; j++) {
                    if (interval1D[i].intersects(interval1D[j])) {
                        StdOut.print(interval1D[i] + "is interval " + interval1D[j]);
                    }
                }
            }



        }
    }
}
