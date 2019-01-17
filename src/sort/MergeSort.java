package sort;

/**
 * java类简单作用描述
 *
 * @ProjectName: algs4
 * @Package:
 * @Description: java类作用描述
 * @Author: 作者姓名
 * @CreateDate: 18-12-9 下午11:29
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 18-12-9 下午11:29
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class MergeSort {


    private static Comparable[] aux;

    /**
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }


    public static void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo)/2;

        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;


        for(int k = lo; k <= hi; k ++) {
            aux[k] = a[k];
        }

        for(int k = lo; k <= hi; k++) {
            if      (i > mid)        a[k] = aux[j++];
            else if (j > hi)         a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                                 a[k] = aux[i++];
        }
    }
    private static Boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private void exch (Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 7, 1, 3, 2};
        sort(a);
        System.out.println(a.toString());
    }
}
