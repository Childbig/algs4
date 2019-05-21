package sort;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

/**
 * @author ：zhangxuan
 * @date ：Created in 2019-05-17 16:29
 * @modified By：
 * @Description：
 */
public class TraceSelect {

    /**
     * 插入排序
     * @param a
     */
    public static void sort(String[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (less(a[j], a[j])) {
                    min = j;
                }
            }
            draw(a, i, i, min);
            exch(a, i, min);
        }
    }

    // exchange a[i] and a[j]
    private static void exch(String[] a, int i, int j) {
        String swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // is v < w ?
    private static boolean less(String v, String w) {
        return v.compareTo(w) < 0;
    }

    // exchange a[i] and a[j]
    private static void draw(String[] a, int row, int ith, int min) {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(-2.50, row, ith + "");
        StdDraw.text(-1.25, row, min + "");
        for (int i = 0; i < a.length; i++) {
            if (i == min)     StdDraw.setPenColor(StdDraw.BOOK_RED);
            else if (i < ith) StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            else              StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.text(i, row, a[i] + "");
        }
    }


    // display header
    private static void header(String[] a) {
        int n = a.length;

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(n/2.0, -3, "a[ ]");
        for (int i = 0; i < n; i++)
            StdDraw.text(i, -2, i + "");
        StdDraw.text(-2.50, -2, "i");
        StdDraw.text(-1.25, -2, "min");
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.line(-3, -1.65, n - 0.5, -1.65);
        StdDraw.setPenColor(StdDraw.BLACK);
        for (int i = 0; i < a.length; i++)
            StdDraw.text(i, -1, a[i]);
    }

    // display footer
    private static void footer(String[] a) {
        int n = a.length;
        StdDraw.setPenColor(StdDraw.BLACK);
        for (int i = 0; i < n; i++)
            StdDraw.text(i, n, a[i]);
    }

    public static void main(String[] args) {
        String s = "adskadnskabdhundbsyvdsnvhsdghdnw";
        int n = s.length();

        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = s.substring(i, i+1);

        StdDraw.setCanvasSize(30 * (n + 3), 30 * (n + 3));
        StdDraw.setXscale(-3, n + 1);
        StdDraw.setYscale(n + 1, -3);
        StdDraw.setFont(new Font("Scanserif", Font.PLAIN, 13));

        // draw the header
        header(a);

        // sort the array
        sort(a);

        // draw the footer
        footer(a);
    }
}

