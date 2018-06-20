package practice.practice11;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/6/5
 *  Last updated:  2018/6/5
 *  Compilation:   javac EX33.java
 *  Description: 
 *
 ******************************************************************************/


public class EX33 {
    static class Matrix {

        /**
         * 向量点乘
         * @param x
         * @param y
         * @return
         */
        public static double dot(double[] x, double[] y) {
            double multDot = 0;
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x.length; j++) {
                    multDot += x[i] * y[j];
                }
            }
            return multDot;
        }

        /**
         * 矩阵与矩阵之间的乘积
         * @param a
         * @param b
         * @return
         */
        public static double[][] mult(double[][] a, double[][] b) {
            return null;
        }

        /**
         * 转置矩阵
         * @param a
         * @return
         */
        public double[][] tranpose(double[][] a) {
            double[][] transMatri = new double[a.length][a[0].length];



            return null;
        }

        /**
         * 矩阵和向量之乘积
         * @param a
         * @param x
         * @return
         */
        public static double[] mult(double[][] a, double[] x) {
            return null;
        }

        /**
         * 向量和矩阵之乘积
         * @param y
         * @param a
         * @return
         */
        public static double[] mult(double y, double[][] a) {
            return null;
        }

    }
}
