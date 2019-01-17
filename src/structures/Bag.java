package structures;

import java.util.Iterator;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/1/17
 *  Last updated:  2019/1/17
 *  Compilation:   javac Bag.java
 *  Description: 
 *
 ******************************************************************************/


public class Bag<T> implements Iterable<T> {

    private int n;

    public Bag() {
        n = 0;
    }

    public void add(T t) {

    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    @Override
    public Iterator<T> iterator() {
        return new BagIterator();
    }


    class BagIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
}
