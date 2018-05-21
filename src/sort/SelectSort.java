package sort;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/20
 *  Last updated:  2018/5/20
 *  Compilation:   javac SelectSort.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class SelectSort {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; i++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
        exch(a, i, min);

        }

    }

    public static boolean less (Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
