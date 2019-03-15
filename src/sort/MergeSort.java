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
        if (lo > hi) return;

        int mid = hi - lo / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
       int i = lo;
       int j = mid + 1;

       for (int k = 0; k <= hi; k++)
           aux[k] = a[k];

       for (int k = lo; k <= hi; k++) {
           if       (i > mid)           aux[k] = a[j++];
           else if  (j > hi)            aux[k] = a[i++];
           else if (less(a[j], a[i]))   aux[k] = a[j++];
           else                         aux[k] = a[i++];
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

    /**
     * 自底向上的归并
     * @param a
     */
    public static void iterSort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz -1, N - 1));
            }
        }
    }
}
