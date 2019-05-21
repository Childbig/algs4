package sort;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/3/15
 *  Last updated:  2019/3/15
 *  Compilation:   javac Quick3way.java
 *  Description: 
 *
 ******************************************************************************/


public class Quick3way {
    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo > hi) return;

        int le = lo, i = lo + 1, gt = hi;

        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);

            if (cmp < 0)    exch(a, i++, le++);
            else if (cmp > 0)    exch(a, i, gt++);
            else                 i++;
        }
        exch(a, lo, le - 1);
        exch(a, gt + 1, hi);

    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
