package practice.practice11;

import edu.princeton.cs.algs4.StdDraw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/6/5
 *  Last updated:  2018/6/5
 *  Compilation:   javac EX32.java
 *  Description: 
 *
 ******************************************************************************/


public class EX32 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        while (scanner.hasNextDouble()) {
            list.add(scanner.nextDouble());
        }

        int N = 10;
        double r = 0.1;
        double l = 0.2;

        int[] num = new int[N];
        int max = 0;
        double step = (r - l) / N;
        for (int i = 0; i < list.size(); i++) {
            double element = list.get(i);
            if (element >= l && element <= r) {
                for (int j = 0; j < N; j++) {
                    if (element > l + step * j && element <= l + step * j + step) {
                        num[j]++;
                        if (max < num[j]) {
                            max = num[j];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            double x = (1.0 * i + 0.5) / N;
            double y = num[i] / (max * 2.0);
            double rw = 0.4 / N;
            StdDraw.filledRectangle(x, y, rw, y);
        }



    }
}
