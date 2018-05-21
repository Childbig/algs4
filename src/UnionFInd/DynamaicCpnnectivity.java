package UnionFInd;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/5/1
 *  Last updated:  2018/5/1
 *  Compilation:   javac DynamaicCpnnectivity.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class DynamaicCpnnectivity {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(!uf.connected(p, q)) {
                uf.union(p, q);
                StdOut.println(p + "  " + q);
            }
        }
    }
}
