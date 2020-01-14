package bookCode;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author ：zhangxuan
 * @date ：Created in 2019-06-15 14:30
 * @modified By：
 * @Description：
 */
public class Filps {
    public static void main(String[] args) {
        int T = Integer.parseInt("1000000000");
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int t = 0; t < T; t++) {
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else tails.increment();
        }

        StdOut.print(heads);
        StdOut.print(tails);
        int d = heads.tally() - tails.tally();
        StdOut.println("delta: " + Math.abs(d));
    }
}
