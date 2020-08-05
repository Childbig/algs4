package sort;


import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import practice.practice12.EX02;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/3/15
 *  Last updated:  2019/3/15
 *  Compilation:   javac QuickSort.java
 *  Description:   快速排序。
 *
 ******************************************************************************/


public class QuickSort {

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length);
    }


    public static void sort(Comparable[] a, int lo, int hi) {
        if (null == a && a.length == 1) {
            return;
        }

        StdRandom.shuffle(a);
        int j = partation(a , lo, hi);
        sort(a, 0, j - 1);
        sort(a, j + 1, hi);
    }

    public static int partation(Comparable[] a, int lo, int hi) {
        int i= lo;
        int le = lo;
        int ge = hi;

        while (true) {
            while (less(a[i], a[++le]));
            while (less(a[++ge], a[i]));

            if (le > ge) {
                break;
            }

            exch(a, le, ge);
        }
        exch(a, i, le);
        return i;
    }


    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static Boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }


    public static void main(String[] args) {

    }



}
