package UnionFInd;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/1
 *  Last updated:  2018/5/1
 *  Compilation:   javac QuickUniomUF.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class QuickUniomUF {
    private int[] id;

    private QuickUniomUF(int N) {
        id = new int[N];
        for ( int i = 0; i < N; i ++) id[i] = i;
    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
