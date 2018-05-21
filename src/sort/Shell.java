package sort;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/20
 *  Last updated:  2018/5/20
 *  Compilation:   javac Shell.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class Shell {
    public static void sort(Comparable[] a) {
        int N = a.length;

        int h = 1;
        while (h < N/3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j >= h && less(a[j], a[j - h]); j -=h) {
                    exch(a, j, j - h);
                }
            }
        }

    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[j];
        a[i] = a[j];
        a[j] = swap;
    }

}
