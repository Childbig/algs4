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

       while (h < N / 3) h = 3 * h + 1;

       while (h >= 1) {
           for (int i = h; i < N; i++) {
               for (int j = i; j >= h && less(a[j], a[j-h]); j-=h) {
                   exch(a, j, j - h);
               }
           }
           h = h / 3;
       }

        for (Comparable str: a) {
            System.out.print(str);
        }
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[j];
        a[j] = a[i];
        a[i] = swap;
    }

    public static void main(String[] args) {
        String[] a = {"S", "H","E", "L","L","S","O","R", "T", "E", "A", "T", "M", "V" ,"Y","U"};
        sort(a);
    }

}
