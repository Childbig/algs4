package bookCode;

import edu.princeton.cs.algs4.Stopwatch;

import java.util.Iterator;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/1/17
 *  Last updated:  2019/1/17
 *  Compilation:   javac ResizingArrayStack.java
 *  Description: 
 *
 ******************************************************************************/


public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty() {  return N == 0;}
    public int size()        {  return N;}
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }
    public void push(Item item) {
        if (N == a.length)  resize(2 * a.length);
        a[N++] = item;
    }
    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }




    @Override
    public Iterator<Item> iterator() {
        return new ResizingArrayStackIterator();
    }

    class ResizingArrayStackIterator implements Iterator<Item> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }
    }
}
