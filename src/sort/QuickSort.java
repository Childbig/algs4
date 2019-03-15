package sort;

import edu.princeton.cs.algs4.StdRandom;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/3/15
 *  Last updated:  2019/3/15
 *  Compilation:   javac QuickSort.java
 *  Description:   快速排序。
 *
 ******************************************************************************/


public class QuickSort {


    public void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo + 5) {InsertSort.sort(a); return;}
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];

        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }


    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }


    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
