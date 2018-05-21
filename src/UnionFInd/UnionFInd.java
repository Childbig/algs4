package UnionFInd;

import com.sun.xml.internal.bind.v2.model.core.ID;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/1
 *  Last updated:  2018/5/1
 *  Compilation:   javac UnionFInd.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class UnionFInd {

        private int[] id;

        private UnionFInd(int N) {
            id = new int[N];
            for ( int i = 0; i < N; i ++) id[i] = i;
        }

        private int root(int i) {
            while (i != id[i]) {
                i = id[id[i]];
                i = id[i];
            }
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
