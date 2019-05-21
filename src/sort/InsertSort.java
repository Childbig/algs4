package sort;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Random;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/20
 *  Last updated:  2018/5/20
 *  Compilation:   javac InsertSort.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class InsertSort {
    public static void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j -1]); j--) {
                exch(a, j, j-1);
            }
        }

    }

    private static Boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch (Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }




    public static void main(String[] args) {
        String[] a = {"S", "H","E", "L","L","S","O","R","T","E", "A"};
        sort(a);
        for (String s : a)
            System.out.println(s);
    }
}
